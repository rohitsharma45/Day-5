package com.cg.servlet.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;




import javax.servlet.http.HttpSession;

import com.cg.bean.bank.BankBean;
import com.cg.service.bank.BankServiceImpl;
import com.cg.service.bank.IBankService;


@WebServlet("*.obj")
public class HomeController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String target=null;
		HttpSession session=request.getSession();
		BankBean bean=new BankBean();
		IBankService service=new BankServiceImpl();
		String path=request.getServletPath();
		System.out.println(path);
		switch(path)
		{
		case "/insert.obj":
			target="NewCustomer.html";
			RequestDispatcher rd=request.getRequestDispatcher(target);
			rd.forward(request, response);
			break;
			
			
		case "/details.obj":
			
		String customerName=request.getParameter("custName");
		String phone=request.getParameter("phoneNo");
		String password=request.getParameter("pwd");
		String reenterPassword=request.getParameter("rpwd");	
		bean.setCustomerName(customerName);	
		bean.setPhoneNo(phone);
		bean.setPassword(password);
		bean.setReenterPassword(reenterPassword);
		int res=service.insertDetails(bean);
		/*if(res==1){
			target="Success.html";
		}
		else{
			target="Error.html";
		}*/
		
		session.setAttribute("seqid",res);
		target="Success.jsp";
		break;
		
		
		case "/paybill.obj":
			target="amountpay.jsp";
			break;
			
		case "/amount1.obj":
			//HttpSession session1=request.getSession();
			String s=(String) request.getParameter("amtpaid");
			int paid1=Integer.parseInt(s);
			int payable=1000-paid1;
			
			session.setAttribute("payable", payable);
			target="amount1.jsp";
			break;

		case "/retrieve.obj":
			
			ArrayList<BankBean> list = service.retrieveDetails();
			session.setAttribute("list", list);
			target = "retrieve.jsp";
			break;
		}
		RequestDispatcher rd=request.getRequestDispatcher(target);
		rd.forward(request, response);
	}
}



