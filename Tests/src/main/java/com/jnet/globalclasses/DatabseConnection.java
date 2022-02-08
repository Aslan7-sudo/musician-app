package com.jnet.globalclasses;

import java.sql.*;

public class DatabseConnection {
    private static final String serverIP = "//172.16.2.187\\SQL2017DEV";
    private static final String portNumber = "1433";
    private static final String JdatabaseName = "TrackerDB_Test";
    private static final String Jusername = "trackerowner";
    private static final String Jpassword = "2VHYrnZ3BgSD";


    Connection con = null;
    ResultSet resultSet = null;


    public ResultSet JDBCConnection_SQL(String ApplicantID) {

        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Log4j.info("Able to find the class: com.microsoft.sqlserver.jdbc.SQLServerDriver");
        } catch (ClassNotFoundException c) {
            Log4j.info("Unable to find the class: com.microsoft.sqlserver.jdbc.SQLServerDriver");
            c.printStackTrace();
        }

        try {

            con = DriverManager.getConnection("jdbc:sqlserver:" + serverIP + ";databaseName=" + JdatabaseName, Jusername, Jpassword);
            Statement st = con.createStatement();

         /*   resultSet = st.executeQuery("select * from S8TEN where id=" + ApplicantID + ";" + " select * from s8ten2 where s8ten_id =" + ApplicantID + ";"
                    + " select * from S8DHPROG where s8ten_id =" + ApplicantID + ";" +
                    " select * from S8DHTEN where s8ten_id = " + ApplicantID + ";" + " select * from S8MEM where s8ten_id = " + ApplicantID + ";");
*/
            resultSet = st.executeQuery("select * from S8TEN as t1  FULL JOIN s8ten2 as t2  ON t1.id=t2.s8ten_id   FULL JOIN S8DHPROG as t3 ON t1.id=t3.s8ten_id FULL JOIN S8DHTEN as t4 ON t1.id=t4.s8ten_id FULL JOIN S8MEM as t5 ON t1.id=t5.s8ten_id where t1.id="+ApplicantID+";");

            ResultSetMetaData rm = resultSet.getMetaData();
        } catch (SQLException s) {

            s.printStackTrace();
        }

        return resultSet;
    }
}