package kr.co.abandog;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import kr.co.abandog.dao.MemberRepository;
import kr.co.abandog.entity.Abandog;
import kr.co.abandog.entity.AbandogStateCD;
import kr.co.abandog.entity.AbandogTypeCD;
import kr.co.abandog.entity.Member;

@SpringBootTest
class AbandoneddogApplicationTests {
	
	@Autowired
	private MemberRepository memberRepository;
	
	@Test
	public void testDependency() {
		System.out.println(memberRepository.getClass().getName());
	}

	//@Test
	public void getMember() {
		
		List<Member> list = memberRepository.getListASC();
		
		for(Member member : list) {
			System.out.println(member);
		}
	}
	
	//@Test
	public void getAbandog() {
		List<Abandog> list = memberRepository.getListAbandogASC();
			
		for(Abandog abandog : list) {
			System.out.println(abandog);
		}
	}
	
	//@Test
	public void getAbandogStateCD() {
		List<AbandogStateCD> list = memberRepository.getListAbandogStateCDASC();
		
		for(AbandogStateCD aban : list) {
			System.out.println(aban);
		}
	}
	
	@Test
	public void getAbandogTypeCD() {
		List<AbandogTypeCD> list = memberRepository.getListAbandogTypeCDASC();
		
		for(AbandogTypeCD aban : list) {
			System.out.println(aban);
		}
	}

}
