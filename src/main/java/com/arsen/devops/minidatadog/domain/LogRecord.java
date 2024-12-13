package com.arsen.devops.minidatadog.domain;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

import java.time.ZonedDateTime;

@Getter
@Setter
@Document(indexName = "lab7_logs", createIndex = false)
public class LogRecord {

    @Id
    private String id;
    @Field(type = FieldType.Date, name = "@timestamp")
    private ZonedDateTime timestamp;
    private String severity;
    @Field(name = "class")
    private String className;
    private String message;

}
