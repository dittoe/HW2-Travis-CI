import static org.junit.Assert.*;

import org.junit.Test;


public class CalcTest {

	//Calc.add(a, b) Test cases
	
	@Test
	public void addPositives() {
		assertTrue("Does Not Compute", Calc.add(3, 5) == 8);
	}
	@Test
	public void addNegsAndPos()	{
		assertTrue("Does Not Compute", Calc.add(-3, 4) == 1);
	}
	@Test
	public void addNegatives()	{
		assertTrue("Does Not Compute", Calc.add(-2, -5) == -7);
	}
	
	//Calc.subtract(a, b) Test cases
	
	@Test
	public void subtractPositives()	{
		assertTrue("Does Not Compute", Calc.subtract(7, 3) == 4);
	}
	@Test
	public void subtractNegatives()	{
		assertTrue("Does Not Compute", Calc.subtract(-4, -5) == 1);
	}
	@Test
	public void subtractPosFromNeg()	{
		assertTrue("Does Not Compute", Calc.subtract(-5, 3) == -8);
	}
	@Test
	public void subtractNegFromPos()	{
		assertTrue("Does Not Compute", Calc.subtract(4, -3) == 7);
	}
	@Test
	public void resultingNegativeFromPosSubtraction(){
		assertTrue("Does Not Compute", Calc.subtract(3, 5) == -2);
	}
	
	//Calc.multiply(a, b) Test Cases
	
	@Test
	public void multiplyPositives()	{
		assertTrue("Does Not Compute", Calc.multiply(4, 5) == 20);
	}
	@Test
	public void multiplyNegatives()	{
		assertTrue("Does Not Compute", Calc.multiply(-3, -4) == 12);
	}
	@Test
	public void multiplyNegAndPos()	{
		assertTrue("Does Not Compute", Calc.multiply(-2, 3) == -6);
	}
	@Test
	public void multiplyZero()	{
		assertTrue("Does Not Compute", Calc.multiply(0, 4) == 0);
	}
	
	//Calc.divide(a, b) Test Cases
	
	@Test
	public void dividePositives()	{
		assertTrue("Does Not Compute", Calc.divide(9, 3) == 3);
	}
	@Test
	public void divideNegatives()	{
		assertTrue("Does Not Compute", Calc.divide(-4, -2) == 2);
	}
	@Test
	public void divideNegAndPos()	{
		assertTrue("Does Not Compute", Calc.divide(-4, 2) == -2);
	}
	@Test
	public void divideZero()	{
		assertTrue("Does Not Compute", Calc.divide(0, 5) == 0);
	}
	@Test(expected = ArithmeticException.class)
	public void divideByZero()	{
		Calc.divide(5, 0);
	}

}
