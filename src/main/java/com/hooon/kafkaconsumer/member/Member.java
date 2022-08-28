package com.hooon.kafkaconsumer.member;

import lombok.Getter;

@Getter
public class Member {
    private final Long id;

    private final String name;

    public Member(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    private final static Member MEMBER_MOCK = new Member(0L, "");

    public static Member getMemberMock() {
        return MEMBER_MOCK;
    }
}
