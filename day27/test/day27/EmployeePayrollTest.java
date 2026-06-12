package day27;

import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;

import org.junit.jupiter.api.Test;

class EmployeePayrollTest {
	@Test
	void readPayRollDataFromConsoleTestAndReadDataToConsoleTest() throws IOException{
       EmployeePayroll emp=new EmployeePayroll();
       emp.readingDataFromConsole();
       emp.EmpPayRollDataToConsole();
       emp.writeEmployeePayrollToFile();
       emp.printData(); 
       assertEquals(emp.empPayRollList.size(),3);
              
	}
       

}
