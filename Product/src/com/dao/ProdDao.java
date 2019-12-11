package com.dao;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.List;

import com.model.ProdModel;

public class ProdDao {
     public static Connection con;
     public static PreparedStatement ps;
     private String driver="oracle.jdbc.OracleDriver";
     private String url="jdbc:oracle:thin:@localhost:1521:XE";
     private String username="System";
     private String password="123456789";
     public Connection getConnection()
     {
    	 
   try  {
    	 Class.forName(driver);
    	 con=DriverManager.getConnection(url,username,password);
    	 System.out.println("Connection "+con);
     }catch(Exception e)
   {
System.out.println(e);	
}return con;
}
     public int saveData(List <ProdModel> lst)
     {
    	 int i=0;
    	 int cnt=0;
    	 con=getConnection();
    	 ProdModel p=(ProdModel) lst.get(0);
    	 try{
    		ps=con.prepareStatement("insert into savedata values(?,?,?,?)");
    		ps.setInt(1,p.getPrdno());
    		ps.setString(2,p.getProdName());
    		ps.setString(3,p.getPrice());
    		 ps.setInt(4,p.getQua());
    		 i=ps.executeUpdate();
    		 
    		 
    	 }catch(Exception e)
    	 {
    		 System.out.println(e);
    		
    	 }if(i>0)
    	 {
    		 cnt=1;
    	 }return cnt;
     }
     
} 
     
     

