package org.tnsindia.regexdemo;

import java.util.Scanner;
import java.util.regex.Pattern;
//demo on split method using delimiter
public class SplitMethodDemo {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		String delimiter="@";
		Pattern p=Pattern.compile(delimiter,Pattern.CASE_INSENSITIVE);
		String[] res=p.split(str);
		for(String s1:res)
		{
			System.out.println(s1);
		}

	}

}
