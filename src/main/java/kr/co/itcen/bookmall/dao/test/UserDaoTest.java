package kr.co.itcen.bookmall.dao.test;

import java.util.List;

import kr.co.itcen.bookmall.dao.UserDao;
import kr.co.itcen.bookmall.vo.UserVo;

public class UserDaoTest {

	public static void main(String[] args) {
		//deleteAllTest();
		//insertTest();
		selectTest();
		

	}

	private static void deleteAllTest() {
		new UserDao().delete();
		
	}

	private static void selectTest() {
		UserDao dao = new UserDao();
		
		List<UserVo> list = dao.getList();
		
		for(UserVo vo:list) {
			System.out.println(vo);
		}
	}

	private static void insertTest() {
		UserDao dao = new UserDao();
		UserVo vo1 = new UserVo();
		vo1.setName("윤종진");
		vo1.setPhone("010-1111-2222");
		vo1.setEmail("aaa@naver.com");
		vo1.setPasswd(1234);
		dao.insert(vo1);
		
		UserVo vo2 = new UserVo();
		
		vo2.setName("윤종진2");
		vo2.setPhone("010-1112-2223");
		vo2.setEmail("aab@naver.com");
		vo2.setPasswd(1234);
		dao.insert(vo2);
		
	}

}
