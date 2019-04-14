package com.bcj.memberportal.service;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

import org.springframework.transaction.annotation.Transactional;

import com.bcj.memberportal.model.Member;



@WebService
public interface MemberService {

	@WebMethod @Transactional
	public int createMember(Member mmbr);
	
	@WebMethod 	@Transactional
	public List<Member> getMemberById(int id);
}
