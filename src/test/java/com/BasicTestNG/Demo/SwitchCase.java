package com.BasicTestNG.Demo;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) 
	{
		int i;
		
		Scanner sc = new Scanner(System.in);
		i = sc.nextInt();
		sc.close();
		
		switch(i)
		{
			case 10: System.out.println("i is equal to 10");
			break;
			
			case 50: 
				System.out.println("i is equal to 50");
				break;
			
			case 100: 
				System.out.println("i is equal to 100");
				break;
			
			default:
				System.out.println("wrong data");
				break;
		}
	}

}
