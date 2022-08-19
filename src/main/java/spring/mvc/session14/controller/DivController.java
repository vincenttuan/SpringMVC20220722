package spring.mvc.session14.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

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
}
