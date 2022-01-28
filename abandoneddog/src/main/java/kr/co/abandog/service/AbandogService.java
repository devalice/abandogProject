package kr.co.abandog.service;

import kr.co.abandog.dto.AbandogDTO;
import kr.co.abandog.entity.Abandog;
import kr.co.abandog.entity.AbandogStateCD;
import kr.co.abandog.entity.AbandogTypeCD;
import kr.co.abandog.entity.Member;

public interface AbandogService {
	
	//서울시 유기견 데이터 DB 저장
	public String abandogput(String json);
	
	
	default Abandog dtoToEntity(AbandogDTO dto) {
		Member member = Member.builder()
							  .member_email(dto.getMember_email())
							  .build();
		
		AbandogStateCD abandogStateCD = AbandogStateCD.builder()
									   .state_cd(dto.getState_cd())
									   .build();
		
		AbandogTypeCD abandogTypeCD = AbandogTypeCD.builder()
												   .type_cd(dto.getType_cd())
												   .build();
		
		Abandog abandog = Abandog.builder()
								 .abandog_name(dto.getAbandog_name())
								 .abandog_age(dto.getAbandog_age())
								 .aban_dog_gender(dto.getAban_dog_gender())
								 .abandog_date(dto.getAbandog_date())
								 .abandog_location(dto.getAbandog_location())
								 .abandog_guardian(member.getMember_name())
								 .animal_no(dto.getAnimal_no())
								 .member(member)
								 .stateCD(abandogStateCD)
								 .typeCD(abandogTypeCD)
								 .build();
		
		return abandog;
	}
	
	default AbandogDTO entityToDTO(Abandog board, Member member) {
		AbandogDTO dto = AbandogDTO.builder()
								.build();
		return dto;
	}
	

}
