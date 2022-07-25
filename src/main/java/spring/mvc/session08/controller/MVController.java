package spring.mvc.session08.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@RequestMapping("/mv")
@Controller
public class MVController {
	
	@GetMapping("/case1")
	//@RequestMapping(value="/case1", method = {RequestMethod.GET})
	public ModelAndView case1() {
		String data = "Hello Model and View";  // 資料(Model)
		String view = "/WEB-INF/view/show_data.jsp"; // 渲染(View)
		ModelAndView mv = new ModelAndView();
		mv.addObject("data", data);
		mv.setViewName(view);
		return mv;
	}
	
	@GetMapping("/case2")
	public ModelAndView case2() {
		String data = "Hello Model and View II";  // 資料(Model)
		String view = "/WEB-INF/view/show_data.jsp"; // 渲染(View)
		return new ModelAndView(view, "data", data);
	}
	
	@GetMapping("/case3")
	public ModelAndView case3() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("/WEB-INF/view/show_data.jsp");
		mv.addObject("data", "Hello Model and View I");
		mv.addObject("data2", "Hello Model and View II");
		mv.addObject("data3", "Hello Model and View III");
		return mv;
	}
	
}
