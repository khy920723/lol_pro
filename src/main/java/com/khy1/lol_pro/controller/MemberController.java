package com.khy1.lol_pro.controller;

import com.khy1.lol_pro.model.MemberModel;
import com.khy1.lol_pro.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.io.UnsupportedEncodingException;
import java.util.List;

@Controller
public class MemberController {

    @Autowired
    MemberService memberService;

    // t1 그룹 하나의 멤버들만 보여주기 위한 코드
    //    @RequestMapping("/list")
    //    public String list(Model model){
    //        List<MemberModel> member = memberService.printMember();
    //
    //        model.addAttribute("memberList", member);
    //
    //        return "list";
    //    }

    @RequestMapping("/addMember")
    public String addMember(Model model){
        return "addMember";
    }

    // 하나의 값만 insert 해주는 코드
    //    @RequestMapping(value = "/insert", method = RequestMethod.POST)
    //    public ModelAndView insert(HttpServletRequest request) throws UnsupportedEncodingException {
    //        request.setCharacterEncoding("UTF-8");
    //        MemberModel member = new MemberModel();
    //        member.setId(Integer.parseInt(request.getParameter("id")));
    //        member.setName((String)request.getParameter("name"));
    //        member.setNickname((String)request.getParameter("nickname"));
    //        member.setPosition((String)request.getParameter("position"));
    //
    //        memberService.insertMember(member);
    //        ModelAndView result = new ModelAndView("redirect:/list");
    //
    //        return result;
    //    }
    @RequestMapping(value = "/insert", method = RequestMethod.POST)
    public ModelAndView insert(HttpServletRequest request) throws UnsupportedEncodingException {
        request.setCharacterEncoding("UTF-8");
        MemberModel member = new MemberModel();
        member.setId(Integer.parseInt(request.getParameter("id")));
        member.setName((String)request.getParameter("name"));
        member.setNickname((String)request.getParameter("nickname"));
        member.setPosition((String)request.getParameter("position"));
        member.setTeam((String)request.getParameter("team"));

        memberService.insertMember(member);
        ModelAndView result = new ModelAndView("redirect:/list?team="+member.getTeam());

        return result;
    }

    @RequestMapping("/selectTeam")
    public String selectTeam(Model model){

        return "selectTeam";
    }

    @RequestMapping("/list")
    public String list(Model model, HttpServletRequest request){
        String team = (String)request.getParameter("team");
        List<MemberModel> member = memberService.printMember(team);

        model.addAttribute("memberList", member);

        return "list";
    }
}
