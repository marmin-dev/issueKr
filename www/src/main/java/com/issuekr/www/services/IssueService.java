package com.issuekr.www.services;

import com.issuekr.www.dtos.IssueRequestDto;
import com.issuekr.www.dtos.IssueResponseAllDto;
import com.issuekr.www.repositories.IssueRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class IssueService {

    private final IssueRepository issueRepository;

    @Transactional
    public Long createIssue (IssueRequestDto dto){
        /* 게시물 생성 */
        return issueRepository.save(dto.toEntity(dto)).getId();
    }

    @Transactional
    public List<IssueResponseAllDto> getAllIssue(){
        // 모든 게시물 불러오기
        return issueRepository.findAll(Sort.by(Sort.Order.
                desc("id"))).stream().map(IssueResponseAllDto::new).collect(Collectors.toList());
    }


    @Transactional
    public List<IssueResponseAllDto> getTodayIssue(){
        LocalDateTime startOfDay = LocalDateTime.of(LocalDate.now(), LocalTime.MIN);
        LocalDateTime endOfDay = LocalDateTime.of(LocalDate.now(), LocalTime.MAX);
        return issueRepository.findAllByCreatedDateBetween(startOfDay,endOfDay, Sort.by(Sort.Order.
                desc("id"))).stream().map(IssueResponseAllDto::new).collect(Collectors.toList());
    }
    // 오늘 있던 게시물 불러오기
}
