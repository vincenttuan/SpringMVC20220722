package spring.mvc.session14.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.ui.Model;
import org.springframework.validation.BindException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalController {
	@ExceptionHandler({RuntimeException.class})
	public String catchException(Exception ex, Model model, HttpServletRequest request) {
		String referer = request.getHeader("Referer");
		model.addAttribute("ex", "GlobalController 全局異常捕獲: " + ex);
		model.addAttribute("referer", referer);
		return "session14/error";
	}
}
