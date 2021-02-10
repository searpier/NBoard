package com.example.demo.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.dto.BlogDto;
import com.example.demo.dto.ContentsDto;
import com.example.demo.service.BlogService;

@Controller
public class BlogController {

	
	@Autowired
	private BlogService bs;

	@RequestMapping("/") // 메인페이지로 보내는 컨트롤러
	public String index(Model model) {
		model.addAttribute("contentsAll", bs.selectContentsAll());
		return "index";
	}

	@RequestMapping("/login")
	public String goLogin() {
		return "login";
	}

	@RequestMapping("/logout")
	public String logout(HttpSession session) {

		// session.invalidate();
		session.setAttribute("member", null);

		return "redirect:/";
	}

	@RequestMapping("/register")
	public String goRegister() {
		return "register";
	}

	@RequestMapping("/goWrite")
	public String goWrite(HttpSession session) {

		BlogDto memberinfo = (BlogDto) session.getAttribute("member");

		if (memberinfo == null) {
			return "redirect:/login";
		} else {
			return "writeForm";
		}

	}

	@RequestMapping("/reg") // 회원가입 컨트롤러
	public String register(BlogDto dto, Model model) {

		bs.insertMember(dto);
		System.out.println(dto);
		// ->DB
		// 회원정보를 html로 보내는 로직
		model.addAttribute("name", dto.getName());
		return "redirect:/";// 메인페이지html
	}

	@RequestMapping("/log")
	public String loginMember(BlogDto dto, HttpSession session) {
		BlogDto result = bs.loginMember(dto);

		if (result != null) {// 성공

			session.setAttribute("member", result);

			return "redirect:/?r=success";
		} else {// 실패
			return "redirect:/?r=failed";
		}

	}

	@RequestMapping("/writeBlog")
	public String insertContents(ContentsDto dto, HttpSession session) {
		BlogDto memberinfo = (BlogDto) session.getAttribute("member");

		if (memberinfo == null) {
			return "redirect:/login";
		}

		dto.setId(memberinfo.getId());
		bs.insertContents(dto);

		return "redirect:/";
	}

	@RequestMapping("/readForm")
	public String selectContentsDetail(String conSeq, Model model) {
		ContentsDto dto = bs.selectContentsDetail(conSeq);
		model.addAttribute("contents", dto);
		return "readForm";
	}

	@RequestMapping("/delCon")
	public String deleteContents(ContentsDto dto, HttpSession session) {

		BlogDto loginedUser = (BlogDto) session.getAttribute("member");
		String conseq=dto.getConseq();
		ContentsDto resultDto = bs.selectContentsDetail(conseq);
		
		if (loginedUser.getId().equals(resultDto.getId())) {
			int result = bs.deleteContents(dto.getConseq());
			System.out.println(result);

		}

		return "redirect:/";
	}

	@RequestMapping("/xsshacking")
	public void hack(String id, String pwd) {
		System.out.println("id : " + id + ", pwd : " + pwd);
	}

}
