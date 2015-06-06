package net.franckbenault.testassertj.assertion.s01fluentinterface;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

public class FluentInterfaceTestCase {

	@Test
	public void t02aAssertEquals() {
		String s1 = "Frodo";
		
		assertThat(s1).startsWith("Fro")
        	.endsWith("do")
        	.isEqualToIgnoringCase("frodo");

		
	}

}
