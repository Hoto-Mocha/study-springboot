package org.comstudy.myapp.controller;

import org.comstudy.myapp.model.Memo;
import org.comstudy.myapp.model.MemoDAO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MemoController {
	
    private MemoDAO memoDAO = new MemoDAO();
	
	@GetMapping("/memos")
	public String memos(Model model) {
		System.out.println("GET - /memos 호출");
		model.addAttribute("memos", memoDAO.getAllMemos());
		return "memos";
	}
	
	@GetMapping("/detail/{id}")
	public String detail(@PathVariable int id, Model model) {
		System.out.println("GET - /detail 호출");
		model.addAttribute("memo", memoDAO.getMemoById(id));
		return "detail";
	}
	
	@PostMapping("/edit")
	public String edit(@RequestParam int id,
						@RequestParam String title,
						@RequestParam String content,
						Model model) {
		System.out.println("POST - /edit 호출");
		System.out.println("id:" + id);
		System.out.println("title:" + title);
		System.out.println("content:" + content);
		memoDAO.editMemo(id, title, content);
		
		model.addAttribute("memos", memoDAO.getAllMemos());
		return "memos";
	}
	
	@PostMapping("/insert")
	public String insert(@RequestParam String title,
							@RequestParam String content,
							Model model) {
		System.out.println("POST - /insert 호출");
		memoDAO.addMemo(title, content);
		
		model.addAttribute("memos", memoDAO.getAllMemos());
		return "memos";
	}
	
	@PostMapping("/delete")
	public String delete(@RequestParam int id, Model model) {
		memoDAO.deleteMemo(id);
		model.addAttribute("memos", memoDAO.getAllMemos());
		return "memos";
	}
	
	
}
