package kr.co.itcen.bookmall.dao.test;

import java.util.List;

import kr.co.itcen.bookmall.dao.BookDao;
import kr.co.itcen.bookmall.dao.OrderDao;
import kr.co.itcen.bookmall.vo.BookVo;
import kr.co.itcen.bookmall.vo.OrderVo;

public class OrderDaoTest {
	public static void main(String[] args) {

		deleteTest();
		insertTest();
		selectTest();
	}

	private static void selectTest() {
		OrderDao dao = new OrderDao();

		List<OrderVo> list = dao.getList();

		for (OrderVo vo : list) {
			System.out.println(vo);
		}
		
	}

	private static void insertTest() {
		OrderDao dao = new OrderDao();
		
		OrderVo vo1 = new OrderVo();
		vo1.setArrival("우리집");
		dao.insert(vo1,"소설");
		
	}

	private static void deleteTest() {
		
		
	}
}
