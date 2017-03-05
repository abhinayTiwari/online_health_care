package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import VO.patientProfileVO;
import VO.patientVO;

public class patientProfileDAO {
	public patientProfileVO patientProfile_list(String username){
		List patientProfile_list = new ArrayList();
		 patientProfileVO p = new patientProfileVO();
		try{
		//patientVO patientDAO_patientVO = new patientVO();
		Class.forName("com.mysql.jdbc.Driver");
	    Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/healthcare_db","root", "11111");
	    String sql1="select * from patient where username='"+username+"'";
	    //String sql1="select username,FirstName,MiddleName,LastName,Gender,MobileNum,DOB,Email_Id,Address,City,State,Zipcode,Nationality,Marital_Status from patient where username='"+username+"'";
	    System.out.println(sql1);
	        
	    Statement statement = conn.createStatement();
	    ResultSet set=	statement.executeQuery(sql1);
	   
		 while(set.next()){
			 System.out.println(set.getString("username"));
			 //patientProfileVO p = new patientProfileVO();
			 p.setPatientProfileVO_firstName(set.getString("FirstName"));
			 p.setPatientProfileVO_middleName(set.getString("MiddleName"));
			 p.setPatientProfileVO_lastName(set.getString("LastName"));
			 p.setPatientProfileVO_emailId(set.getString("Email_Id"));
			 //p.setPatientProfileVO_mobileNo(set.getInt("MobileNum"));
			 p.setPatientProfileVO_address(set.getString("Address"));
			 p.setPatientProfileVO_gender(set.getString("Gender"));
			 p.setPatientProfileVO_DOB(set.getString("DOB"));
			 p.setPatientProfileVO_city(set.getString("City"));
			 p.setPatientProfileVO_state(set.getString("State"));
			 p.setPatientProfileVO_zipCode(set.getInt("Zipcode"));
			 p.setPatientProfileVO_nationality(set.getString("Nationality"));
			 p.setPatientProfileVO_maritalStatus(set.getString("Maritial_Status"));
			 //patientProfile_list.add(p);
			 
		 }
		 System.out.println("First Name:" +p.getPatientProfileVO_firstName());
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return p;
	}
}
