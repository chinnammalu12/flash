package com.getset.test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

public class StudentDaoimpl {
	private static final String insert_query="insert into client111111111.customer values(?,?,?)";
	public StudentDaoimpl() {
  System.out.println("dao impl");
	}
	private JdbcTemplate jdbctemp;
	
	
	public void setJdbctemp(JdbcTemplate jdbctemp) {
		this.jdbctemp = jdbctemp;
	}
	
	public int insert(){
		int result=0;
		int cno=88;
		String cname="ammulu";
		int csal=7000;
      Connection con=null;
       PreparedStatement ps=null;
       
       
     /*  try{
           System.out.println("ds..."+ds);

       con=ds.getConnection();
       System.out.println("connection...."+con);
       ps=con.prepareStatement(insert_query);
     //  ps.setInt(1,2);
     //  ps.setString(2, "ammulu");
     //  ps.setInt(3,5000);
       result=ps.executeUpdate();
       }
       catch(Exception e){
    	   System.out.println("exception....."+e);
       }*/

		result = jdbctemp.update("insert into client111111111.customer values(?, ?, ?)", cno, cname, csal);
		//select * from client111111111.customer;
      // System.out.println("46" );
	///	List list=jdbctemp.queryForList("select * from client111111111.inventory where inventory_id=1");
	   System.out.println("result...."+result);

	return result;
	}

}
