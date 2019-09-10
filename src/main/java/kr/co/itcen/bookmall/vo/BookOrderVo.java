package kr.co.itcen.bookmall.vo;

public class BookOrderVo {
	private Long userNo;
	private Long orderNo;
	private int count;
	@Override
	public String toString() {
		return "BookOrderVo [userNo=" + userNo + ", orderNo=" + orderNo + ", count=" + count + "]";
	}
	public Long getUserNo() {
		return userNo;
	}
	public void setUserNo(Long userNo) {
		this.userNo = userNo;
	}
	public Long getOrderNo() {
		return orderNo;
	}
	public void setOrderNo(Long orderNo) {
		this.orderNo = orderNo;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
}
