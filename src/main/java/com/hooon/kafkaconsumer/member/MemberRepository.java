package com.hooon.kafkaconsumer.member;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Slf4j
@Repository
public class MemberRepository {

    public Optional<Member> findById(Long memberId) {
        return Optional.of(Member.getMemberMock());
    }

    public void update(Member member) {
        log.info("Run update operation");
    }

    public void save(Member member) {
        log.info("Run save operation");
    }

    public void delete(Member member) {
        log.info("Run delete operation");
    }

}
