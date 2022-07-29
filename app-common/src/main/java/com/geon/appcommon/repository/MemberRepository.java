package com.geon.appcommon.repository;

import com.geon.appcommon.model.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Long> {
}
