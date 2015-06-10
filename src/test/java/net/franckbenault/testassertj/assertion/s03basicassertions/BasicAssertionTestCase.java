package net.franckbenault.testassertj.assertion.s03basicassertions;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class BasicAssertionTestCase {

	
	@Test
	public void t01isEmpty() {
		List<String> myList = new ArrayList<String>();
		
		assertThat(myList).isEmpty();
	}
	
	@Test
	public void t02hasSize() {
		List<String> myList = new ArrayList<String>();
		myList.add("String1");
		myList.add("String2");
		
		assertThat(myList).isNotEmpty().hasSize(2);
	}
	

}
