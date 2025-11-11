package com.palle;

import java.util.Scanner;

public class MainClass {



	

	public static void main(String[] args) {
		AtmOperationInterface op=new AtmOperationImpl();
		int atmnumber =12345;
		int atmpin = 123;
		
		Scanner in=new Scanner(System.in);
		System.out.println("Welcome Atm Number");
		System.out.print("Enter Atm Number:");
		int atmNumber=in.nextInt();
		System.out.print("Enter pin:");
		int pin=in.nextInt();
		if((atmnumber==atmNumber)&&(atmpin==pin)) {
			while(true) {
				System.out.println("1.view Available Balance\n2.Withdraw Amount\n3.Deposit Amount\n4.view Ministatement\5.Exit);");
				System.out.println("Enter choice:");
				int ch=in.nextInt();
				if(ch==1) {
					op.ViewBalance();
					
					
				}
				else if(ch==2) {
					System.out.println("Enter Amount to withdraw");
					double withdrawAmount=in.nextDouble();
					op.withdrawAmount(withdrawAmount);
					
				}
				else if(ch==3) {
					System.out.println("Enter Amount to deposit:");
					double depositAmount=in.nextDouble();//5000
					op.depositAmount(depositAmount);
					
				}
				else if(ch==4) {
					op.ViewMiniStatement();
			}
		
		else if(ch==5) {
			System.out.println("collect your ATM Card\n Thank you for using ATM Machine");
			System.exit(0);
			
			
		
				
			
			
		}
		else
		{
			System.out.println("please enter correct choice");
		}
	}
		}
	}
	
}

