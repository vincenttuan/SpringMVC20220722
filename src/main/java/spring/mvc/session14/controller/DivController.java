package spring.mvc.session14.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import spring.mvc.session14.entity.Div;

@Controller
@RequestMapping("/session14/div")
public class DivController {
	
	@GetMapping("/")
	public String index(@ModelAttribute Div div) {
		return "session14/div";
	}
	
	@PostMapping("/")
	public String result(@ModelAttribute Div div, Model model) {
		int result = div.getX() / div.getY();
		div.setResult(result);
		model.addAttribute("result", div.getResult());
		return "session14/div";
	}
	
	// 捕獲使用者輸入格式不正確的例外, 數學錯誤的例外
	@ExceptionHandler({BindException.class, ArithmeticException.class})
	@ResponseBody
	public String catchException(Exception ex, Model mode, HttpServletRequest request) {
		String referer = request.getHeader("Referer");
		return ex + ", " + referer;
	}
}
