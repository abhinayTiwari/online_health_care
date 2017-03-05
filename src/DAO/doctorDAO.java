package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import VO.doctorVO;

public class doctorDAO {
	
	Connection con = null;
	public List doctor_list(){
		List doctor_list = new ArrayList();
		
		try{
		//patientVO patientDAO_patientVO = new patientVO();
		Class.forName("com.mysql.jdbc.Driver");
	    Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/healthcare_db","root", "11111");
	    
	    String sql1="select * from doctor";
	    System.out.println(sql1);
	    
	    Statement statement = conn.createStatement();
		 ResultSet set=statement.executeQuery(sql1);
		 while(set.next()){
			 doctorVO doctorDAO_doctorVO = new doctorVO();
			 System.out.println(set.getInt("usr_doc_id"));
			 System.out.println(set.getString("firstname"));
			 doctorDAO_doctorVO.setDoctorvo_id(set.getInt("usr_doc_id"));
			 doctorDAO_doctorVO.setDoctorvo_name(set.getString("firstname"));
			 doctor_list.add(doctorDAO_doctorVO);
		 }
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return doctor_list;
		
	}
	
	public String getUsertype(String userName){
		String userType = "";
		con = DBConnection.createConnection();
		Statement stmt;
		try {
			stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("select * from users where username ='"+userName+"'");
			
			if(rs.next()){
				userType = rs.getString("type");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return userType;
		
	}
	
	public ResultSet searchDoctor(doctorVO doc) throws SQLException{
		String query = createQuery(doc);
		con = DBConnection.createConnection();
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery(query);
		
		return rs;
	}

	public String createQuery(doctorVO doc){
		
		StringBuilder query = new StringBuilder();
		query.append("select firstname,lastname,consult_hsptl from doctor where");
		if(doc.getHsptl_city()!=""){
			query.append(" hsptl_city = \'"+doc.getHsptl_city()+"\' and");
		}
		if(doc.getHsptl_state()!=""){
			query.append(" hsptl_state = \'"+doc.getHsptl_state()+"\' and");
		}
		if(doc.getHsptl_zipcode()!=""){
			query.append(" hsptl_zipcode = \'"+doc.getHsptl_zipcode()+"\' and");
		}
		if(doc.getDoc_dept()!=""){
			query.append(" doc_dept = \'"+doc.getDoc_dept()+"\' and");
		}
		if(doc.getDoc_spl()!=""){
			query.append(" doc_specialization = \'"+doc.getDoc_spl()+"\' and");
		}
		if(doc.getExp()!=0){
			query.append(" Experience = "+doc.getExp());
		}
		String searchQuery = query.toString(); 
		if(searchQuery.endsWith("and") || searchQuery.endsWith("where")){
			searchQuery = query.substring(0,query.length()-4).toString();
		}
		System.out.println(searchQuery);
		return searchQuery;
	}
}