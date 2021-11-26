package dto;

import java.sql.Date;

public class ReplyDTO {

	private Long no;
	private String author;
	private String content;
	private String ip;
	private Long boardno;
	private Date postdate;

	public Long getNo() {
		return no;
	}
	public void setNo(Long no) {
		this.no = no;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getIp() {
		return ip;
	}
	public void setIp(String ip) {
		this.ip = ip;
	}	

	public Long getBoardno() {
		return boardno;
	}
	public void setBoardno(Long boardno) {
		this.boardno = boardno;
	}
	public Date getPostdate() {
		return postdate;
	}
	public void setPostdate(Date postdate) {
		this.postdate = postdate;
	}
}
