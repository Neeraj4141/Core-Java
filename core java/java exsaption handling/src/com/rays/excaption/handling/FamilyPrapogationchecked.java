package com.rays.excaption.handling;

public class FamilyPrapogationchecked {
	public static void main(String[] args) throws Exception {
		dad();
	}
	public static void dad() throws Exception {
		mom();
	}
	public static void mom() throws Exception {
		son();
	}
	public static void son() throws Exception {
			
			try {
				throw new Exception("make a mistak");//checked
			} catch (Exception e) {
				System.out.println(e.getLocalizedMessage());
			}finally {
				System.out.println("thankyou");
			}
	}

}
