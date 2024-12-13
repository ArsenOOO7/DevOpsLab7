package com.arsen.devops.minidatadog.api.dto;

import lombok.Getter;
import lombok.Setter;

import java.time.ZonedDateTime;

@Getter
@Setter
public class SearchRequest {

    private String message;
    private ZonedDateTime from;
    private ZonedDateTime to;

}
