package com.arsen.devops.minidatadog.api;

import com.arsen.devops.minidatadog.api.dto.SearchRequest;
import com.arsen.devops.minidatadog.domain.LogRecord;
import com.arsen.devops.minidatadog.service.LogRecordService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RequiredArgsConstructor
@RequestMapping("/search")
@RestController
public class SearchController {

    private final LogRecordService logRecordService;

    @PostMapping
    public List<LogRecord> search(@RequestBody SearchRequest request) {
        return logRecordService.search(request);
    }
}
