package com.arsen.devops.minidatadog.service;

import com.arsen.devops.minidatadog.api.dto.SearchRequest;
import com.arsen.devops.minidatadog.domain.LogRecord;
import com.arsen.devops.minidatadog.repository.LogRecordRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@RequiredArgsConstructor
@Service
public class LogRecordService {

    private final LogRecordRepository repository;

    public List<LogRecord> search(SearchRequest request) {
        if (Objects.nonNull(request.getMessage())) {
            if (Objects.nonNull(request.getFrom()) && Objects.nonNull(request.getTo())) {
                return repository.findByTimestampBetweenAndMessageLikeIgnoreCase(request.getFrom(), request.getTo(), request.getMessage());
            }
            return repository.findByMessageLikeIgnoreCase(request.getMessage());
        }
        if (Objects.nonNull(request.getFrom()) && Objects.nonNull(request.getTo())) {
            return repository.findByTimestampBetween(request.getFrom(), request.getTo());
        }

        return List.of();
    }
}
