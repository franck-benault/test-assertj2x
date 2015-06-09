package net.franckbenault.testassertj.assertion.s02basicjunit;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.fail;

import org.junit.Test;

public class JUnitTestCase {

	
	@Test(expected=ArithmeticException.class)
	public void t00fail() {
		int i1= 0;
		int i2= 0;
		
		int res = i1/i2;
		
		fail("exception expected");
	}
	
	@Test
	public void t01AssertArrayEqualsTest() {
		int[] ints1 = {1,3};
		int[] ints2 = {1,3};

		assertThat(ints1).isEqualTo(ints2);
		assertThat(ints1).as("tab of int").isEqualTo(ints2);
	}

	@Test
	public void t02aAssertEquals() {
		String s1 = "String";
		
		assertThat(s1).isEqualTo("String");
		assertThat(s1).as("s1").isEqualTo("String");
		
	}
	
	@Test
	public void t02bAssertNotEquals() {
		
		String s1 = "String1";
		String s2 = "String2";
		
		assertThat(s1).isNotEqualTo(s2);
		assertThat(s1).as("string 1").isNotEqualTo(s2);
	}
	
	@Test
	public void t03aAssertTrue() {
		
		boolean condition = true;
		
		assertThat(condition).isTrue();
		assertThat(condition).as("a complex condition").isTrue();
	}
	
	@Test
	public void t03bAssertFalse() {
		
		boolean condition = false;
		assertThat(condition).isFalse();
		assertThat(condition).as("a complex condition").isFalse();
		
	}
	
	@Test
	public void t04aAssertNull() {
		
		Object myObject = null;
	
		assertThat(myObject).isNull();
		assertThat(myObject).as("an object not initialized").isNull();
	}
	
	@Test
	public void t04bAssertNotNull() {
		
		Object myObject = new Object();
		
		assertThat(myObject).isNotNull();
		assertThat(myObject).as("a good object").isNotNull();
	}
	
	@Test
	public void t05aAssertSame() {
		Object o1 = new Object();
		Object o2 = o1;
		assertThat(o1).isSameAs(o2);
		assertThat(o1).as("an object").isSameAs(o2);
	}
	
	@Test
	public void t05bAssertNotSame() {
		Object o1 = new Object();
		Object o2 = new Object();
		assertThat(o1).isNotSameAs(o2);
		assertThat(o1).as("object 1").isNotSameAs(o2);
		
	}
	

}
