package controller;

import java.io.IOException;
import java.util.Map;
import java.util.Set;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class xss extends HttpServlet{
	
	
	 private static final long serialVersionUID = -8953308985918560500L;
	 
	    @Override
	    protected void service(HttpServletRequest request, HttpServletResponse response)
	            throws ServletException, IOException {
	        Map<String,String[]> map = request.getParameterMap();
	        Set<String> keySet = map.keySet();
	        // 将接收参数一一传递到页面
	        for(String key : keySet){
	            Object obj = map.get(key);
	            if(obj instanceof String[]){
	                String[] strs = (String[])obj;
	                if(strs.length >= 1){
	                    request.setAttribute(key, strs[0]);
	                }
	            }
	        }
	        request.getRequestDispatcher("/usercenter/userInfo/wade").forward(request, response);
	    }
	
	

}
