package com.exadatum.xml.splitter.model;

import com.exadatum.xml.splitter.utils.Constants;

public class WORK_TIME_BREAK {

    private String EmployeeWorkTime_SK;
    private String BreakSeqNbr;
    private String BreakStartTs;
    private String BreakEndTs;
    private String DW_BATCH_ID;
    private String DW_CREATE_TS;
    private String DW_CREATE_USER_ID;
    private String DW_LAST_UPDATE_TS;
    private String DW_LAST_UPDATE_USER_ID;
    private String DW_LOGICAL_DELETE_IND;


    public String getEmployeeWorkTime_SK() {
        return EmployeeWorkTime_SK;
    }

    public void setEmployeeWorkTime_SK(String employeeWorkTime_SK) {
        EmployeeWorkTime_SK = employeeWorkTime_SK;
    }

    public String getBreakSeqNbr() {
        return BreakSeqNbr;
    }

    public void setBreakSeqNbr(String breakSeqNbr) {
        BreakSeqNbr = breakSeqNbr;
    }

    public String getBreakStartTs() {
        return BreakStartTs;
    }

    public void setBreakStartTs(String breakStartTs) {
        BreakStartTs = breakStartTs;
    }

    public String getBreakEndTs() {
        return BreakEndTs;
    }

    public void setBreakEndTs(String breakEndTs) {
        BreakEndTs = breakEndTs;
    }

    public String getDW_BATCH_ID() {
        return DW_BATCH_ID;
    }

    public void setDW_BATCH_ID(String DW_BATCH_ID) {
        this.DW_BATCH_ID = DW_BATCH_ID;
    }

    public String getDW_CREATE_TS() {
        return DW_CREATE_TS;
    }

    public void setDW_CREATE_TS(String DW_CREATE_TS) {
        this.DW_CREATE_TS = DW_CREATE_TS;
    }

    public String getDW_CREATE_USER_ID() {
        return DW_CREATE_USER_ID;
    }

    public void setDW_CREATE_USER_ID(String DW_CREATE_USER_ID) {
        this.DW_CREATE_USER_ID = DW_CREATE_USER_ID;
    }

    public String getDW_LAST_UPDATE_TS() {
        return DW_LAST_UPDATE_TS;
    }

    public void setDW_LAST_UPDATE_TS(String DW_LAST_UPDATE_TS) {
        this.DW_LAST_UPDATE_TS = DW_LAST_UPDATE_TS;
    }

    public String getDW_LAST_UPDATE_USER_ID() {
        return DW_LAST_UPDATE_USER_ID;
    }

    public void setDW_LAST_UPDATE_USER_ID(String DW_LAST_UPDATE_USER_ID) {
        this.DW_LAST_UPDATE_USER_ID = DW_LAST_UPDATE_USER_ID;
    }

    public String getDW_LOGICAL_DELETE_IND() {
        return DW_LOGICAL_DELETE_IND;
    }

    public void setDW_LOGICAL_DELETE_IND(String DW_LOGICAL_DELETE_IND) {
        this.DW_LOGICAL_DELETE_IND = DW_LOGICAL_DELETE_IND;
    }


    @Override
    public String toString() {
        return EmployeeWorkTime_SK + Constants.FIELD_SEPERATOR +
               BreakSeqNbr + Constants.FIELD_SEPERATOR +
               BreakStartTs + Constants.FIELD_SEPERATOR +
               BreakEndTs + Constants.FIELD_SEPERATOR +
               DW_BATCH_ID + Constants.FIELD_SEPERATOR +
               DW_CREATE_TS + Constants.FIELD_SEPERATOR +
               DW_CREATE_USER_ID + Constants.FIELD_SEPERATOR +
               DW_LAST_UPDATE_TS + Constants.FIELD_SEPERATOR +
               DW_LAST_UPDATE_USER_ID + Constants.FIELD_SEPERATOR +
               DW_LOGICAL_DELETE_IND
               ;
    }
}
