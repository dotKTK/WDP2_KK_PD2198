package zad3;

import zad2.Employee;

public class Emps
{
	public Emps(Emps p, Emps n, Employee ee)
	{
		prev=p;
		next=n;
		e=ee;
	}
		
	public Emps prev;
	public Emps next;
	public Employee e;

}
