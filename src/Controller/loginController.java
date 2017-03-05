package Controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import DAO.doctorDAO;
import DAO.loginDAO;
import DAO.patientDAO;
import VO.loginVO;

/**
 * Servlet implementation class loginController
 */
@WebServlet("/loginController")
public class loginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public loginController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		
		
		loginDAO loginController_status = new loginDAO();
		loginVO loginController_loginVO = new loginVO();
		loginVO loginController_loginVO_status = new loginVO();
		String loginController_username = request.getParameter("user");
		String loginController_password = request.getParameter("pass");
		
	    String loginController_userType = "";
		loginController_loginVO.setUsername(loginController_username);
		loginController_loginVO.setPassword(loginController_password);
	
		loginController_loginVO_status = loginController_status.logincheck(loginController_loginVO);
		
		if(loginController_username.equals("admin") && loginController_password.equals("admin"))
		{
			HttpSession session = request.getSession();
			List doctorController_session_list = new ArrayList();
			doctorDAO doctorDAO_doctorController = new doctorDAO();
			doctorController_session_list = doctorDAO_doctorController.doctor_list();
			session.setAttribute("session_doctor_list", doctorController_session_list);
			
			
			List patientController_session_list = new ArrayList();
			patientDAO patientDAO_patientController = new patientDAO();
			patientController_session_list = patientDAO_patientController.patient_list();
			session.setAttribute("session_patient_list", patientController_session_list);
			response.sendRedirect("adminHome.jsp");
		}
		
		else if(loginController_loginVO_status.isStatus()){
			HttpSession session = request.getSession();
			doctorDAO doctorDAO_doctorController = new doctorDAO();
			loginController_loginVO.setUserType(doctorDAO_doctorController.getUsertype(loginController_username));
			session.setAttribute("username", loginController_username);
			System.out.println(loginController_loginVO.getUserType());

	        if(loginController_loginVO.getUserType().equals("D")){
	        	response.sendRedirect("docHome.jsp");
	        }else{
	        	System.out.println(loginController_username);
				response.sendRedirect("home.jsp");
	        }
			
			
			
		}
		else
		{
			String str = "Invalid Username or password";
			
	    	RequestDispatcher rd=request.getRequestDispatcher("login.jsp");  
	    	request.setAttribute("s1", str);
	        rd.forward(request, response);
			
		}
	}

}
