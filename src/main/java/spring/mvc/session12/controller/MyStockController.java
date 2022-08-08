package spring.mvc.session12.controller;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import spring.mvc.session12.entity.MyStock;

@Controller
@RequestMapping("/mystock")
public class MyStockController {
	private List<MyStock> stocks = new CopyOnWriteArrayList<>();
	
	@GetMapping("/")
	public String index(Model model, @ModelAttribute MyStock myStock) {
		model.addAttribute("stocks", stocks);
		return "session12/stock";
	}
	
	@PostMapping("/")
	public String add(Model model, @ModelAttribute MyStock myStock, BindingResult result) {
		// 自主驗證錯誤
		
		// 自主驗證結果會存放在 result 中
		if(result.hasErrors()) {
			// 若有錯誤發生, 會自動將錯誤訊息傳送到指定的 view 中
			model.addAttribute("stocks", stocks);
			return "session12/stock";
		}
		stocks.add(myStock);
		return "redirect:./";
	}
}
