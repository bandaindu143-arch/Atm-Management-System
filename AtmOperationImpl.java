package com.palle;

import java.util.HashMap;
import java.util.Map;

public class AtmOperationImpl implements AtmOperationInterface{
	Atm atm=new Atm();
	Map<Double,String>ministmt=new HashMap();

	@Override
	public void ViewBalance() {
		System.out.println("Available Balance is:"+atm.getBalance());
		
		
	}

	@Override
	public void withdrawAmount(double withdrawAmount) {
		if(withdrawAmount%500==0) {
		if(withdrawAmount<=atm.getBalance()) {
			ministmt.put(withdrawAmount, "Amount Withdrawn");
			System.out.println("collect the cash"+withdrawAmount);
			atm.setBalance(atm.getBalance()-withdrawAmount);
			ViewBalance();
		
		}
		else {
			System.out.println("Insufficient Balance !!");
		}
		
	}
		else {
			System.out.println("please enter the amount in multiple of 500");
		}
	
	}

	@Override
	public void depositAmount(double depositAmount) {
		ministmt.put(depositAmount, "Amount deposited");
		System.out.println(depositAmount+"Deposited Sucessfully !!");
		atm.setBalance(atm.getBalance()+depositAmount);
		ViewBalance();
	
		
	}

	@Override
	public void ViewMiniStatement() {
		for(Map.Entry<Double,String>m:ministmt.entrySet()) {
			System.out.println(m.getKey()+""+m.getValue());
		}
		
	}

}
