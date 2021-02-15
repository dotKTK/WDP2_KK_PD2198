/**
 *
 *  @author Koszykowski Krzysztof PD2198
 *
 */

package zad3;

import zad2.Employee;

public class EmpsList {
	
	public static Emps pierwszy=null;
	public static Emps ostatni=null;
	public static Emps temp=null;
		
	public void add(Employee employee)
	{
	 
	 if (ostatni==null)
	 	{
		temp = new Emps(null,null,employee);
		pierwszy=temp;
		ostatni=temp;
	 	}else
	 		{
			 temp = new Emps(ostatni,null,employee);
			 ostatni.next=temp;
			 ostatni=temp;
	 		}
	 	
	}

	public void showForward()
	{
		temp=pierwszy;
		while(temp!=null)
			{
			System.out.println(temp.e);			
			temp=temp.next;
			}
		
		
	}

	public void showBackward()
	{
		temp=ostatni;
		while(temp!=null)
			{
			System.out.println(temp.e);
			temp=temp.prev;
			}
		
	}

	public void changeAllSalaries(double d)
	{
		temp=pierwszy;
		while(temp!=null)
			{
			temp.e.chgSalary(d);
			temp=temp.next;
			}
		
	}

}
