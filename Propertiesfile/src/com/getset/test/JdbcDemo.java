package com.getset.test;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
class JdbcDemo 
{
	public static void main(String[] args) throws Exception
	{
		Class.forName("org.postgresql.Driver");
		String url = "jdbc:postgresql://localhost/testdb?user=postgres&password=system";
		Connection con = DriverManager.getConnection(url);
		//Connection con=DriverManager.getConnection("jdbc:postgresql://localhost:5432:testdb","postgres","system");
		System.out.println("conection...."+con);
		Statement st = con.createStatement();
		System.out.println("conection...."+st);

		boolean flag=false;
		ResultSet rs =st.executeQuery("select *  from client111111111.inventory");
		System.out.println("ENO\tENAME\tESAL\tEADDR");
		System.out.println("---------------------------");
		while(rs.next())
		{
			flag=true;
			System.out.println(rs.getInt(1)+"\t"+rs.getInt(2)+"\t"+rs.getInt(3)+"\t"+rs.getInt(4));
		}
		if(flag==false)
		{
			System.out.println("No Matched Records available");
		}
		con.close();
	}
}
