package com.rys.jdbc.preparedStatement;

import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class TestUserModel {
	public static void main(String[] args) throws ClassNotFoundException, SQLException, ParseException {

		TestAdd();

	}

	public static void TestAdd() throws ParseException, ClassNotFoundException, SQLException {

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

		UserModal model = new UserModal();

		UserBean bean = new UserBean();

		bean.setFristname("Harshit");
		bean.setLastname("Mewada");
		bean.setLoginid("harshi@gamail.com");
		bean.setPassword("harshit@123");
		bean.setDob(sdf.parse("2002-12-6"));

		model.add(bean);

	}

}
