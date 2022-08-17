package com.customer;
import java.util.*;

public class Main {

	public static void main(String[] args)
	{
		ArrayList<Customer> al= new ArrayList<>();
		
		al.add(new Customer(1,"Padma",5000,20));
		al.add(new Customer(2,"Anitha",10000,21));
		al.add(new Customer(3,"Sujatha",15000,22));
		al.add(new Customer(4,"Durga",20000,23));
		al.add(new Customer(5,"Teja",25000,24));
		al.add(new Customer(6,"Chandana",30000,25));
		al.add(new Customer(7,"Gayatri",35000,26));
		al.add(new Customer(8,"Bhanu",40000,27));
		al.add(new Customer(9,"Indu",45000,28));
		al.add(new Customer(10,"Narayana",50000,29));
		
		int len = al.size();
		Scanner sc = new Scanner(System.in);
		
		String whilechoice ="go";
		while(whilechoice=="go")
		{
			String avail="False";
			System.out.println("Enter your Choice");
			System.out.println("1-> Display Customer data");
			System.out.println("Customer details in descending order");
			System.out.println("3-> update purchase amount");
			System.out.println("4->Exit the program");
			System.out.println("");
			int a = sc.nextInt();
			switch(a)
			{
			case 1:
				System.out.println("Customer Details...");
				for(Customer st:al)
				{
					System.out.println(st.cid+" "+st.name+" "+st.purchaseAmount+" "+st.age);
				}
				break;
			case 2:
				System.out.println("Customer details in descending order");
				Collections.sort(al);
				for(Customer st:al)
				{
					System.out.println(st.cid+" "+st.name+" "+st.purchaseAmount+" "+st.age);
				}
				break;
			case 3:
				System.out.println("Update customer purchase amount");
				
				int b= sc.nextInt();
				System.out.println("Enter new purchase amount");
				int c = sc.nextInt();
				
				for(int i=0;i<len;i++)
				{
					if(al.get(i).cid==b)
					{
						al.get(i).setpurchaseAmount(c);
						avail="True";
						System.out.println("Updated purchase amount.."+al.get(i).cid+" "+al.get(i).name+" "+al.get(i).purchaseAmount+" "+al.get(i).age);
						
					}
				}
				if("False".equals(avail))
				{
					System.out.println("Invalid customer Id");
				}
				break;
			case 4:
				System.out.println("");
				whilechoice="stop";
				System.out.println("Exit");
				break;
			}
		}
		
	}

}
