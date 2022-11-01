package org.tnsindia.junit5demo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class FirstJunit5Test {

	@Test
	//it will perform the testing on the method
	void test() {
		System.out.println("Hello Everyone");
	}

	@Test
	@Disabled
	void display() {
		fail("hi");
	}
}
