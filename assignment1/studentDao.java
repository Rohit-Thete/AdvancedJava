package exampleStudent;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collection;


import example.jdbc.JdbcUtils;

public class studentDao implements StudDaoJdbc<Student, Integer>{

	@Override
	public Collection<Student> getAll() {
		Collection<Student> students = new ArrayList<>();
		try (
				Connection dbConnection = JdbcUtilsStudent.buildConnection();
				Statement stmt = dbConnection.createStatement();
				ResultSet rs = stmt.executeQuery("select * from stud");){
			
			while(rs.next())
			{
				int rno = rs.getInt(1);
				String name = rs.getString(2);
				String city = rs.getString(3);
				Student stud = new Student(rno,name,city);
				students.add(stud);
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return students;
	}

	@Override
	public Student getOne(Integer rno) {
		Student foundStudent = null;
		String sqlQuery = "select * from stud where rollno = ? ";
		try(
				Connection dbConnection = JdbcUtilsStudent.buildConnection();
				PreparedStatement pstmt = dbConnection.prepareStatement(sqlQuery);
				)
		{
			pstmt.setInt(1, rno);
			ResultSet rs = pstmt.executeQuery();
			if(rs.next())
			{
			int rollno = rs.getInt(1);
			String name = rs.getString(2);
			String city = rs.getString(3);
			foundStudent = new Student(rollno,name,city);
				
			}
		}catch (Exception e) {
			// TODO: handle exception
		}
		return foundStudent;
	}

	@Override
	public void add(Student stud) {
		String sqlQuery = "insert into stud values (?,?,?)";
		try(
				Connection dbConnection = JdbcUtilsStudent.buildConnection();
				PreparedStatement pstmt = dbConnection.prepareStatement(sqlQuery);
				)
		{
			int rno = stud.getRollNo();
			String name = stud.getName();
			String city = stud.getCity();
			
			pstmt.setInt(1, rno);
			pstmt.setString(2, name);
			pstmt.setString(3, city);
			int updateCount = pstmt.executeUpdate();
			System.out.println(updateCount + " Record inserted ");
		}catch (Exception e) {
			// TODO: handle exception
		}
		
			
		
		
	}

	@Override
	public void update(Student t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Student key) {
		// TODO Auto-generated method stub
		
	}
	

}
