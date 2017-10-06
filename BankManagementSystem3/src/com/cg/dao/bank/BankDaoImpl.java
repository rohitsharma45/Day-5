package com.cg.dao.bank;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.cg.bean.bank.BankBean;
import com.cg.dbutil.bank.DBUtil;



public class BankDaoImpl implements IBankDao {




	public int insertDetails(BankBean bean) {
		int row=0;
		int value=0;
		Connection conn=null;
		try{
		conn=DBUtil.getConnection();
		PreparedStatement ps=conn.prepareStatement("insert into CUSTOMERDETAILS values(cust_id_seq.nextval,?,?,?,?)");
		ps.setString(1, bean.getCustomerName());
		ps.setString(2,bean.getPhoneNo());
		ps.setString(3,bean.getPassword());
		ps.setString(4, bean.getReenterPassword());
		row=ps.executeUpdate();
			
		PreparedStatement ps1=conn.prepareStatement("Select cust_id_seq.currval from dual");
		ResultSet rs=ps1.executeQuery();
		while(rs.next())
		{
			value=rs.getInt(1);
		}
		
		}
		catch(SQLException e)
		{
			System.out.println(e.getMessage());
		}
		return value;
		
	}
	
	public ArrayList<BankBean> retrieveDetails(){
		
		Connection conn=null;
		ArrayList<BankBean> list =new ArrayList<BankBean>();
		try{
		conn=DBUtil.getConnection();
		String sql="Select * from CUSTOMERDETAILS";
		
		Statement st=conn.createStatement();
		ResultSet rs=st.executeQuery(sql);
		while(rs.next())
		{
			int cID=rs.getInt(1);
			String customerName=rs.getString(2);
			String phoneNo=rs.getString(3);
			String password=rs.getString(4);
			String reenterpassword=rs.getString(5);
			list.add(new BankBean(cID, customerName,phoneNo,password,reenterpassword));
		}
	}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		return list;
		
	}
}
