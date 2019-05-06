package Service;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.omg.Messaging.SyncScopeHelper;

import action.StudentAction;
import sun.security.util.Password;
import action.*;
/**
 * Servlet implementation class StudentService
 */
@WebServlet("/StudentService")
public class StudentService extends HttpServlet {
	 
	private static final long serialVersionUID = 1L;
     
    /**
     * @see HttpServlet#HttpServlet()
     */
    public StudentService() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		try {
			 String password; 
			 String username;
			 request.setCharacterEncoding("UTF-8");
			username = request.getParameter("username");
			password = request.getParameter("password");
			System.out.println(username);
			StudentAction a = new StudentAction();
			System.out.println(a.select(username, password));
			if(a.select(username, password) == 1)
			{
				response.setCharacterEncoding("UTF-8");
				response.getWriter().append("登录成功").append(request.getContextPath());
				
			}
		
		}
		catch (Exception e) {
			// TODO: handle exception

			e.printStackTrace();
		}
	
		
		 
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
