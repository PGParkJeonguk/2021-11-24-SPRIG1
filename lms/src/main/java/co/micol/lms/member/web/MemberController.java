package co.micol.lms.member.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import co.micol.lms.member.service.MemberService;
import co.micol.lms.member.service.MemberVO;

@Controller
public class MemberController {
	@Autowired
	MemberService memberDao;
	
	@RequestMapping("/idCheck.do")
	@ResponseBody
	public String idcheck(Model model, @Param("id") String id) {
		System.out.println(id);
		boolean b = memberDao.isCheckId(id);
		String result = "T";
		if(!b) {
			result = "F";
		}
		//model.addAttribute("result", memberDao.isCheckId(id));
		return result;
	}
	
//	@RequestMapping("/idcheck.do")
//	public String idcheck(Model model, HttpServletRequest request, HttpServletResponse response) throws IOException {
//		PrintWriter out = response.getWriter();
//		String id = request.getParameter("id");
//		System.out.println(request.getParameter("id"));
//		boolean b = memberDao.isCheckId(id);
//		String result = "T";
//		if(!b) {
//			result = "F";
//		}
//		out.print(result);
//	}
	
	@RequestMapping("/memberList.do")
	@ResponseBody
	
	public List<MemberVO> memberList() {
		return memberDao.memberSelectList("C");
	}
	
}
