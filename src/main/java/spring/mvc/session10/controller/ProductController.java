package spring.mvc.session10.controller;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

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
	public String add(Product product, Model model) {
		products.add(product);
		model.addAttribute("product", product);
		return "redirect:addOk";
	}
	
	// 成功
	@GetMapping(value = {"/addOk", "/updateOk"})
	public String success() {
		return "session10/success";
	}
	
	
}
