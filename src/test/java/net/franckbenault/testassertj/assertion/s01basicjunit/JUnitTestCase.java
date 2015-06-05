package net.franckbenault.testassertj.assertion.s01basicjunit;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

public class JUnitTestCase {

	@Test
	public void t02aAssertEquals() {
		String s1 = "String";
		
		assertThat(s1).isEqualTo("String");
		assertThat(s1).as("s1").isEqualTo("String");
		
	}

}
