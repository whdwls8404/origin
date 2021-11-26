package dao;
import java.util.List;
 
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import dto.BoardDTO;
import dto.ReplyDTO;
import mybatis.config.DBService;

public class BoardDAO {

	/* StudentDao의 모든 메소드는 factory에서 SqlSession을 얻어 낸다. */
	private SqlSessionFactory factory;

	private static BoardDAO instance;
	private BoardDAO() {
		factory = DBService.getInstance().getFactory();
	}
	public static BoardDAO getInstance() {
		if (instance == null) {
			instance = new BoardDAO();
		}
		return instance;
	}
	public List<BoardDTO> selectBoardList() {
		SqlSession ss = factory.openSession();
		List<BoardDTO> list = ss.selectList("dao.board.selectBoardList");
		ss.close();
		return list;
	}
	public int getTotalBoardCount() {
		SqlSession ss = factory.openSession();
		int count = ss.selectOne("dao.board.getTotalBoardCount");
		ss.close();
		return count;
	}
	public BoardDTO selectBoardByNo(Long no) {
		SqlSession ss = factory.openSession();
		BoardDTO dto = ss.selectOne("dao.board.selectBoardByNo", no);
		ss.close();
		return dto;
	}
	public int insertBoard(BoardDTO dto) {
		SqlSession ss = factory.openSession();
		int result = ss.insert("dao.board.insertBoard", dto);
		if (result > 0) ss.commit();
		ss.close();
		return result;
	}
	public int deleteBoard(Long no) {
		SqlSession ss = factory.openSession();
		int result = ss.delete("dao.board.deleteBoard", no);
		if (result > 0) ss.commit();
		ss.close();
		return result;
	}
	public boolean checkReply(Long no) {
		SqlSession ss = factory.openSession();
		ReplyDTO dto = ss.selectOne("dao.board.checkReply", no);
		ss.close();
		return dto == null;
	}
	public int updateBoardHit(Long no) {
		SqlSession ss = factory.openSession(false);
		int result = ss.update("dao.board.updateBoardHit", no);
		if (result > 0) ss.commit();
		ss.close();
		return result;
	}
	public List<ReplyDTO> selectReplyList(Long board_no) {
		SqlSession ss = factory.openSession();
		List<ReplyDTO> list = ss.selectList("dao.board.selectReplyList", board_no);
		ss.close();
		return list;
	}
	public int insertReply(ReplyDTO dto) {
		SqlSession ss = factory.openSession(false);
		int result = ss.insert("dao.board.insertReply", dto);
		if (result > 0) ss.commit();
		ss.close();
		return result;
	}
	public BoardDTO selectBoardByMaxHit() {
		SqlSession ss = factory.openSession();
		BoardDTO dto = ss.selectOne("dao.board.selectBoardByMaxHit");
		ss.close();
		return dto;
	}
	
}