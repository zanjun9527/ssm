package controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.alibaba.fastjson.JSON;

import pojo.UserInfo;
import service.IUserInfoService;

@Controller
@RequestMapping("/usercenter/userInfo")

public class UserInfoController {
	@Autowired
	private IUserInfoService userInfoService;

	@RequestMapping(value = "wade", method = RequestMethod.GET)
	@ResponseBody
	public Object setUserInfo(@RequestParam("wadeId") Integer id,
			HttpServletRequest request, HttpServletResponse response) {
		ModelAndView mv = null;
		Map<String,Integer> map=new HashMap<String,Integer>();
		UserInfo userinfo = userInfoService.selectById(id);
		mv = new ModelAndView("/xss");
		mv.addObject("userInfo", userinfo);
		String jsonString = JSON.toJSONString(userinfo);
		map.put("1", 1);
		map.put("2", 2);
		return mv;

	}
}
