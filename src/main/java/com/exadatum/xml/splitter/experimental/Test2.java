package com.exadatum.xml.splitter.experimental;

import java.util.ArrayList;
import java.util.List;

public class Test2 {

   /*        columnList.add("AlternateDocumentID");
        columnList.add("CreationDt");
        columnList.add("Description");
        columnList.add("DocumentID");
        columnList.add("DocumentNm");
        columnList.add("ExternalTargetInd");
        columnList.add("GatewayNm");
        columnList.add("InboundOutboundInd");
        columnList.add("InterchangeDate");
        columnList.add("InterchangeTime");
        columnList.add("InternalFileTransferInd");
        columnList.add("Note");
        columnList.add("ReceiverId");
        columnList.add("RoutingSystemNm");
        columnList.add("SenderId");
        columnList.add("SourceApplicationCd");
        columnList.add("TargetApplicationCd");
        columnList.add("ActionTypeCd");
        columnList.add("RecordTypeCd");
        columnList.add("AlternateId");
        columnList.add("EmployeeId");
        columnList.add("Duration");
        columnList.add("EndTs");
        columnList.add("InclusiveInd");
        columnList.add("StartTs");
        columnList.add("FamilyNm");
        columnList.add("FormattedNm");
        columnList.add("GenerationAffixCd");
        columnList.add("GivenNm");
        columnList.add("MaidenNm");
        columnList.add("MiddleNm");
        columnList.add("NickNm");
        columnList.add("PreferredSalutationCd");
        columnList.add("QualificationAffixCd");
        columnList.add("TitleCd");
        columnList.add("EmployeeTypeCd");
        columnList.add("JobCd");
        columnList.add("JobTitleNm");
        columnList.add("ShiftBreak");
        columnList.add("BreakEndTs");
        columnList.add("BreakStartTs");
        columnList.add("BreakType");
        columnList.add("WageGroupCd");
        columnList.add("WageType");
        columnList.add("WorkDayOfWk");
        columnList.add("WorkDt");
        columnList.add("AlternateId");
        columnList.add("DepartmentId");
        columnList.add("AddressLine1txt");
        columnList.add("AddressLine2txt");
        columnList.add("AddressUsageTypeCd");
        columnList.add("CityNm");
        columnList.add("CountryCd");
        columnList.add("CountyNm");
        columnList.add("FaxNbr");
        columnList.add("LatitudeDegree");
        columnList.add("LongitudeDegree");
        columnList.add("PhoneNbr");
        columnList.add("PostalZoneCd");
        columnList.add("StateCd");
        columnList.add("TimeZoneCd");
        columnList.add("FacilityID");
        columnList.add("FacilityName");
        columnList.add("FacilityType");
        columnList.add("OrgEntityNm");
        columnList.add("OrgEntityType");
        columnList.add("OrgEntityValue");
        columnList.add("ParentFacilityId");
        columnList.add("ShiftDt");
        columnList.add("ShiftDurationHrs");
        columnList.add("ShiftEndTs");
        columnList.add("ShiftId");
        columnList.add("ShiftJob");
        columnList.add("ShiftJobCd");
        columnList.add("ShiftJobTitleNm");
        columnList.add("ShiftStartTs");
        columnList.add("WorkWeekEndDay");
        columnList.add("WorkWeekEndDt");
        columnList.add("WorkWeekStartDay");
        columnList.add("WorkWeekStartDt");*/



    public static void main(String[] args) {
        List<String> columnList=new ArrayList<>();





        columnList.add("AlternateDocumentID");
        columnList.add("CreationDt");
        columnList.add("InternalFileTransferInd");
        columnList.add("ActionTypeCd");
        columnList.add("RecordTypeCd");
        columnList.add("DepartmentId");
        columnList.add("AddressLine1txt");
        columnList.add("AddressLine2txt");
        columnList.add("AddressUsageTypeCd");
        columnList.add("CityNm");
        columnList.add("CountryCd");
        columnList.add("CountyNm");
        columnList.add("FaxNbr");
        columnList.add("LatitudeDegree");
        columnList.add("LongitudeDegree");
        columnList.add("PhoneNbr");
        columnList.add("PostalZoneCd");
        columnList.add("StateCd");
        columnList.add("TimeZoneCd");
        columnList.add("FacilityID");
        columnList.add("FacilityName");
        columnList.add("FacilityType");
        columnList.add("OrgEntityNm");
        columnList.add("OrgEntityType");
        columnList.add("OrgEntityValue");
        columnList.add("ParentFacilityId");
        columnList.add("AbsenceType");
        columnList.add("EmployeeId");
        columnList.add("EmployeeNm");
        columnList.add("Duration");
        columnList.add("EndTs");
        columnList.add("InclusiveInd");
        columnList.add("StartTs");
        columnList.add("FamilyNm");
        columnList.add("FormattedNm");
        columnList.add("GenerationAffixCd");
        columnList.add("GivenNm");
        columnList.add("MaidenNm");
        columnList.add("MiddleNm");
        columnList.add("NickNm");
        columnList.add("PreferredSalutationCd");
        columnList.add("QualificationAffixCd");
        columnList.add("TitleCd");
        columnList.add("EmployeeTypeCd");
        columnList.add("JobCd");
        columnList.add("JobTitle");
        columnList.add("OvertimeInd");
        columnList.add("BreakEndTs");
        columnList.add("BreakStartTs");
        columnList.add("WageGroupCd");
        columnList.add("WageType");
        columnList.add("WorkDayOfWk");
        columnList.add("WorkDt");
        columnList.add("ShiftDt");
        columnList.add("ShiftDurationHrs");
        columnList.add("ShiftEndTs");
        columnList.add("ShiftId");
        columnList.add("ShiftStartTs");
        columnList.add("WorkWeekEndDay");
        columnList.add("WorkWeekEndDt");
        columnList.add("WorkWeekStartDay");
        columnList.add("WorkWeekStartDt");
int i=0;
        for (String column:columnList ){
            String out="empSchedule.set"+column+"("+"oneRecord.get("+i+"));";
            System.out.println(out);
            i++;
        }
    }
}