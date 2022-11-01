package org.tnsindia.junit5demo;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.DynamicTest.dynamicTest;
import java.util.Arrays;
import java.util.Collection;
import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestFactory;
import org.junit.jupiter.api.function.Executable;

class DynamicTestDemo {

	//dynamic Test
	@TestFactory
	Collection<DynamicTest>print()
	{
		return Arrays.asList(dynamicTest("Simple Dynamic Test",()->assertTrue(true)),
				dynamicTest("My Executable class",new  MyExecutableDynamicTestDemo())
				);
	}

}

class MyExecutableDynamicTestDemo implements Executable
{

	@Override
	public void execute() throws Throwable {
		System.out.println("Welcome to M25 Batch");
		
	}
	
}