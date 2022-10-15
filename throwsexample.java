package com.yogesh.java;

import java.io.*;

public class throwsexample {
	
public static void main(String[] args) throws IOException{
	BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
	int a=Integer.parseInt(br.readLine());    
	 class throwdemo extends Exception{
		static int accno [] = {101,102,103,104,105};
		static int bal [] = {10000,2000,50,3000,450};
		static String name [] = {"yogesh","vishal","amit","sumit","kajal"};
throwdemo(String str)
{
	super(str);
}
public static void main(String[] args)
{
System.out.println("accno"+""+"name"+""+"bal");
for(int i=0;i<5;i++) {
	System.out.println(accno[i]+""+name[i]+""+bal[i]);
}
}
	}
	
}
}
