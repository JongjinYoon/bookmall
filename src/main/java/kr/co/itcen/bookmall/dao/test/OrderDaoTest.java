package kr.co.itcen.bookmall.dao.test;

import java.util.List;

import kr.co.itcen.bookmall.dao.BookDao;
import kr.co.itcen.bookmall.dao.BookOrderDao;
import kr.co.itcen.bookmall.dao.OrderDao;
import kr.co.itcen.bookmall.vo.BookVo;
import kr.co.itcen.bookmall.vo.OrderVo;

public class OrderDaoTest {
	public static void main(String[] args) {

		//deleteTest();
		//insertTest();
		//updateTest();
		selectTest();
	}

	private static void updateTest() {
		new OrderDao().update((long) 1);
		
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
		vo1.setPrice(60000);
		dao.insert(vo1,"윤종진");
		
	}

	private static void deleteTest() {
		new OrderDao().delete();
		
	}
}
