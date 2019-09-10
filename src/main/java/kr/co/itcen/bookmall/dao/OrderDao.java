package kr.co.itcen.bookmall.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import kr.co.itcen.bookmall.vo.BookVo;
import kr.co.itcen.bookmall.vo.OrderVo;

public class OrderDao {
	
	private Connection getConnection() throws SQLException {
		Connection connection = null;
		try {
			Class.forName("org.mariadb.jdbc.Driver");

			String url = "jdbc:mariadb://192.168.1.70:3307/bookmall?characterEncoding=utf8";
			connection = DriverManager.getConnection(url, "bookmall", "bookmall");
		} catch (ClassNotFoundException e) {
			System.out.println("Fail to Loading Driver : " + e);
		}
		return connection;
	}
	
	public Boolean insert(OrderVo vo1,String keyword) {
		Connection connection = null;
		Boolean result = false;
		PreparedStatement pstmt = null;
		try {

			connection = getConnection();
			
			
			String sql = "insert into `order` values(null,  null, ?, (select no from user where name like ?))";
			pstmt = connection.prepareStatement(sql);
			pstmt.setString(1, vo1.getArrival());
			pstmt.setString(2, keyword);
			
			int count = pstmt.executeUpdate();
			result = (count == 1);

		} catch (SQLException e) {
			System.out.println("error : " + e);
		} finally {
			try {
				
				if (pstmt != null) {
					pstmt.close();
				}
				if (connection != null) {
					connection.close();
				}
			} catch (SQLException e) {
				System.out.println("error : " + e);
			}
		}
		return result;
		
	}

	public List<OrderVo> getList() {
		Connection connection = null;
		List<OrderVo> result = new ArrayList<OrderVo>();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			connection = getConnection();

			String sql = "select user_no, price, arrival from `order`";
			pstmt = connection.prepareStatement(sql);

			rs = pstmt.executeQuery();

			while (rs.next()) {
				Long userNo = rs.getLong(1);
				int price = rs.getInt(2);
				String arrival = rs.getString(3);

				OrderVo vo = new OrderVo();
				vo.setUserNo(userNo);
				vo.setPrice(price);
				vo.setArrival(arrival);

				result.add(vo);
			}

		} catch (SQLException e) {
			System.out.println("error : " + e);
		} finally {
			try {
				if (rs != null) {
					rs.close();
				}
				if (pstmt != null) {
					pstmt.close();
				}
				if (connection != null) {
					connection.close();
				}
			} catch (SQLException e) {
				System.out.println("error : " + e);
			}
		}
		return result;
	}

	public void delete() {
		Connection connection = null;
		PreparedStatement pstmt = null;

		try {

			connection = getConnection();

			String sql = " delete from `order` where no >= 1";
			pstmt = connection.prepareStatement(sql);
			pstmt.executeUpdate();

		} catch (SQLException e) {
			System.out.println("error : " + e);
		} finally {
			try {

				if (pstmt != null) {
					pstmt.close();
				}
				if (connection != null) {
					connection.close();
				}
			} catch (SQLException e) {
				System.out.println("error : " + e);
			}
		}
		
	}

	public Boolean update(Long no) {
		Connection connection = null;
		Boolean result = false;
		PreparedStatement pstmt = null;
		// 1. JDBC Driver 로딩
		try {
			connection = getConnection();
			String sql = "update `order` set price = (select sum((a.price*b.count)) from book a,order_book b where a.no = b.no) where no = ?";
			pstmt = connection.prepareStatement(sql);
			
			
			pstmt.setLong(1, no);
			
			int count = pstmt.executeUpdate();
			result = (count == 1);

		 
		} catch (SQLException e) {
			System.out.println("error : " + e);
		} finally {
			try {

				if (pstmt != null) {
					pstmt.close();
				}
				if (connection != null) {
					connection.close();
				}
			} catch (SQLException e) {
				System.out.println("error : " + e);
			}
		}
		return result;
		
	}

}
