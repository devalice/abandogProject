package kr.co.abandog.service;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import kr.co.abandog.dto.MemberDTO;
import kr.co.abandog.entity.Abandog;
import kr.co.abandog.entity.Member;
import kr.co.abandog.repository.AbandogRepository;
import kr.co.abandog.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Service 
@Log4j2 
@RequiredArgsConstructor
public class AbandogUserServiceImpl implements AbandogUserService {

	private final MemberRepository memberRepository;

	public String joinmember(MemberDTO dto) {
		

		MemberDTO memberDTO = new MemberDTO();
		memberDTO.setMember_email(dto.getMember_email());
		
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
		memberDTO.setMember_pw(encoder.encode(dto.getMember_pw()));
		
		memberDTO.setMember_name(dto.getMember_name());
		memberDTO.setMember_age(dto.getMember_age());
		memberDTO.setMember_gender(dto.getMember_gender());
		memberDTO.setMember_phone(dto.getMember_phone());
		memberDTO.setMember_address(dto.getMember_address());

		Member member = dtoToEntity(dto);
		memberRepository.save(member);

		return "";
	}
}
