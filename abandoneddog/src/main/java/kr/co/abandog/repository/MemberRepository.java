package kr.co.abandog.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import kr.co.abandog.entity.Abandog;
import kr.co.abandog.entity.AbandogStateCD;
import kr.co.abandog.entity.AbandogTypeCD;
import kr.co.abandog.entity.Member;

public interface MemberRepository extends JpaRepository<Member, Long>{
	@Query("select m from Member m order by m.member_id")
	List<Member> getListASC();
	
	@Query("select t1 from Abandog t1 order by t1.abandog_id")
	List<Abandog> getListAbandogASC();
	
	@Query("select t1 from AbandogStateCD t1 order by t1.state_cd")
	List<AbandogStateCD> getListAbandogStateCDASC();
	
	@Query("select t1 from AbandogTypeCD t1 order by t1.type_cd")
	List<AbandogTypeCD> getListAbandogTypeCDASC();
}
