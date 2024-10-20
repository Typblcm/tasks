package org.ui;

import lombok.extern.slf4j.Slf4j;
import org.testng.annotations.Test;
import org.ui.pageobject.MainPage;

import static com.codeborne.selenide.Selenide.open;

@Slf4j
public class Task2Tests extends BaseTests {


//    """
//    Task #2 (UI)
//        1. Navigate to: https://s.gsb.co.zm/
//        2. Choose "Upcoming" tab
//        3. Search for all events, which have odds value between 1.5 - 3.34
//        4. Print filtered events, add validation //todo What validation needed here?
//    """
    @Test
    public void testTask2() {
        var mainPage = open("https://s.gsb.co.zm/", MainPage.class);
        var upcoming = mainPage.openUpcoming();
        var eventRows = upcoming.getEventRows();
        eventRows.forEach((key, value) -> {
            var result = value.stream().anyMatch(
                    odd ->  {
                        var oddValue = Double.parseDouble(odd.text());
                        return 1.5 < oddValue && oddValue < 3.34;
                    }
            );
            if (result){
               log.info("Event: " + key + " has odds between 1.5 and 3.34. Odds: " + value.texts());
            }
        });
    }
}
