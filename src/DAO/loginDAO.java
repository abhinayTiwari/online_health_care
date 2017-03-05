package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import com.mysql.fabric.Response;

import VO.loginVO;

public class loginDAO {
	public loginVO logincheck(loginVO loginVO)
	{	
		loginVO res=new loginVO();
		
		try {
			
		 
		 Class.forName("com.mysql.jdbc.Driver");
		 Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/healthcare_db","root", "11111");
		 String sql="SELECT * FROM users WHERE username ='"+loginVO.getUsername()+"' AND password = '"+loginVO.getPassword()+"'";
		 System.out.println(sql);
	     Statement statement = conn.createStatement();
	     ResultSet set=statement.executeQuery(sql);
	     
	     if(set.next())
	     {
	    	res.setStatus(true);
	    	//res.setFirstname(set.getString("FirstName"));
	    	
	    	//System.out.println(res.getUsername() + res.getPassword());
	    	
	    	//res.setLastname(set.getString("lastname"));
	     
	     
	    	 
	     }
	     else{
	    	 res.setStatus(false);
	     }
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		return res;
	}

}
