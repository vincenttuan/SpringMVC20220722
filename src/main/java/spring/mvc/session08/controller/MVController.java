package spring.mvc.session08.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@RequestMapping("/mv")
@Controller
public class MVController {
	
	public ModelAndView case1() {
		String data = "Hello Model and View";
		String view = "/WEB-INF/view/show_data.jsp";
		ModelAndView mv = new ModelAndView();
		mv.addObject("data", data);
		mv.setViewName(view);
		return mv;
	}
	
}
