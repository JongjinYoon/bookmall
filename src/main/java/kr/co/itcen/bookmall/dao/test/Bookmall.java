package kr.co.itcen.bookmall.dao.test;



import java.util.ArrayList;
import java.util.List;

import kr.co.itcen.bookmall.dao.BookDao;
import kr.co.itcen.bookmall.dao.BookOrderDao;
import kr.co.itcen.bookmall.dao.CartDao;
import kr.co.itcen.bookmall.dao.CategoryDao;
import kr.co.itcen.bookmall.dao.OrderDao;
import kr.co.itcen.bookmall.dao.UserDao;
import kr.co.itcen.bookmall.vo.BookOrderVo;
import kr.co.itcen.bookmall.vo.BookVo;
import kr.co.itcen.bookmall.vo.CartVo;
import kr.co.itcen.bookmall.vo.CategoryVo;
import kr.co.itcen.bookmall.vo.OrderVo;
import kr.co.itcen.bookmall.vo.UserVo;

public class Bookmall {

	public static void main(String[] args) {
		CategoryDao categorydao = new CategoryDao();
		List<CategoryVo> categorylist = categorydao.getList();
		for(CategoryVo vo : categorylist) {
			System.out.println(vo);
		}
		System.out.println("-------------------------------------------------------------------------------");
		
		BookDao bookdao = new BookDao();
		List<BookVo> booklist = bookdao.getList();
		for(int i=0; i<booklist.size(); i++) {
			System.out.println(booklist.get(i));
		}
		System.out.println("-------------------------------------------------------------------------------");
		
		UserDao userdao = new UserDao();
		List<UserVo> userlist = userdao.getList();
		for(UserVo vo : userlist) {
			System.out.println(vo);
		}
		System.out.println("-------------------------------------------------------------------------------");
		
		CartDao cartdao = new CartDao();
		List<CartVo> cartlist = cartdao.getList();
		for(int i=0; i<cartlist.size(); i++) {
			System.out.println(cartlist.get(i));
		}
		System.out.println("-------------------------------------------------------------------------------");
		
		OrderDao orderdao = new OrderDao();
		List<OrderVo> orderlist = orderdao.getList();
		for(int i=0; i<orderlist.size(); i++) {
			System.out.println(orderlist.get(i));
		}
		System.out.println("-------------------------------------------------------------------------------");
		
		BookOrderDao orderBookDao = new BookOrderDao();
		List<BookOrderVo> orderBookList = orderBookDao.getList();
		for(int i=0; i<orderBookList.size(); i++) {
			System.out.println(orderBookList.get(i));
		}
		System.out.println("-------------------------------------------------------------------------------");

	}

}
