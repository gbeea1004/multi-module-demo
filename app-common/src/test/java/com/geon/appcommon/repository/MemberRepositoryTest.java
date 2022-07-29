package com.geon.appcommon.repository;

import com.geon.appcommon.model.Member;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@DataJpaTest
class MemberRepositoryTest {

    @Autowired
    private MemberRepository memberRepository;

    @Test
    void add() {
        memberRepository.save(new Member("하이"));
        List<Member> all = memberRepository.findAll();
        for (Member member : all) {
            System.out.println("member = " + member);
        }
    }
}