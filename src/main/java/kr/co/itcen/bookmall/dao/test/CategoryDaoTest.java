package kr.co.itcen.bookmall.dao.test;

import java.util.List;

import kr.co.itcen.bookmall.dao.CategoryDao;
import kr.co.itcen.bookmall.vo.CategoryVo;

public class CategoryDaoTest {

	public static void main(String[] args) {
		//deleteAllTest();
		//insertTest();
		selectTest();
		

	}

	private static void deleteAllTest() {
		new CategoryDao().delete();
		
	}

	private static void selectTest() {
		CategoryDao dao = new CategoryDao();
		List<CategoryVo> list = dao.getList();
		
		for(CategoryVo vo:list) {
			System.out.println(vo);
		}
	}

	private static void insertTest() {
		CategoryDao dao = new CategoryDao();
		CategoryVo vo1 = new CategoryVo();
		vo1.setName("소설");
		dao.insert(vo1);
		
		CategoryVo vo2 = new CategoryVo();
		vo2.setName("수필");
		dao.insert(vo2);
		
		CategoryVo vo3 = new CategoryVo();
		vo3.setName("시");
		dao.insert(vo3);
	}

}
