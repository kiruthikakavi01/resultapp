package com.bank;



public class Bank {
	
		public int interest=5;
		public Bank() {
			System.out.println("Bank: "+interest);
		}
		void display() {
			System.out.println("My Bank interest:"+interest);
		}
	}
	class IndianBank extends Bank{
		public IndianBank() {
		System.out.println("Indian Bank: "+interest);
		}
		void display() {
			System.out.println("My Indian Bank interest:"+interest);
		}
	}
	class IcciBank extends Bank{
		
		public static void main(String[] args) {
			IcciBank obj=new IcciBank();
			obj.display();
		}

}
	
