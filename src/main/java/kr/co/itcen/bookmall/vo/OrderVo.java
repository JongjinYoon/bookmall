package kr.co.itcen.bookmall.vo;

public class OrderVo {
	private Long no;
	private int price;
	private String arrival;
	private Long userNo;
	@Override
	public String toString() {
		return "OrderVo [ 번호 : " + no + " price : " + price + ", arrival : " + arrival + ", userNo : " + userNo + "]";
	}
	public Long getNo() {
		return no;
	}
	public void setNo(Long no) {
		this.no = no;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getArrival() {
		return arrival;
	}
	public void setArrival(String arrival) {
		this.arrival = arrival;
	}
	public Long getUserNo() {
		return userNo;
	}
	public void setUserNo(Long userNo) {
		this.userNo = userNo;
	}
	
}
