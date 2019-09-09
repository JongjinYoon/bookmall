package kr.co.itcen.bookmall.dao.test;

import java.util.List;

import kr.co.itcen.bookmall.dao.CartDao;
import kr.co.itcen.bookmall.vo.CartVo;


public class CartDaoTest {

	public static void main(String[] args) {
		
		insertTest();
		deleteTest();
		selectTest();
	}
	
	private static void deleteTest() {
		new CartDao().delete();
		
	}

	private static void selectTest() {
		CartDao dao = new CartDao();
		
		List<CartVo> list = dao.getList();
		
		for(CartVo vo:list) {
			System.out.println(vo);
		}
	}

	private static void insertTest() {
		CartDao dao = new CartDao();
		String name,title;
		CartVo vo1 = new CartVo();
		dao.insert("윤종진","소설책");
		
		CartVo vo2 = new CartVo();
		dao.insert("윤종진2","시집");
		
	}

}
