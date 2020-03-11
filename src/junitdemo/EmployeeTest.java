package junitdemo;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class EmployeeTest {
	Employee emp;

	@Before
	public void setUp() throws Exception {
		emp = new Employee(1, "nitesh", 30000);
	}

	@After
	public void tearDown() throws Exception {
		emp = null;
	}

	@Test
	public void mySimpleEqualsTest() {
		String expectedName = "nitesh";
		assertEquals(expectedName, Employee.getEmployeeNameWithHighestSalary());
	}

	@Test
	public void myObjectEqualsTest() {
		Employee expectedEMpObj = new Employee(1, "nitesh", 300000);
		assertEquals(expectedEMpObj, Employee.getHighestPaidEmployee());
	}
}
