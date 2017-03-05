package DAO;

import java.sql.Connection;
import java.sql.DriverManager;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import VO.patientVO;

public class patientDAO {
public List patient_list(){
		List patient_list = new ArrayList();
		
		try{
		//patientVO patientDAO_patientVO = new patientVO();
		Class.forName("com.mysql.jdbc.Driver");
	    Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/healthcare_db","root", "11111");
	    
	    String sql1="select * from Patient";
	    System.out.println(sql1);
	    
	    Statement statement = conn.createStatement();
		 ResultSet set=statement.executeQuery(sql1);
		 while(set.next()){
			 patientVO patientDAO_patientVO = new patientVO();
			 System.out.println(set.getString("usr_pat_id"));
			 System.out.println(set.getString("firstname"));
			 patientDAO_patientVO.setPatientvo_id(set.getInt("usr_pat_id"));
			 patientDAO_patientVO.setPatientvo_name(set.getString("firstname"));
			 patient_list.add(patientDAO_patientVO);
		 }
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return patient_list;
		
	}

}
