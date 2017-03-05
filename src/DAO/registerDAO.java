package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import VO.doctorVO;

public class registerDAO {

	PreparedStatement pStmt = null;
	Connection con = null;
	public void createUser(String user,String password,String type) throws SQLException{
		con = DBConnection.createConnection();
		String query = "insert into users (username,password,type) values (?,?,?)";
    	pStmt = con.prepareStatement(query);
    	pStmt.setString(1,user);
    	pStmt.setString(2,password);
    	pStmt.setString(3,type);
        pStmt.executeUpdate();  
	}
	public void createDoctor(doctorVO doc) throws SQLException{
		con = DBConnection.createConnection();
		String query = "insert into doctor (username,firstname,gender,mobile,email_id,National_Id,Consult_Hsptl,Hsptl_Address,Hsptl_City,Hsptl_State,Hsptl_Zipcode,Doc_dept,Doc_Specialization,Prac_Start_year,Experience) values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
    	pStmt = con.prepareStatement(query);
    	pStmt.setString(1,doc.getUsername());
    	pStmt.setString(2,doc.getDoctorvo_name());
    	pStmt.setString(3,doc.getGender());
    	pStmt.setInt(4,doc.getMobile());
    	pStmt.setString(5,doc.getEmail());
    	pStmt.setString(6,doc.getId_num());
    	pStmt.setString(7,doc.getConsult_hsptl());
    	pStmt.setString(8,doc.getHsptl_address());
    	pStmt.setString(9,doc.getHsptl_city());
    	pStmt.setString(10,doc.getHsptl_state());
    	pStmt.setString(11,doc.getHsptl_zipcode());
    	pStmt.setString(12, doc.getDoc_dept());
    	pStmt.setString(13, doc.getDoc_spl());
    	pStmt.setInt(14,doc.getPrac_start_year());
    	pStmt.setInt(15,doc.getExp());
    	pStmt.executeUpdate(); 
    	
    	System.out.println("Doctor profile created");
	}
}