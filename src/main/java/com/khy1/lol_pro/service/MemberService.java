package com.khy1.lol_pro.service;

import com.khy1.lol_pro.model.MemberModel;
import org.springframework.stereotype.Service;

import java.util.List;

public interface MemberService {
    List<MemberModel> printMember(String team);
    void insertMember(MemberModel member);
}
