package kr.co.itcen.bookmall.dao.test;

import java.util.List;

import kr.co.itcen.bookmall.dao.BookDao;
import kr.co.itcen.bookmall.dao.BookOrderDao;
import kr.co.itcen.bookmall.dao.OrderDao;
import kr.co.itcen.bookmall.vo.BookOrderVo;
import kr.co.itcen.bookmall.vo.BookVo;
import kr.co.itcen.bookmall.vo.OrderVo;

public class BookOrderDaoTest {

	public static void main(String[] args) {
		//deleteTest();
		//insertTest();
		selectTest();
		
	}

	
	private static void deleteTest() {
		new BookOrderDao().delete();
		
	}

	private static void insertTest() {
		BookOrderDao dao = new BookOrderDao();
		
		BookOrderVo vo1 = new BookOrderVo();
		vo1.setCount(3);
		vo1.setUserNo((long) 1);
		dao.insert(vo1,"소설책");
		
		BookOrderVo vo2 = new BookOrderVo();
		vo2.setCount(2);
		vo2.setUserNo((long) 1);
		dao.insert(vo2,"시집");
		
	}

	private static void selectTest() {
		BookOrderDao dao = new BookOrderDao();

		List<BookOrderVo> list = dao.getList();

		for (BookOrderVo vo : list) {
			System.out.println(vo);
		}
		
	}

}
