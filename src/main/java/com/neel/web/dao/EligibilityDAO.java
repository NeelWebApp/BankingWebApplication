package com.neel.web.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.sql.DataSource;

import com.neel.web.model.Eligibility;

public class EligibilityDAO {
	
	private DataSource dataSource;
    
    public DataSource getDataSource() {
    	return dataSource;
    }

    public void setDataSource(DataSource dataSource) {
    	this.dataSource = dataSource;
    }
    
    public boolean insert(Eligibility eligibilitys) {
    	
    	boolean success = false;
    	
		String sql = "INSERT INTO bankapp.eligibility "
				+ "( accounttype, intialDeposit, directDepositMonthly,  debitCardVisaMaster, loanRequirement, creditScore) "
				+ "VALUES ( ?, ?, ?, ?, ?, ? )";
		Connection conn = null;
		

		try {
			conn = dataSource.getConnection();
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, eligibilitys.getAccounttype());	
			ps.setString(2, eligibilitys.getIntialDeposit());
			ps.setString(3, eligibilitys.getDirectDepositMonthly());
			ps.setString(4, eligibilitys.getDebitCardVisaMaster());
			ps.setString(5, eligibilitys.getLoanRequirement());
			ps.setString(6, eligibilitys.getCreditScore());
			ps.executeUpdate();
			ps.close();
			System.out.println("Eligibility data updated successfully!");
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
