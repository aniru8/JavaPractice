package com.example.Day7.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class App {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Driver loaded");
		
		String uname="root";
		String pwd="root@39";
		String url="jdbc:mysql://localhost:3306/anirudha";
		
		Connection con=DriverManager.getConnection(url,uname,pwd);
		System.out.println("Connection established");
		
		String query ="select name from collegues";
		Statement st= con.createStatement();
		st.executeQuery(query);
		ResultSet rs=st.executeQuery(query);
		ResultSetMetaData rsmd=rs.getMetaData();
		int columnsCount=rsmd.getColumnCount();	
		for(int i=1;i<=columnsCount;i++)
			System.out.println(rsmd.getColumnName(i)+" "+rsmd.getColumnName(i));
		while(rs.next()) {
//			System.out.println("EmployeeName: "+rs.getString(1));
//			System.out.println("EmployeeAge: "+rs.getInt(2));
//			System.out.println("EmployeeId: "+rs.getInt(3));
			for(int i=1;i<=columnsCount;i++)
				System.out.println(rsmd.getColumnName(i)+" : "+rs.getString(rsmd.getColumnName(i)));
			System.out.println("------------------------------");
		}
	rs.close();
	st.close();
	con.close();
	}
}
