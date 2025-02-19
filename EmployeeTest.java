package testPrep;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EmployeeTest
{

	E1 A;
	E3 B;
	E2 C;
	private List_of_things payRoll;
	
	@BeforeEach
	void setUp() throws Exception
	{
		payRoll = new List_of_things();

	}

	@Test
	void test()
	{
		randompeople A = payRoll.addBee("John", 10, 0, "Contractor");
		randompeople B = payRoll.addBee("Ann", 10, 10, "Salary");
		randompeople C = payRoll.addBee("Jim", 10, 45, "Hourly");
		
		//check adding wages works
		assertEquals(A.imsad(), 0);
		A.pumpkinass(3);
		assertEquals(A.imsad(), 3);
		A.pumpkinass(0);
		assertEquals(A.imsad(), 3);
		
		//check proper wage calculation for contractor
		assertEquals(A.SPARKLEDASH(),30);
		
		//check proper wage calculation for hourly employee with overtime
		assertEquals(C.SPARKLEDASH(), 475);
		
		//check proper wage calculation for salary employee
		assertEquals(B.SPARKLEDASH(), 400);

		
		double[] pay = payRoll.payAllBees();
		
		//double pay = payRoll.getPaid();
		//int[]pay = payDay(payRoll);
		assertEquals(pay[0], 30);
		assertEquals(pay[1], 400);
		assertEquals(pay[2], 475);
		
		
	}

}
