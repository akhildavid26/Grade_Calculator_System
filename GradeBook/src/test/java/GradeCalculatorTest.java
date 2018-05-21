import static org.junit.Assert.*;

import org.junit.Test;

public class GradeCalculatorTest {

	@Test
	public void testSetGrades() {
		double[] test1= {99};
		double[] test2= {87};
		double[] test3= {64};
		double[] test4= {74};
		double[] test5= {57};
		char expected1='A';
		char expected2='B';
		char expected3='D';
		char expected4='C';
		char expected5='E';
		
		GradeCalculator actualgrade1=new GradeCalculator(test1);
		actualgrade1.setGrades();
		char actual1 = actualgrade1.getGrade(0);
		

		GradeCalculator actualgrade2=new GradeCalculator(test2);
		actualgrade2.setGrades();
		char actual2 = actualgrade2.getGrade(0);
		

		GradeCalculator actualgrade3=new GradeCalculator(test3);
		actualgrade3.setGrades();
		char actual3 = actualgrade3.getGrade(0);
		

		GradeCalculator actualgrade4=new GradeCalculator(test4);
		actualgrade4.setGrades();
		char actual4 = actualgrade4.getGrade(0);
		

		GradeCalculator actualgrade5=new GradeCalculator(test5);
		actualgrade5.setGrades();
		char actual5 = actualgrade5.getGrade(0);
		
		
		assertEquals(expected1, actual1);
		assertEquals(expected2, actual2);
		assertEquals(expected3, actual3);
		assertEquals(expected4, actual4);
		assertEquals(expected5, actual5);
		
	}
	
	@Test
	public void testCalAverage() {
		
		double[] test={97,89,50,60};
		float expectedvalue = 74;
		GradeCalculator actualgrade=new GradeCalculator(test);
		double actualvalue = actualgrade.calAverage(test);
		assertEquals(expectedvalue, actualvalue,5);
		
	}

}
