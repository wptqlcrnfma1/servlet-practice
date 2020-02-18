package com.douzone.emaillist.dao.test;

import java.util.List;

import com.douzone.emaillist.dao.EmaillistDao;
import com.douzone.emaillist.vo.EmaillistVo;

public class EmaillistDaoTest {

	public static void main(String[] args) {
		//insertTest();
		selectTest();

	}
	
	public static void selectTest() {
		List<EmaillistVo> list = new EmaillistDao().findAll();
		for(EmaillistVo vo : list) {
			System.out.println(vo);
		}
	}
	
	public static void insertTest(String fristName, String lastName, String email) {
		EmaillistVo vo = new EmaillistVo();
		
		vo.setFirstName(fristName);
		vo.setLastName(lastName);
		vo.setEmail(email);
		
		new EmaillistDao().insert(vo);
	}
	
	

}
