package org.tnsindia.interfaceexample;


import java.util.Scanner;

//Marker interface
/*A marker interface called ThreadSafe can communicate to other developers 
 * that classes implementing this marker interface give a thread-safe guarantee,
 *  and any modification should not violate that.
 */


interface Clonable
{
	/*It is an empty interface (no field or methods). Examples of marker interface are 
	 * Serializable,
	 * Cloneable and Remote interface. 
	 * All these interfaces are empty interfaces. 
	NOTE:-If we not use Clonable as interface still its run because Clonable is marker interface in java*/
}
class Product implements Cloneable   
{  
	public int pid;  
	public String pname;  
	public double pcost;  
	//Product class constructor   
	public Product (int pid, String pname, double pcost)  
	{  
		this.pid = pid;  
		this.pname = pname;  
		this.pcost = pcost;  
	}  
	//method that prints the detail on the console  
	public void showDetail()   
	{  
		System.out.println("Product ID: "+pid);  
		System.out.println("Product Name: "+pname);  
		System.out.println("Product Cost: "+pcost);  
	}  
}
public class MarkerInterfaceDemo {

	public static void main(String[] args) {
		
		
		//reading values of the product from the user  
		Scanner sc = new Scanner(System.in);  
		System.out.print("Enter product ID: ");  
		int pid = sc.nextInt();  
		System.out.print("Enter product name: ");  
		String pname = sc.next();  
		System.out.print("Enter product Cost: ");  
		double pcost = sc.nextDouble();  
		System.out.println("-------Product Detail--------");  
		Product p1 = new Product(pid, pname, pcost);  
		//cloning the object of the Product class using the clone() method  
		p1.showDetail();  
		sc.close();
		}  
		

	

}
