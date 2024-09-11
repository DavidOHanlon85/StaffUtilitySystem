/**
 * 
 */
package math.examples;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * 
 */
class TestEmployee {
	
	// Test Data
	
	Employee emp;
	String nameValidLow, nameValidMid, nameValidHigh;
	String nameInvalidLow, nameInValidHigh;
	int ageValidLow, ageValidMid, ageValidHigh;
	int ageInvalidLow, ageInvalidHigh;

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	void setUp() throws Exception {
		nameValidLow = "Abc";
		nameValidMid = "Abcdefghij";
		nameValidHigh = "a".repeat(20);
		
		nameInvalidLow = "ab";
		nameInValidHigh = "x".repeat(21);
		
		ageValidLow = 18;
		ageValidMid = 26;
		ageValidHigh = 30;
		ageInvalidLow = 17;
		ageInvalidHigh = 31;
		
		emp = new Employee(nameValidMid, nameValidMid, 25);
	}

	/**
	 * Test method for {@link math.examples.Employee#getName()}.
	 */
	@Test
	void testGetSetNameValid() {
		emp.setName(nameValidLow);
		assertEquals(nameValidLow, emp.getName());
		
		emp.setName(nameValidMid);
		assertEquals(nameValidMid, emp.getName());
		
		emp.setName(nameValidHigh);
		assertEquals(nameValidHigh, emp.getName());
	}
	
	/**
	 * Test method for {@link math.examples.Employee#getName()}.
	 */
	@Test
	void testGetSetAgeValid() {
		emp.setAge(ageValidLow);
		assertEquals(ageValidLow, emp.getAge());
		
		emp.setAge(ageValidMid);
		assertEquals(ageValidMid, emp.getAge());
		
		emp.setAge(ageValidHigh);
		assertEquals(ageValidHigh, emp.getAge());
	}

	/**
	 * Test method for {@link math.examples.Employee#setName(java.lang.String)}.
	 */
	@Test
	void testSetNameInvalid() {
		Exception exp = assertThrows(IllegalArgumentException.class, () -> {
			emp.setName(nameInValidHigh);
		});
		
		assertEquals("Invalid name length", exp.getMessage());
		
		exp = assertThrows(IllegalArgumentException.class, () -> {
			emp.setName(nameInvalidLow);
			
		});
		
		assertEquals("Invalid name length", exp.getMessage());
		
		exp = assertThrows(IllegalArgumentException.class, () -> {
			emp.setName(null);
			
		});
		
		assertEquals("Can't set name to null", exp.getMessage());
		
	}
	
	@Test
	void testSetAgeInvalid() {
		Exception exp = assertThrows(IllegalArgumentException.class, () -> {
			emp.setAge(ageInvalidHigh);
			
		});
		
		assertEquals("Invalid Age", exp.getMessage());
		
		exp = assertThrows(IllegalArgumentException.class, () -> {
			emp.setAge(ageInvalidLow);
			
		});
		
		assertEquals("Invalid Age", exp.getMessage());
		
		
	}
	
	@Test 
	void testEmployeeConstructorValid() {
		Employee empCon = new Employee(nameValidHigh, nameValidLow, ageValidMid);
		assertNotNull(empCon);
		assertEquals(nameValidHigh, empCon.getName());
		assertEquals(nameValidLow, empCon.getLastName());
		assertEquals(ageValidMid, empCon.getAge());
	}
	
	@Test 
	void testEmployeeConstructorInvalid() {
		
		assertThrows(IllegalArgumentException.class, () -> {
			new Employee(nameInvalidLow, nameValidHigh, ageValidLow);
		});
//		assertThrows(IllegalArgumentException.class, () -> {
//		new Employee(nameValidHigh, nameInValidHigh, ageValidHigh);
//		});
		assertThrows(IllegalArgumentException.class, () -> {
			new Employee(nameValidHigh, nameValidHigh, ageInvalidLow);
		});
		
		
	}

	
}


