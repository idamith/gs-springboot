package com.idotrick.gssb.common;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CommonController {
	
	Logger log = Logger.getLogger(CommonController.class);
	
	@RequestMapping(value = "/")
	public String getHome() {
		return CommonConstants.VIEW_ROOT_PAGE;
	}
}
