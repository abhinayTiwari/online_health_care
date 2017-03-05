package Controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import DAO.patientDAO;
import DAO.patientProfileDAO;
import VO.patientProfileVO;

/**
 * Servlet implementation class patientProfileController
 */
@WebServlet("/patientProfileController")
public class patientProfileController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public patientProfileController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		System.out.println("patientProfile");
		
		HttpSession session = request.getSession();
		String username = (String) session.getAttribute("username");
		List l = new ArrayList();
		patientProfileVO p = new patientProfileDAO().patientProfile_list(username);
		System.out.println("p ka value" + p);
		session.setAttribute("session_patient_list", p);
		//response.sendRedirect("profile.jsp");
		request.getRequestDispatcher("profile.jsp").forward(request, response);
	}
	/*private void editPost(HttpServletRequest request,
			HttpServletResponse response) throws IOException {
		// TODO Auto-generated method stub
		//String username=request.getParameter("username");
		
		//patientProfileVO patientprofileVO=new patientProfileVO();
		//patientprofileVO.setPostId(id);
		
		//PostDAO postDAO=new PostDAO();
		//List ls= postDAO.EditPost(postVO);
		
		//HttpSession session=request.getSession();
		//session.setAttribute("postList", ls);
		
		//response.sendRedirect("Project_Admin/manage_editpost.jsp");
		
		
		
	}*/
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		
	}

}
