package com.rys.jdbc.preparedStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserModal {

	public int nextPK() throws ClassNotFoundException, SQLException {

		int pk = 0;

		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb1", "root", "root");
		PreparedStatement pstmt = conn.prepareStatement("select max(id)from st_user");
		ResultSet rs = pstmt.executeQuery();

		while (rs.next()) {
			pk = rs.getInt(1);

		}
		conn.close();
		return pk + 1;

	}
	public void add(UserBean bean) throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb1","root","root");
		PreparedStatement pstmt = conn.prepareStatement("insert into st_user values(?,?,?,?,?,?)");
		int pk = nextPK();
		
		pstmt.setInt(1, pk);
		pstmt.setString(2,bean.getFristname() );
		pstmt.setString(3, bean.getLastname());
		pstmt.setString(4, bean.getLoginid());
		pstmt.setString(5, bean.getPassword());
		pstmt.setDate(6, new java.sql.Date(bean.getDob().getTime()) );

		int i = pstmt.executeUpdate();
		System.out.println("update sucessfully" + i);
		conn.close();
		
		
		
		
		
	}

}
