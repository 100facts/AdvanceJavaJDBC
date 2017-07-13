package com.src.Service.impl;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import com.src.Service.DBlibrary;

public class DBlibraryImpl implements DBlibrary{
	Statement stat;

	@Override
	public void createQuery(String str,Connection conn) throws SQLException {
		try {
			stat = conn.createStatement();
			stat.executeUpdate(str);
			System.out.println("Create Operation Successful!");
		} catch (Exception e) {
			
			e.printStackTrace();
		}finally{
			conn.close();
		}
	}
	@Override
	public void insertQuery(String str,Connection conn) throws SQLException{
		try {
			stat = conn.createStatement();
			stat.executeUpdate(str);
			System.out.println("Insert Operation Successfull!");
		} catch (Exception e) {
			
			e.printStackTrace();
		}finally{
			conn.close();
		}
		
		
	}
	@Override
	public void deleteQuery(String str,Connection conn) throws SQLException {
		try {
			stat = conn.createStatement();
			stat.executeUpdate(str);
			System.out.println("Delete Operation Successfull!");
		} catch (Exception e) {
			
			e.printStackTrace();
		}finally{
			conn.close();
		}
		
	}
	@Override
	public void dropTable(String str,Connection conn) throws SQLException {
		try {
			stat = conn.createStatement();
			stat.executeUpdate(str);
			System.out.println("Drop  Operation Successfull!");
		} catch (Exception e) {
			
			e.printStackTrace();
		}finally{
			conn.close();
		}
		
	}
	
}
