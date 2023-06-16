package com.issuekr.www.controllers;

import com.issuekr.www.dtos.IssueRequestDto;
import com.issuekr.www.dtos.IssueResponseAllDto;
import com.issuekr.www.services.IssueService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/issue")
public class IssueApiController {

    private final IssueService service;

    @PostMapping("/create")
    // 새로운 이슈 생성
    public ResponseEntity<Long> createIssue(@RequestBody IssueRequestDto dto){
        return ResponseEntity.status(HttpStatus.OK).body(service.createIssue(dto));
    }

    @GetMapping("/all")
    // 전체 이슈
    public ResponseEntity<List<IssueResponseAllDto>> getAllIssue(){
        return ResponseEntity.status(HttpStatus.OK).body(service.getAllIssue());
    }


}
