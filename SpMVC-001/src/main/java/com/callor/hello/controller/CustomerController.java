package com.callor.hello.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.callor.hello.models.CustomVO;
import com.callor.hello.persistance.CustomDao;

@Controller
@RequestMapping(value = "/customer")
public class CustomerController {
	
	private final CustomDao customDao;
	public CustomerController(CustomDao customDao) {
		this.customDao = customDao;
	}
	
	@RequestMapping(value = {"/",""}, method = RequestMethod.GET)
	public String home(Model model) {
		List<CustomVO> custList = customDao.selectAll();
		model.addAttribute("CUST_LIST", custList);
		return "customer/list";
	}
	
	@RequestMapping(value = "/insert", method = RequestMethod.GET)
	public String insert() {
		return "customer/input";
	}
	
	@RequestMapping(value = "/insert", method = RequestMethod.POST)
	public String insert(CustomVO vo, Model model) {
		int result = customDao.insert(vo);
		try {
			if(result > 0) {
				return "redirect:/custom";
			}else {
				model.addAttribute("MSG", "INSERT ERROR");
				return "custom/input";
			}
			
		} catch (Exception e) {
			model.addAttribute("MSG", "INSERT ERROR");
			return "custom/input";
		}
		
	}

}
