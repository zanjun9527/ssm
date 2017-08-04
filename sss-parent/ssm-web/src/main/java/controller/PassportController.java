package controller;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import model.Account;

//import weibo4j.Account;
@Controller
public class PassportController {
	
    @RequestMapping(value="hehe",method=RequestMethod.GET)
    public String index(@RequestParam(value="path", defaultValue="/") String path, Model model) throws UnsupportedEncodingException {
    	Account account = new Account();
    	account.setUserName("zhanjun");
    	account.setPassword("123123");
    	account.setAge("11");
        model.addAttribute("account", account);
        model.addAttribute("path", URLEncoder.encode(path,"UTF-8"));
        return "/index";
    }
    
    @RequestMapping(value="login", method=RequestMethod.POST)
    public ModelAndView login(@ModelAttribute("account") Account account,@RequestParam(value="path", defaultValue="/") String path,
            HttpServletRequest request, HttpServletResponse response) throws IOException {
        ModelAndView view = new ModelAndView("/index");
        account.setUserName("zhanjun2");
    	account.setPassword("111");
    	account.setAge("22");
        request.getSession(false).setAttribute("account", account);
        if(path != null && path.trim() != "") {
            response.sendRedirect(URLDecoder.decode(path, "UTF-8"));
            return null;
        }
        return view;
    }
    
    @RequestMapping(value="logout", method=RequestMethod.GET)
    public String logout(HttpServletRequest request, HttpServletResponse response) {
        HttpSession session = request.getSession();
        session.removeAttribute("account");
        
        return "redirect:/usercenter/userInfo/wade?wadeId=203";
    }

}
