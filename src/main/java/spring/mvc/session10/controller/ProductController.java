package spring.mvc.session10.controller;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import spring.mvc.session10.entity.Product;

@Controller
@RequestMapping("/product")
public class ProductController {
	private List<Product> products = new CopyOnWriteArrayList<>();
	
	// 商品首頁(輸入商品, 查詢所有商品)
	@GetMapping("/")
	public String index(Model model) {
		model.addAttribute("products", products);
		return "session10/product";
	}
	
	// 新增商品
	@PostMapping("/")
	public String add(Product product, RedirectAttributes attr) {
		products.add(product);
		// 將 product 資料傳給 /addOk 讓 success.jsp 來呈現 (防止網頁重新整理導致二次 submit) 
		attr.addFlashAttribute("product", product);
		return "redirect:addOk";
	}
	
	// 成功
	@GetMapping(value = {"/addOk", "/updateOk"})
	public String success() {
		return "session10/success";
	}
	
	
}
