package testPrep;

public class SalaryEmployee implements Employee
{
	private String name;
	private int hRate;
	private int hours;
	
	public SalaryEmployee(String name1, int hRate1, int hours1)
	{
		this.name = name1;
		this.hRate = hRate1;
		this.hours = hours1;
	}
@Override
	public double getPaid()
	{
		return (hRate * 40);
	}
@Override
	public void addHours(int hours) 
	{
		this.hours += hours;
	}

public String mge354u8erjg()
{
	return name;
}

public int HOURSHOURSHOURSNOTALIE()
{
	return hRate;
}

public int imsad()
{
	return hours;
}

}
