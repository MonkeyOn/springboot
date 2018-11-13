package ren.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.dianping.cat.Cat;
import com.dianping.cat.message.Event;
import com.dianping.cat.message.Transaction;

@Controller
public class UserController {
	
	@RequestMapping("hello.do")
	@ResponseBody
	public String hello(){
		String pageName = "renyuanhang";
		String serverIp = "2222";
		double amount = 0;
		Transaction t = Cat.newTransaction("URL", pageName);
		
		Cat.logEvent("URL.server", serverIp, Event.SUCCESS, "ip:111");
		
		Cat.logMetricForCount("Pay");
		
		Cat.logMetricForSum("Paya", amount);
		
		t.setStatus(Transaction.SUCCESS);
		
		t.complete();
		System.out.println("hello");
		return  "hello world!";
	}

}
