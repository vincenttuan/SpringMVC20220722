package spring.mvc.session09.controller;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/lotto")
public class LottoController {
	private List<Set<Integer>> lottos = new CopyOnWriteArrayList<>();
	
	// Lotto 主畫面
	//@GetMapping("/")
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String index() {
		return "session09/lotto";
	}
	
	// 取得最新電腦選號
	@RequestMapping(value = "/get", method = RequestMethod.GET)
	public String get(Model model) {
		// 取得樂透號碼
		Set<Integer> lotto = getRandomLotto();
		// 將最新樂透號碼放在歷史紀錄中
		lottos.add(lotto);
		// 將必要資料傳給 jsp 呈現/處理
		model.addAttribute("lotto", lotto); // 最新電腦選號
		model.addAttribute("lottos", lottos); // 樂透號碼歷史紀錄
		return "session09/lotto";
	}
	
	// 隨機生成最新電腦選號
	private Set<Integer> getRandomLotto() {
		Random r = new Random();
		// 樂透 539, 1~39不重複數字取5個
		Set<Integer> lotto = new LinkedHashSet<>();
		while(lotto.size() < 5) {
			lotto.add(r.nextInt(39) + 1);
		}
		return lotto;
	}
	
}
