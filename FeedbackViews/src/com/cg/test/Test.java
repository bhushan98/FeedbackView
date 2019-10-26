package com.cg.test;

import com.cg.dao.FeedbackDaoImpl;
import com.cg.dto.Feedback;
import com.cg.exception.FeedbackNotFoundException;

public class Test {

	public static void main(String[] args) {
		FeedbackDaoImpl dao = new FeedbackDaoImpl();
		try {
			System.out.println(dao.byMonth(6));
		} catch (FeedbackNotFoundException e) {
			e.printStackTrace();
		}
		
		try {
			System.out.println(dao.byFacultyForMonth(3000, 6));
		} catch (FeedbackNotFoundException e) {
			e.printStackTrace();
		}
		
	}

}
