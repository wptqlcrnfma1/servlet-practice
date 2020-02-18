package com.douzone.guestbook.dao.test;

import java.util.List;

import com.douzone.guestbook.dao.GuestBookDao;
import com.douzone.guestbook.vo.GuestBookVo;

public class GuestBookDaoTest {
	public static void main(String[] args) {
//		SimpleDateFormat mSimpleDateFormat = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss");
//		Calendar c1 = Calendar.getInstance();
//		String date = mSimpleDateFormat.format(c1.getTime());
		
		//insertTest("이름test", "내용test","비밀번호test", date);
		//deleteTest(10L);
		selectTest();
		
	}
	
	
	public static void selectTest() {
		List<GuestBookVo> list = new GuestBookDao().findAll();
		for(GuestBookVo vo : list) {
			System.out.println(vo);
		}
	}
	
	public static void insertTest(String name, String contents, String password,String reg_date) {
		GuestBookVo vo = new GuestBookVo();
		
		vo.setName(name);
		vo.setContents(contents);
		vo.setPassword(password);
		vo.setReg_date(reg_date);
		
		new GuestBookDao().insert(vo);
	}
	
	public static void deleteTest(Long no, String password) {
		GuestBookVo vo = new GuestBookVo();
		
		vo.setNo(no);
		vo.setPassword(password);
		
		new GuestBookDao().delete(vo);
	}
}
