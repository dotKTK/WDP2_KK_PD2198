/**
 *
 *  @author Koszykowski Krzysztof PD2198
 *
 */

package zad2;



public class Employee {
	
	private String firstName;
	private String lastName;
	private int age;
	private double salary;
	
	public Employee(String imie, String nazwisko, int wiek, double pensja)
	{
		firstName=imie;
		lastName=nazwisko;
		age=wiek;
		salary=pensja;
	}
	
	public String toString()
	{
		return (this.getFirstName()+" "+this.getLastName()+" "+this.getAge()+" "+this.getSalary());
	}
	
	public double getSalary()
	{
		return this.salary;
	}
	
	public String getFirstName()
	{
		return this.firstName;
	}
	
	public String getLastName()
	{
		return this.lastName;
	}
	
	public int getAge()
	{
		return this.age;
	}
	
	public void chgSalary(double ile_procent)
	{
		this.salary=salary*(1+(ile_procent/100));
	}
	

}
