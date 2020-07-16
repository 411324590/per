package cn.chinatelecom.jdbctest;
import java.sql.*;

import static cn.chinatelecom.jdbctest.JdbcUtils.*;


/**
 * @ClassName : Jdbctest
 * @Description : jdbctest
 * @Author : Caoguodong
 * @Date: 2020-07-15
 */

public class Jdbctest {

    public static void main(String[] args) {
//        PropertiesUtil.loadFile("jdbc.properties");
//        String driver = PropertiesUtil.getPropertyValue("driver");
//        String url = PropertiesUtil.getPropertyValue("url");
//        String username  = PropertiesUtil.getPropertyValue("username");
//        String password = PropertiesUtil.getPropertyValue("password");
        Connection conn = getConn();
        try {
            Statement statement = conn.createStatement();
            ResultSet resultSet = statement.executeQuery("select ID,name,school,college,major from graduate");
            while (resultSet.next()) {
                System.out.println("编号:" + resultSet.getInt(1)+"\t"+
                        " 姓名:" + resultSet.getString(2)+"\t"+
                        " 学校:" + resultSet.getString(3)+"\t"+
                        " 学院:" + resultSet.getString(4)+"\t"+
                        " 专业:" + resultSet.getString(5)+"\t");

            }
            release(conn, statement, resultSet);
//            resultSet.close();
//            statement.close();
//            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
            close();
        }

    }
}
