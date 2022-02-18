package kr.co.abandog.service;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.multipart.MultipartHttpServletRequest;

import kr.co.abandog.dto.MemberDTO;
import kr.co.abandog.entity.Member;

public interface AbandogUserService {
	default Member dtoToEntity(MemberDTO dto) {
		Member member = Member.builder()
				.member_email(dto.getMember_email())
				.member_pw(dto.getMember_pw())
				.member_name(dto.getMember_name())
				.member_age(dto.getMember_age())
				.member_gender(dto.getMember_gender())
				.member_phone(dto.getMember_phone())
				.member_address(dto.getMember_address())
				.build();

		return member;
	}
	default MemberDTO entityToDTO(Member member){ 
		MemberDTO dto = MemberDTO.builder() 
				.member_email(member.getMember_email())
				.member_pw(member.getMember_pw())
				.member_name(member.getMember_name())
				.member_age(member.getMember_age())
				.member_gender(member.getMember_gender())
				.member_phone(member.getMember_phone())
				.member_address(member.getMember_address())
				.build(); 
		return dto; 
	} 
	public String save(MemberDTO member);
}
