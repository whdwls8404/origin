package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import common.ModelAndView;
import model.BoaedListService;
import model.BoaedService;


@WebServlet("*.do")


public class BoardController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public BoardController() {
        super();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		
		String requestURI = request.getRequestURI();                     /*   /BATCH/student/list.do   */    
		String contextPath = request.getContextPath();                   /*   /BATCH                   */
		String command = requestURI.substring(contextPath.length() + 1); /*   student/list.do          */
		
		ModelAndView mav = null;
		BoaedService service = null;
		switch (command) {
		case "studentList.do":
			service = new BoaedListService();
			break;
		case "insertForm.do":
			mav = new ModelAndView("ReServerProgram/listBoard.jsp", false);
			break;
		}
		
		if (service != null) {
			try {
				mav = service.execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		if (mav != null) {
			if (mav.isRedirect()) {
				response.sendRedirect(mav.getView());
			} else {
				request.getRequestDispatcher(mav.getView()).forward(request, response);
			}
		}
		
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}
