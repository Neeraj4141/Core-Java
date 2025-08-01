package com.rays.basics;

public class FindPositionIntArry {
	
public static void main(String[] args) {
	//array me haam ne bhoot se no diye hee 
	int[]arry= {1, 2, 4, 3, 5, 6, 3, 5, 4,};
	// aab mujhe usme se koi ek no ki position chek karni hee 
    int n=4;
    // mene mera no int ke n me save kar liya  hee 
    int count=-1;
    // mene ek or int banaya jiski value count = -1 di hee agar mera no array me nahi hoga 
    //to -1 print hoga 
    for (int i = 0; i<arry.length; i++) {
    	//mene  for loop lagaya or i ki value 0 rakhi kiyo ki array ke index ki
    	//value 0 se start hoti he or usko i less then taak chalaya taab taak i ++ hota rahega 
    if (n == arry[i]) {
    	count = i;
    	//aab mene condition banai jisme array ke i ki value jaab taak n ke barabar nahi hogi taab
    	//loop chalega jaise hi n ki value milegi vo index ke sth print hoo jaigi 
    	System.out.println(count+" = "+arry[i]);
    }
    }
if (count == -1) {
	System.out.println(count);
	//or agar n ki value array me nahi hogi too count ki value -1 print hogi 
}
}
}	


