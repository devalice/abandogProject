package kr.co.abandog;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import kr.co.abandog.repository.AbandogRepository;
import kr.co.abandog.repository.AbandogStateCDRepository;
import kr.co.abandog.repository.AbandogTypeCDRepository;
import kr.co.abandog.repository.MemberRepository;

@SpringBootTest
public class RepositoryTest {
	@Autowired
	private AbandogRepository abandogRepository;
	
	@Autowired
	private MemberRepository memberRepository;
	
	@Autowired
	private AbandogStateCDRepository abandogStateCDRepository;
	
	@Autowired
	private AbandogTypeCDRepository abandogTypeCDRepository;
	
	
	
}
