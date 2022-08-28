package com.hooon.kafkaconsumer.member;

import com.hooon.kafkaconsumer.member.event.MemberEventPayload;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class MemberMapper {

    public static Member eventToEntity(MemberEventPayload payload) {
        return new Member(payload.getMemberId(), payload.getName());
    }
}
