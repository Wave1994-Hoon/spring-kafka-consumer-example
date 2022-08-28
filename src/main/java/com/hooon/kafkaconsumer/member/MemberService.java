package com.hooon.kafkaconsumer.member;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class MemberService {

    private final MemberRepository repository;

    public void update(Member member) {
        Optional<Member> findMember = repository.findById(member.getId());

        if (findMember.isEmpty()) {
            repository.save(member);
            return;
        }
        repository.update(member);
    }

    public void delete(Member member) {
        repository.delete(member);
    }
}
