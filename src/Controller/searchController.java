package Controller;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
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
import VO.doctorVO;

/**
 * Servlet implementation class searchController
 */
@WebServlet("/searchController")
public class searchController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public searchController() {
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
		
		doctorVO doctor = new doctorVO();
		doctorDAO docDao = new doctorDAO();
		doctor.setHsptl_city((String) request.getParameter("City"));
		doctor.setHsptl_state((String) request.getParameter("State"));
		doctor.setHsptl_zipcode((String) request.getParameter("Zipcode"));
		if(request.getParameter("Experience").equals("Years of Experience")){
			doctor.setExp(0);
		}else{
			doctor.setExp(Integer.parseInt(request.getParameter("Experience")));
		}
		doctor.setDoc_spl((String) request.getParameter("Specialization"));
		doctor.setDoc_dept((String) request.getParameter("Department"));
		ResultSet rs = null;
		try {
				rs = docDao.searchDoctor(doctor);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			HttpSession session = request.getSession();
			session.setAttribute("searchList", rs);
			RequestDispatcher rd=request.getRequestDispatcher("displaySearch.jsp");  
	        rd.forward(request,response);
	}
}
