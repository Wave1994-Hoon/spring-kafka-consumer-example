package com.hooon.kafkaconsumer.member.event;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class MemberEventPayload {

    private Long memberId;

    private String name;
}
