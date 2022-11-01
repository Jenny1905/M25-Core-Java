package org.tnsindia.junit5demo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AssertDemo {

	@Test
	public void assertdemo()
	{
		//Fails when expected does not equal actual
		assertEquals(7,7);
	}
	
	@Test
	public void assertdemo1()
	{
		//Fails when actual is not null
		assertNull(null);
	}

}
