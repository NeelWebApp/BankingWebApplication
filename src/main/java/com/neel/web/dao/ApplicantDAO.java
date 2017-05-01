package com.neel.web.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.sql.DataSource;

import com.neel.web.model.Applicant;

public class ApplicantDAO {
	
	private DataSource dataSource;
    
    public DataSource getDataSource() {
    	return dataSource;
    }

    public void setDataSource(DataSource dataSource) {
    	this.dataSource = dataSource;
    }
    
    
    public boolean insert(Applicant applications) {
    	
    	boolean success = false;
    	
		String sql = "INSERT INTO bankapp.applicant "
				+ "( applfirstname, applmidname, appllastname,  appaddrline1, "
				+ "appaddrline2,  city, state, zipCode)"
				+ "VALUES ( ?, ?, ?, ?, ?, ?, ?, ? )";
		Connection conn = null;
		

		try {
			conn = dataSource.getConnection();
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, applications.getApplfirstname());	
			ps.setString(2, applications.getApplmidname());
			ps.setString(3, applications.getAppllastname());
			ps.setString(4, applications.getAppaddrline1());
			ps.setString(5, applications.getAppaddrline2());
			ps.setString(6, applications.getCity());
			ps.setString(7, applications.getState());
			ps.setString(8, applications.getZipcode());
			ps.executeUpdate();
			ps.close();
			System.out.println("Applicants data updated successfully!");
			success = true;

		} catch (SQLException e) {
			throw new RuntimeException(e);

		} finally {
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
				}
			}
		}
		
		return success;
	}

}
