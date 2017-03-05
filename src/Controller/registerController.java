package Controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.registerDAO;
import VO.doctorVO;

/**
 * Servlet implementation class registerController
 */
@WebServlet("/registerController")
public class registerController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public registerController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		registerDAO rdao = new registerDAO();
		String user = request.getParameter("user");
		String username = request.getParameter("username");
		String pass = request.getParameter("pass");
		if(user.equals("patient")){
			System.out.println("Creating patient");
			try {
				rdao.createUser(username,pass,"P");
				//rdao.createPatient();
				PrintWriter out = response.getWriter();
				out.print("<center><h3><font color=\"red\">Account Registered</font></h3></center>");  
				RequestDispatcher rd=request.getRequestDispatcher("login.jsp");
				rd.forward(request,response);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}else if(user.equals("doctor")){
			System.out.println("Creating doctor");
			doctorVO doctor = new doctorVO();
			doctor.setDoctorvo_name(request.getParameter("fname"));
			doctor.setUsername(request.getParameter("username"));
			if(request.getParameter("gender").equalsIgnoreCase("female")){
				doctor.setGender("F");
			}else{
				doctor.setGender("M");
			}
			doctor.setMobile(Integer.parseInt(request.getParameter("mobile")));
			doctor.setEmail(request.getParameter("email"));
			doctor.setHsptl_address(request.getParameter("address"));
			doctor.setHsptl_city(request.getParameter("city"));
			doctor.setHsptl_state(request.getParameter("state"));
			doctor.setHsptl_zipcode(request.getParameter("zipcode"));
			doctor.setExp(10);
			doctor.setConsult_hsptl("Albany Med");
			doctor.setId_num("swthainvdjfnkd");
			doctor.setDoc_spl("General Physician");
			doctor.setDoc_dept("ss");
			doctor.setPrac_start_year(1997);
			
			try {
				rdao.createUser(username,pass,"D");
				rdao.createDoctor(doctor);
				PrintWriter out = response.getWriter();
				out.print("<center><h3><font color=\"red\">Account Registered</font></h3></center>");  
				RequestDispatcher rd=request.getRequestDispatcher("login.jsp");
				rd.forward(request,response);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}

}
