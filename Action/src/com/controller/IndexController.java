package com.controller;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.entity.UserEntity;
import com.service.UserService;

@Controller
@RequestMapping("/index")
public class IndexController {

	// 获取以当前类为参数的日志对象
	// private static Log log = LogFactory.getLog(MainApp.class);
	// Logger instance named "MyApp".
	private static final Logger logger = LogManager
			.getLogger(IndexController.class);

	@RequestMapping("/index")
	public ModelAndView index() {

		logger.trace("Entering application.");
		logger.info("Didn't do it info.");
		logger.warn("Didn't do it warn.");
		logger.error("Didn't do it.");
		logger.trace("Exiting application.");

		UserEntity user = new UserService().getUserById();
		return new ModelAndView("index", "user", user);
	}
}
