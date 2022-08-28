package com.hooon.kafkaconsumer.member;

import com.hooon.kafkaconsumer.member.event.MemberEvent;
import com.hooon.kafkaconsumer.member.event.MemberEventType;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@RequiredArgsConstructor
public class MemberProcessor {

    private final MemberService service;

    public void process(MemberEvent event) {
        Member member = MemberMapper.eventToEntity(event.getPayload());

        if (event.getType() == MemberEventType.CREATE || event.getType() == MemberEventType.UPDATE) {
            service.update(member);
            return;
        }

        if (event.getType() == MemberEventType.DELETE) {
            service.delete(member);
        }
    }
}
