package com.adleritech.holly.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;


@Getter
@Builder
@AllArgsConstructor
public class Message {

    private final String channel;

    private final String text;

}
