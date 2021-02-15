/**
 *
 *  @author Koszykowski Krzysztof PD2198
 *
 */

package zad2;

import javax.swing.JOptionPane;

public class EmpManager {

	public static Employee defEmp(String msg)
	{
	String dane = JOptionPane.showInputDialog(msg);
	
	if (dane.length()>0) 
		{
			String daneTablicowe[];
			daneTablicowe=dane.split(" ");
			Employee gosc = new Employee(daneTablicowe[0],daneTablicowe[1],Integer.parseInt(daneTablicowe[2]),Double.parseDouble(daneTablicowe[3]));
			return gosc;
		} else return null;
	
	}

	public static void showInfo(Employee e)
	{
		System.out.println(e);
		
	}

	public static void changeSalary(Employee e)
	{
		String dane = JOptionPane.showInputDialog("Podaj o ile procent chcesz zmienić pensje pracownika "+e.getFirstName()+" "+e.getLastName());
		e.chgSalary(Double.parseDouble(dane));
	}


}    
