package com.locknlol.coukie.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by kev on 2017. 5. 15.
 */
@Controller
public class IndexController {

	@RequestMapping("/")
	public ModelAndView index() {
		ModelAndView mav = new ModelAndView("/main/index");
		return mav;
	}

}
