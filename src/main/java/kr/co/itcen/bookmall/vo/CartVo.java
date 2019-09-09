package kr.co.itcen.bookmall.vo;

public class CartVo {
	private Long userNo;
	private Long bookNo;
	public String toString() {
		return "사용자 번호 : "+ userNo + "도서 번호 : " + bookNo;
	}
	public Long getUserNo() {
		return userNo;
	}
	public void setUserNo(Long userNo) {
		this.userNo = userNo;
	}
	public Long getBookNo() {
		return bookNo;
	}
	public void setBookNo(Long bookNo) {
		this.bookNo = bookNo;
	}
}
