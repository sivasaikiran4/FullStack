package com.bcj.memberportal.service;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bcj.memberportal.dao.MemberDao;
import com.bcj.memberportal.model.Member;





@Service @WebService(endpointInterface="com.bcj.memberportal.service.MemberService")
public class MemberImpl implements MemberService {
	
	@Autowired
	MemberDao dao;
	@Autowired
	Member mnbr;
	
	
	
	public void setDao(MemberDao dao) {
		this.dao = dao;
	}

	public void setMnbr(Member mnbr) {
		this.mnbr = mnbr;
	}

	@WebMethod
	public int createMember(Member mmbr) {
		
		return dao.createMember(mmbr);
	}

	public List<Member> getMemberById(int id) {
		
		return dao.getMemberById(id);
	}

	

}
