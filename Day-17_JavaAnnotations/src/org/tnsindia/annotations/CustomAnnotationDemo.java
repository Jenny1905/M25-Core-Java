package org.tnsindia.annotations;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;

//Custom Annotation with Multi-value Annotations
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@interface Custom
{
	//abstract method
	String print();
	int speed();
	float salary();
}
class CustomAnnotationClass
{
	@Custom(print="Hello Guys!",speed=50,salary=65000.30f)
	public void display()
	{
		System.out.println("Hurrah! Its Sunday and its Funnnnnnnnnnn day");
	}
}
public class CustomAnnotationDemo {

	public static void main(String[] args) throws NoSuchMethodException, Exception {
		CustomAnnotationClass c=new CustomAnnotationClass();
		c.display();
		Method m=c.getClass().getMethod("display");
		Custom obj=m.getAnnotation(Custom.class);
		System.out.println(obj.print());
		System.out.println(obj.speed());

		System.out.println(obj.salary());


	}

}
