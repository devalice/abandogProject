package kr.co.abandog.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import kr.co.abandog.entity.Abandog;
import kr.co.abandog.entity.AbandogStateCD;
import kr.co.abandog.entity.AbandogTypeCD;
import kr.co.abandog.entity.Member;

public interface MemberRepository extends JpaRepository<Member, Long>{
}
