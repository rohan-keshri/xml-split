declare variable $doc external;
for $x in $doc

return
(

if (exists($doc/EmployeeWorkSchedule_SK))
then
( data($doc/EmployeeWorkSchedule_SK) )
else ("NULL") ,

if (exists($doc/*[local-name()='GetEmployeeWorkSchedule']//*[local-name()='WorkScheduleData']//*[local-name()='WorkSchedule']//*[local-name()='WorkShift']//*[local-name()='ShiftJob']//*[local-name()='SegmentStartTs']))
then
( data(($doc/*[local-name()='GetEmployeeWorkSchedule']//*[local-name()='WorkScheduleData']//*[local-name()='WorkSchedule']//*[local-name()='WorkShift']//*[local-name()='ShiftJob']//*[local-name()='SegmentStartTs'])) )
else ("NULL") ,

if (exists($doc//*[local-name()='GetEmployeeWorkSchedule']//*[local-name()='WorkScheduleData']//*[local-name()='WorkSchedule']//*[local-name()='WorkShift']//*[local-name()='ShiftJob_id']))
then
( data(($doc//*[local-name()='GetEmployeeWorkSchedule']//*[local-name()='WorkScheduleData']//*[local-name()='WorkSchedule']//*[local-name()='WorkShift']//*[local-name()='ShiftJob_id'])) )
else ("NULL") ,

if (exists(($doc//*[local-name()='GetEmployeeWorkSchedule']//*[local-name()='WorkScheduleData']//*[local-name()='WorkSchedule']//*[local-name()='ShiftJobCd'])))
then
( data((($doc//*[local-name()='GetEmployeeWorkSchedule']//*[local-name()='WorkScheduleData']//*[local-name()='WorkSchedule']//*[local-name()='ShiftJobCd'])) ))
else ("NULL") ,

if (exists($doc/SegmentId))
then
( data($doc/SegmentId) )
else ("NULL") ,

if (exists($doc/SegmentEndTs))
then
( data($doc/SegmentEndTs) )
else ("NULL") ,

if (exists($doc//*[local-name()='GetEmployeeWorkSchedule']//*[local-name()='WorkScheduleData']//*[local-name()='WorkSchedule']//*[local-name()='WorkShift']//*[local-name()='ShiftJob']//*[local-name()='ShiftJobTitleNm']))
then
( data($doc//*[local-name()='GetEmployeeWorkSchedule']//*[local-name()='WorkScheduleData']//*[local-name()='WorkSchedule']//*[local-name()='WorkShift']//*[local-name()='ShiftJob']//*[local-name()='ShiftJobTitleNm']))
else ("NULL") ,

if (exists($doc/DW_BATCH_ID))
then
( data($doc/DW_BATCH_ID) )
else ("NULL") ,

if (exists($doc/DW_CREATE_TS))
then
( data($doc/DW_CREATE_TS) )
else ("NULL") ,

if (exists($doc/DW_CREATE_USER_ID))
then
( data($doc/DW_CREATE_USER_ID) )
else ("NULL") ,

if (exists($doc/DW_LAST_UPDATE_TS))
then
( data($doc/DW_LAST_UPDATE_TS) )
else ("NULL") ,

if (exists($doc/DW_LAST_UPDATE_USER_ID))
then
( data($doc/DW_LAST_UPDATE_USER_ID) )
else ("NULL") ,

if (exists($doc/DW_LOGICAL_DELETE_IND))
then
( data($doc/DW_LOGICAL_DELETE_IND) )
else ("NULL")


)