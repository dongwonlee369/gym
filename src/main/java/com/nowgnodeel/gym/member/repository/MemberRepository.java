package com.nowgnodeel.gym.member.repository;

import com.nowgnodeel.gym.member.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Long> {
}
