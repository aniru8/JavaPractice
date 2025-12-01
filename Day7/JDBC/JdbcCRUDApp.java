package com.example.Day7.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcCRUDApp {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Driver loaded");
		
		String uname="root";
		String pwd="root@39";
		String url="jdbc:mysql://localhost:3306/anirudha";
		
		Connection con=DriverManager.getConnection(url,uname,pwd);
		Statement st= con.createStatement();
		ResultSet rs=st.executeQuery("select * from collegues");
			
			//inserting record
//			String query="insert into collegues values(?,?,?)";
//			PreparedStatement ps = con.prepareStatement(query);
//			ps.setString(1, "Sampreeth");
//			ps.setInt(2, 35);
//			ps.setInt(3, 2490);
//			
//			ps.executeUpdate();
//			System.out.println("Row inserted sucessfully");
			
			//Read the record
			ResultSetMetaData rsmd=rs.getMetaData();
			int columnsCount=rsmd.getColumnCount();
			while(rs.next()) {
			for(int i=1;i<=columnsCount;i++)
				System.out.println(rsmd.getColumnName(i)+" : "+rs.getString(rsmd.getColumnName(i)));
			System.out.println("-------------------------------------------");
			
			//update record
			
			String query="update collegues set age=? where name=?";
			PreparedStatement ps = con.prepareStatement(query);
			ps.setInt(1, 22);
			ps.setString(2, "Sawpna");
			ps.executeUpdate();
			System.out.println("Update done");
		}
			rs.close();
			st.close();
			con.close();
	}
}
