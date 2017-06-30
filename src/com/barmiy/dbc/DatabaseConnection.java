package com.barmiy.dbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
	private static final String DBDIRVER = "org.postgresql.Driver" ;
	private static final String DBURL="jdbc:postgresql://localhost/hbn" ;
	private static final String DBUERE="postgres";
	private static final String DBPASS="123";
	private Connection  conn = null ;
	public DatabaseConnection() {
		try{
			Class.forName(DBDIRVER);
			this.conn=DriverManager.getConnection(DBURL,DBUERE,DBPASS);
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	public Connection getConnection (){
		return this.conn;
	}
	public void close(){
		if(this.conn!=null){
			try {
				this.conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

}
