package org.tnsindia.client;

import java.util.List;
import java.util.Scanner;

import org.tnsindia.entities.Student;
import org.tnsindia.service.StudentService;
import org.tnsindia.service.StudentServiceImpl;

public class Client
{

	public static void main(String[] args) 
	{
		int choice;
		StudentService service=new StudentServiceImpl();
		Scanner sc=new Scanner(System.in);
		do
		{
			System.out.println("Enter the Choice: "
					+ "\n 1.Insert a student"
					+"\n 2.Retreive a particular student"
					+"\n 3.Retreive all the students"
					+"\n 4.update a student"
					+"\n 5.delete a student"
					+"\n -1.Exit");
			choice=sc.nextInt();
			switch(choice)
			{
				case 1:
				{
					System.out.println("Enter the details of the student");
					Student student=new Student(sc.nextInt(),sc.next());
					if(service.AddStudent(student))
						System.out.println("Student added successfully");
					else
						System.out.println("Not added");
				}
				break;
				case 2:
				{
					System.out.println("Enter the rollno of student  whose details are required");
					Student student;
					try 
					{
						student=service.GetStudent(sc.nextInt());
					}
					catch(Exception e)
					{
						student=null;
					}
					if(student!=null)
					{
						System.out.println(student);
					}
					else
					{
						System.out.println("Roll no not found");
					}
					
				}
				break;
				case 3:
				{
					List<Student>students=service.GetStudents();
					for(Student s: students)
						System.out.println(s);
				}
				break;
				case 4:
				{
					System.out.println("Enter the Rollno of the student to update a data");
					Student student=new Student();
					student.setRollno(sc.nextInt());
					System.out.println("Enter the updated details");
					sc.nextLine();
					student.setName(sc.nextLine());
					
					
					Student s=service.updateStudent(student);
					if(s!=null)
						System.out.println(s);
					else
						System.out.println("Student not found");
					
				}
				break;
				case 5:
				{
					System.out.println("Enter the rollno that want to delete");
					boolean success=service.DeleteStudent(sc.nextInt());
					if(success)
						System.out.println("deleted successfully");
					else
						System.out.println("rollno not found");
				}
				break;
				case -1:
				{
					System.out.println("Thank You");
				}
				break;
				default:
					System.out.println("Enter the correct choice");
					break;
			}
			
		}while(choice>0);
	}
}				
			
			

	


