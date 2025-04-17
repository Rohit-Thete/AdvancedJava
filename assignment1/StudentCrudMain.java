package exampleStudent;

import java.util.Collection;
import java.util.Scanner;

public class StudentCrudMain {
	private static void showAllStudents()
	{
		StudDaoJdbc<Student, Integer> dao = new studentDao();
		Collection<Student> studList = dao.getAll();
		
		studList.stream().forEach(stud -> System.out.println(stud));
	}
	private static void showOneStudent(int rno)
	{
		StudDaoJdbc<Student, Integer> dao = new studentDao();
		Student foundStudent = dao.getOne(rno);
		if(foundStudent!=null)
		{
			System.out.println(foundStudent);
		}
		else
			System.out.println("Student not found ...");
	}
	

	private static void addNewStudent(int rno,String name,String city)
	{
		StudDaoJdbc<Student, Integer> dao = new studentDao();
		Student stud = new Student(rno,name,city);
		dao.add(stud);
	}
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		int ch;
		int rno = 0;
		String name = null;
		String city = null;
		boolean exit = true;
		
		while(exit)
		{
			System.out.println("1.Show All Students");
			System.out.println("2.Get Student By roll No ");
			System.out.println("3.Add New Student ");
			System.out.println("0.Exit");
			System.out.println("Enter your choice : ");
			ch = sc.nextInt();
			switch(ch)
			{
			case 1:
				System.out.println("----- All Students ----");
				showAllStudents();
				break;
				
			case 2:
				System.out.println("---- Student ---- ");
				System.out.println("Enter Roll no : ");
				rno = sc.nextInt();
				showOneStudent(rno);
				break;
				
			case 3:
				System.out.println("--- Add new Student ----");
				System.out.println("Enter Roll no : ");
				rno = sc.nextInt();
				System.out.println("Enter Name : ");
				name =sc.next();
				System.out.println("Enter city : ");
				city = sc.next();
				addNewStudent(rno, name, city);
				break;
				
			case 0:
				exit = false;
				break;
			}
		}

	}

}
