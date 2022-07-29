package spring.mvc.session09.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/lotto")
public class LottoController {
	private List<Set<Integer>> lottos = new CopyOnWriteArrayList<>();
	
	// Lotto 主畫面
	//@GetMapping("/get")
	@RequestMapping(value = "/get", method = RequestMethod.GET)
	public String index() {
		return "session09/lotto";
	}
	
	
	
}
