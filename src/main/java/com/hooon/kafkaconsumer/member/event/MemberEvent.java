package com.hooon.kafkaconsumer.member.event;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.hooon.kafkaconsumer.member.event.impl.MemberDeleteEvent;
import com.hooon.kafkaconsumer.member.event.impl.MemberUpdateEvent;

@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        property = "action")
@JsonSubTypes({
        @JsonSubTypes.Type(value = MemberUpdateEvent.class, name = "CREATE"),
        @JsonSubTypes.Type(value = MemberUpdateEvent.class, name = "UPDATE"),
        @JsonSubTypes.Type(value = MemberDeleteEvent.class, name = "DELETE")
})
public abstract class MemberEvent {

    public abstract MemberEventType getType();

    public abstract MemberEventPayload getPayload();
}
