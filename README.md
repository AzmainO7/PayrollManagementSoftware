# PayrollManagementSoftware

HOW TO RUN THE APPLICATION : 

1. Download JDK 1.8 in order to properly run the application.

2. Download the JDBC Driver from this link - "https://www.microsoft.com/en-us/download/details.aspx?id=11774"
    - unzip the file and go to sqljdbc_version\enu\auth\x64 or \x86
    - copy the sqljdbc_auth.dll to C:\Program Files\Java\jre_Version\bin
    
3. In order to run the project Open Sql Server Configuration Manager,
   - go to "SQL Server Services" and start "SQL Server Browser" if not running already.
   - go go to "SQL Server Network Configuration/Protocols For SQLEXPRESS" and enable TCP/IP protocol if disabled.
   
4. Finally run the application by double clicking "PayrollManagementSoftware\dist\PayrollManagementSoftware.jar".
