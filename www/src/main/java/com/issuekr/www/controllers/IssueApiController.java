package com.issuekr.www.controllers;

import com.issuekr.www.dtos.IssueRequestDto;
import com.issuekr.www.dtos.IssueResponseAllDto;
import com.issuekr.www.dtos.IssueResponseDetailDto;
import com.issuekr.www.dtos.IssueResponseMapDto;
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

    @GetMapping("/all/map")
    // 전체 이슈 지도상에 표시하기
    public ResponseEntity<List<IssueResponseMapDto>> getAllMap(){
        return ResponseEntity.status(HttpStatus.OK).body(service.getAllMap());
    }

    @GetMapping("/today")
    // 오늘 있던 이슈
    public ResponseEntity<List<IssueResponseAllDto>> getTodayIssue(){
        return ResponseEntity.status(HttpStatus.OK).body(service.getTodayIssue());
    }

    @GetMapping("/today/map")
    // 오늘 있던 이슈 지도상에 표시하기
    public ResponseEntity<List<IssueResponseMapDto>> getTodayMap(){
        return ResponseEntity.status(HttpStatus.OK).body(service.getTodayMap());
    }

    @GetMapping("/detail/{id}")
    public ResponseEntity<IssueResponseDetailDto> getDetail(@PathVariable Long id){
        return ResponseEntity.status(HttpStatus.OK).body(service.getDetail(id));
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteIssue(@PathVariable Long id){
        return ResponseEntity.status(HttpStatus.OK).body(service.deleteIssue(id));
    }


}
