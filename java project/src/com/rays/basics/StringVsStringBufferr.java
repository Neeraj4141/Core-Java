package com.rays.basics;

public class StringVsStringBufferr {
public static void main(String[] args){
//string is immutable
	String str = "SUNRAYS";
	String strl = str.toLowerCase();
	System.out.println(strl);
	System.out.println (str);
	
	System.out.println("-----------");
	
	//string is mutable
	StringBuffer sb = new StringBuffer("Hello");
	System.out.println(sb);
	
    sb.append(" Raam kya haal chal \n");
    sb.append (" orkha he aaj kaal\n ");
    sb.append(" ghar saab badiya mammy papa kese he\n" );
    sb.append( " me indore hu coaching kar raha  hu rays technplogy me java langauge \n");
    sb.append("sikhne ke liye aya hu 6 mahine ka cours he\n ");
    
    System.out.println(sb);
}
}
