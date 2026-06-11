package day27;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class EmployeePayrollTest {
	@Test
	void readPayRollDataFromConsoleTestAndReadDataToConsoleTest() {
       EmployeePayroll emp=new EmployeePayroll();
       emp.readingDataFromConsole();
       emp.EmpPayRollDataToConsole();
	}

}
