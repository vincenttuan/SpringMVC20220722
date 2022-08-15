package spring.mvc.session13.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import spring.mvc.session13.entity.Job;
import spring.mvc.session13.repository.JobDao;

@Controller
@RequestMapping("/jdbc/job")
public class JobController {
	
	@Autowired
	private JobDao jobDao;
	
	@GetMapping("/")
	public String index(@ModelAttribute Job job, Model model) { // job.jsp 首頁
		model.addAttribute("_method", "POST");
		model.addAttribute("jobs", jobDao.query());
		return "session13/job";
	}
	
	@GetMapping("/{jid}")
	public String get(@PathVariable("jid") Integer jid, Model model) {
		model.addAttribute("_method", "PUT");
		model.addAttribute("jobs", jobDao.query());
		model.addAttribute("job", jobDao.get(jid));
		return "session13/job";
	}
	
	@PostMapping("/")
	public String add(@Valid Job job, BindingResult result, Model model) {
		if(result.hasErrors()) {
			model.addAttribute("_method", "POST");
			model.addAttribute("jobs", jobDao.query());
			model.addAttribute("job", job);
			return "session13/job";
		}
		jobDao.add(job);
		return "redirect:./";
	}
	
	@PutMapping("/")
	public String update(@Valid Job job, BindingResult result, Model model) {
		if(result.hasErrors()) {
			model.addAttribute("_method", "PUT");
			model.addAttribute("jobs", jobDao.query());
			model.addAttribute("job", job);
			return "session13/job";
		}
		jobDao.update(job);
		return "redirect:./";
	}
	
	@DeleteMapping("/")
	public String delete(Job job) {
		jobDao.delete(job.getJid());
		return "redirect:./";
	}
	
	
}
