package model;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import common.ModelAndView;
import dao.BoardDao;
import dto.BoardDTO;

public class BoaedListService implements BoaedService {

	@Override
	public ModelAndView execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		HttpSession session = request.getSession();
		
		BoardDTO boardDTO = (BoardDTO) session.getAttribute("boaed");
		if (boardDTO != null) {
			session.getAttribute("boaed");
		}
		
		if (session.getAttribute("open") != null) {
			session.removeAttribute("open");
		}
		
		List<BoardDTO> list = BoardDao.getInstance().selectNoticeList();
		
		request.setAttribute("list", list);
		
		return new ModelAndView("views/listBoard.jsp", false);
	}

}
