package com.cognizant.test;

import static org.junit.jupiter.api.Assertions.*;

import java.sql.Connection;
import java.time.Duration;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import com.cognizant.config.DBConnection;

class DBConnectionTest {
	private static DBConnection dbCon;
	@BeforeAll
	public static void setUp() throws Exception {
		dbCon = new DBConnection();
	}

	@AfterAll
	public static void tearDown() throws Exception {
		dbCon = null;
	}

	@Test
	void testGetDBConnection_01() {
		Connection con = dbCon.getDBConnection();
		assertNotNull(con);
	}
	@Test
	void testGetDBConnection_02() {
		Connection con = dbCon.getDBConnection();
		assertNull(con);
	}
	
	@Test
	void testGetDBConnection_03() {
		Connection con1 = dbCon.getDBConnection();
		Connection con2 = dbCon.getDBConnection();
		assertSame(con1,con2);
	}	
	
	@Test
	void testGetDBConnection_04() {
		//Connection con = dbCon.getDBConnection();
		//assertNull(con);
		/*
		assertThrows(RuntimeException.class, new Executable() {			
			@Override
			public void execute() throws Throwable {
				Connection con = dbCon.getDBConnection();				
			}
		});
		*/
		assertThrows(RuntimeException.class, ()-> {			
					Connection con = dbCon.getDBConnection();
		});		
	}	
	
	@Test
	void testGetDBConnection_05() {		
		assertTimeout(Duration.ofSeconds(5), ()-> {			
			Connection con = dbCon.getDBConnection();
		});		
	}
	
	@Test
	void testGetDBConnection_06() {
		/*
		System.out.println("1");
		assertNotNull(dbCon.getDBConnection());
		
		System.out.println("2");
		Connection con1 = dbCon.getDBConnection();
		Connection con2 = dbCon.getDBConnection();
		assertSame(con1,con2);
		System.out.println("3");
		*/
		
		assertAll(
				()->{
					System.out.println("1");
					assertNotNull(dbCon.getDBConnection());				
				},
				()->{
					Connection con1 = dbCon.getDBConnection();
					Connection con2 = dbCon.getDBConnection();
					assertSame(con1,con2);
					System.out.println("2");
					}
			);
	}	
}
