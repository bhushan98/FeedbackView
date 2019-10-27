package com.cg.test;

import com.cg.dao.FeedbackReportDaoImpl;
import com.cg.dto.FeedbackReport;
import com.cg.exception.FeedbackNotFoundException;

public class Test {

	public static void main(String[] args) {
		FeedbackReportDaoImpl dao = new FeedbackReportDaoImpl();
		try {
			System.out.println(dao.byMonth(1));
		} catch (FeedbackNotFoundException e) {
			e.printStackTrace();
		}
		
		try {
			System.out.println(dao.byFacultyForMonth(1003, 1));
		} catch (FeedbackNotFoundException e) {
			e.printStackTrace();
		}
		
		try {
			System.out.println(dao.feedbackDefaultersByMonth(1));
		} catch (FeedbackNotFoundException e) {
			e.printStackTrace();
		}
		
	}

}
