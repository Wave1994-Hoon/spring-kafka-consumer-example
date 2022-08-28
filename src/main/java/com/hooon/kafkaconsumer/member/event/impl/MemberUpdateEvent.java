package com.hooon.kafkaconsumer.member.event.impl;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.hooon.kafkaconsumer.member.event.MemberEvent;
import com.hooon.kafkaconsumer.member.event.MemberEventPayload;
import com.hooon.kafkaconsumer.member.event.MemberEventType;
import lombok.Getter;

@Getter
@JsonTypeName("UPDATE")
public class MemberUpdateEvent extends MemberEvent {

    private final MemberEventPayload payload;

    @JsonCreator
    public MemberUpdateEvent(@JsonProperty("data") MemberEventPayload payload) {
        this.payload = payload;
    }

    @Override
    public MemberEventType getType() {
        return MemberEventType.UPDATE;
    }

    @Override
    public MemberEventPayload getPayload() {
        return payload;
    }
}
