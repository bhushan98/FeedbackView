package com.cg.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.cg.dto.Feedback;
import com.cg.exception.FeedbackNotFoundException;

public class FeedbackDaoImpl implements FeedbackDao {

	@Override
	public List<Feedback> byMonth(int month) throws FeedbackNotFoundException {
		Connection conn = null;
		List<Feedback> feedback = new ArrayList<Feedback>();
		Feedback f;
		
		try {
			conn = JdbcUtil.getConnection();
			PreparedStatement stmt = conn.prepareStatement(byMonth);
			stmt.setInt(1, month);
			ResultSet rs = stmt.executeQuery();
			while(rs.next()) {
				f = new Feedback();
				f.setTrainingCode(rs.getInt(1));
				f.setStartDate(rs.getDate(2));
				f.setEndDate(rs.getDate(3));
				f.setFacultyName(rs.getString(4));
				f.setParticipantName(rs.getString(5));
				f.setPresentationCommunication(rs.getInt(6));
				f.setClarifyDoubts(rs.getInt(7));
				f.setTimeManagement(rs.getInt(8));
				f.setHandOuts(rs.getInt(9));
				f.setHwswNetwork(rs.getInt(10));
				feedback.add(f);
			}
			if(feedback.size() == 0 || feedback == null) {
				throw new FeedbackNotFoundException("Feedback Not Found Exception");
			}
			return feedback;
				
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<Feedback> byFacultyForMonth(int facultyCode, int month) throws FeedbackNotFoundException {
		Connection conn = null;
		List<Feedback> feedback = new ArrayList<Feedback>();
		Feedback f;
		
		try {
			conn = JdbcUtil.getConnection();
			PreparedStatement stmt = conn.prepareStatement(byFacultyAndMonth);
			stmt.setInt(1, month);
			stmt.setInt(2, facultyCode);
			ResultSet rs = stmt.executeQuery();
			while(rs.next()) {
				f = new Feedback();
				f.setTrainingCode(rs.getInt(1));
				f.setStartDate(rs.getDate(2));
				f.setEndDate(rs.getDate(3));
				f.setFacultyName(rs.getString(4));
				f.setParticipantName(rs.getString(5));
				f.setPresentationCommunication(rs.getInt(6));
				f.setClarifyDoubts(rs.getInt(7));
				f.setTimeManagement(rs.getInt(8));
				f.setHandOuts(rs.getInt(9));
				f.setHwswNetwork(rs.getInt(10));
				feedback.add(f);
			}
			if(feedback.size() == 0 || feedback == null) {
				throw new FeedbackNotFoundException("Feedback Not Found");
			}
			return feedback;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<Feedback> feedbackDefaultersByMonth(int month) throws FeedbackNotFoundException {
		Connection conn = null;
		List<Feedback> feedback = new ArrayList<Feedback>();
		Feedback f;
		
		try {
			conn = JdbcUtil.getConnection();
			PreparedStatement stmt = conn.prepareStatement(byMonth);
			stmt.setInt(1, month);
			ResultSet rs = stmt.executeQuery();
			while(rs.next()) {
				f = new Feedback();
				f.setTrainingCode(rs.getInt(1));
				f.setStartDate(rs.getDate(2));
				f.setEndDate(rs.getDate(3));
				f.setFacultyName(rs.getString(4));
				f.setParticipantName(rs.getString(5));
				f.setPresentationCommunication(rs.getInt(6));
				f.setClarifyDoubts(rs.getInt(7));
				f.setTimeManagement(rs.getInt(8));
				f.setHandOuts(rs.getInt(9));
				f.setHwswNetwork(rs.getInt(10));
				feedback.add(f);
			}
			if(feedback.size() == 0 || feedback == null) {
				throw new FeedbackNotFoundException("Feedback Not Found Exception");
			}
			return feedback;
				
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

}
