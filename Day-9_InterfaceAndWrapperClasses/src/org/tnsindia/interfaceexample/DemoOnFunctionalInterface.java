package org.tnsindia.interfaceexample;
 //example on FunctionalInterface
/*We can use the @FunctionalInterface annotation to ensure that there is
not more than one abstract method in a functional interface.*/

@FunctionalInterface
interface FunctionalInterfacee{  
	
	/*FunctionalInterface contains exactly one abstract method*/
    void accept(String msg);  
}  
class FunctionalInterfaceExample implements FunctionalInterfacee{  
    public void accept(String msg){  
        System.out.println(msg);  
    }  
    
}  
public class DemoOnFunctionalInterface {

		public static void main(String[] args) {  
	        FunctionalInterfaceExample f = new FunctionalInterfaceExample();  
	        f.accept("Hello there");  
	    

	}

}
