package org.tnsindia.junit5demo;

//Demo on ParameterizedTest 
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class ParameterizedTestDemo {

	@DisplayName("Demo on ParameterizedTest")
	@ParameterizedTest
	//Source annotation
	@ValueSource(ints= {11,22,33})
	void display(int arg)
	{
		assertTrue(arg>10);
	}

}
