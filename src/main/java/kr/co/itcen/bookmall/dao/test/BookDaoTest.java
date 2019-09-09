package kr.co.itcen.bookmall.dao.test;

import java.util.List;

import kr.co.itcen.bookmall.dao.BookDao;
import kr.co.itcen.bookmall.dao.CategoryDao;
import kr.co.itcen.bookmall.vo.BookVo;
import kr.co.itcen.bookmall.vo.CategoryVo;

public class BookDaoTest {

	public static void main(String[] args) {
		
		deleteTest();
		insertTest();
		selectTest();
	}

	private static void deleteTest() {
		new BookDao().delete();

	}

	private static void selectTest() {
		BookDao dao = new BookDao();

		List<BookVo> list = dao.getList();

		for (BookVo vo : list) {
			System.out.println(vo);
		}
	}

	private static void insertTest() {
		BookDao dao = new BookDao();
		
		BookVo vo1 = new BookVo();
		vo1.setTitle("소설책");
		vo1.setPrice((long) 30000);
		dao.insert(vo1,"소설");

		BookVo vo2 = new BookVo();
		vo2.setTitle("수필책");
		vo2.setPrice((long) 20000);
		dao.insert(vo2,"수필");

		BookVo vo3 = new BookVo();
		vo3.setTitle("시집");
		vo3.setPrice((long) 10000);
		dao.insert(vo3,"시");
	}

}
