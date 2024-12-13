package com.arsen.devops.minidatadog.repository;

import com.arsen.devops.minidatadog.domain.LogRecord;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

import java.time.ZonedDateTime;
import java.util.List;

@Repository
public interface LogRecordRepository extends ElasticsearchRepository<LogRecord, String> {

    List<LogRecord> findByMessageLikeIgnoreCase(String message);

    List<LogRecord> findByTimestampBetween(ZonedDateTime from, ZonedDateTime to);

    List<LogRecord> findByTimestampBetweenAndMessageLikeIgnoreCase(ZonedDateTime from, ZonedDateTime to, String message);

}
