package com.shd.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 单昊冬
 * 2018/1/31 下午 4:21
 */
@Controller
public class HelloController {

	@RequestMapping("/hello")
	public String index(ModelMap modelMap) {
		modelMap.addAttribute("host","http://www.baidu.com");
		return "index";
	}
	@RequestMapping("/get")
	public String get(ModelMap map) {
		map.addAttribute("name","火影忍");
		map.addAttribute("sex", 1);
		List<String> userlist = new ArrayList<>();
		userlist.add("张三");
		userlist.add("李四");
		userlist.add("王五");
		map.addAttribute("userlist",userlist);
		return "1";
	}
}
