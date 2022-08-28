package com.hooon.kafkaconsumer.member.event.impl;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.hooon.kafkaconsumer.member.event.MemberEvent;
import com.hooon.kafkaconsumer.member.event.MemberEventPayload;
import com.hooon.kafkaconsumer.member.event.MemberEventType;
import lombok.Getter;

@Getter
@JsonTypeName("DELETE")
public class MemberDeleteEvent extends MemberEvent {

    private final MemberEventPayload payload;

    @JsonCreator
    public MemberDeleteEvent(@JsonProperty("data") MemberEventPayload payload) {
        this.payload = payload;
    }

    @Override
    public MemberEventType getType() {
        return MemberEventType.DELETE;
    }

    @Override
    public MemberEventPayload getPayload() {
        return payload;
    }
}
