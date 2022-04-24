package Week5Day1;

import org.testng.annotations.Test;

public class testAnnotationsAttributes {
	@Test(invocationCount = 2, priority = 1)
	public void createLead() {
		System.out.println("This will be executed twice");

	}

	@Test(enabled = false)
	public void editLead() {
		System.out.println("This will not be executed");

	}

	@Test
	public void deleteLead() {
		System.out.println("This is default priority");

	}
}
