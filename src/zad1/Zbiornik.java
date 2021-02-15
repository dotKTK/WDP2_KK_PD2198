/**
 *
 *  @author Koszykowski Krzysztof PD2198
 *
 */

package zad1;


public class Zbiornik 
{
	private static int kolejnosc=0;
	private int numer;
	private double pojemnosc;
	private double stan_wody;
	
	
	public Zbiornik (double poj)
	{
		kolejnosc++;
		this.numer=kolejnosc; //do zmiany
		this.pojemnosc=poj;
		this.stan_wody=0;
	}
	
	public void dolej (double ile)
	{
		if (stan_wody+ile<=pojemnosc) 
				{
				stan_wody=stan_wody+ile;
				}
		else
		{
			stan_wody=pojemnosc;
		}
	}
		
		public void odlej (double ile)
		{
			if (stan_wody-ile>=0)
			{
				stan_wody=stan_wody-ile;
			}
			else
			{
				stan_wody=0;
			}
		}
		
		public String toString()
		  {
			  return ("Zbiornik "+this.numer+", pojemność "+pojemnosc+", stan wody "+stan_wody);
		  }
}  
