package com.khy1.lol_pro.dao;

import com.khy1.lol_pro.model.MemberModel;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface MemberDao {
    List<MemberModel> getMember(@Param("team") String team);
    void setMember(MemberModel member);
}
