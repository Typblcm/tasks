package org.api.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class GetBetSlipDataCLRequest {
    public Object barcode;
    public String bookingCode;
    @JsonProperty("OrderId")
    public Object orderId;
}
