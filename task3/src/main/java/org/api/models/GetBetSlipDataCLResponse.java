package org.api.models;

import lombok.Data;
import lombok.ToString;

@ToString
public class GetBetSlipDataCLResponse {
    public Result result;
    public Object data;
    public Object dataStructure;
    public Object additionalData;
    public Object userInfo;
    public boolean isSuccessfull;

    @ToString
    public static class Result{
        public Object errorDescription;
        public Object additionalInfo;
        public Object eventData;
        public Object closedOdds;
        public int errorCode;
        public int resultCode;
        public String errorCodeDescription;
    }
}
