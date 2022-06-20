package com.khy1.lol_pro.service.Impl;

import com.khy1.lol_pro.dao.MemberDao;
import com.khy1.lol_pro.model.MemberModel;
import com.khy1.lol_pro.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MemberServiceImpl implements MemberService {

    @Autowired
    private MemberDao dao;

    @Override
    public List<MemberModel> printMember(String team) {
        List<MemberModel> member = dao.getMember(team);

        return member;
    }

    @Override
    public void insertMember(MemberModel member) {
        dao.setMember(member);
    }
}
