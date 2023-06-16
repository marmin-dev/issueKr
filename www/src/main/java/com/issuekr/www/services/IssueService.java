package com.issuekr.www.services;

import com.issuekr.www.dtos.IssueRequestDto;
import com.issuekr.www.dtos.IssueResponseAllDto;
import com.issuekr.www.dtos.IssueResponseDetailDto;
import com.issuekr.www.dtos.IssueResponseMapDto;
import com.issuekr.www.entities.Issue;
import com.issuekr.www.repositories.IssueRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.List;
import java.util.Optional;
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
    public List<IssueResponseMapDto> getAllMap(){
        // 모든 있던일 지도에 표시하기
        return issueRepository.findAll(Sort.by(Sort.Order.
                desc("id"))).stream().map(IssueResponseMapDto::new).collect(Collectors.toList());
    }

    @Transactional
    public List<IssueResponseAllDto> getTodayIssue(){
        // 오늘 있던 게시물 불러오기
        LocalDate today = LocalDate.now();
        return issueRepository.findTodayIssue(today)
                .stream().map(IssueResponseAllDto::new).collect(Collectors.toList());
    }

    @Transactional
    public List<IssueResponseMapDto> getTodayMap(){
        // 오늘 있던 일 지도에 표시하기
        LocalDate today = LocalDate.now();
        return issueRepository.findTodayIssue(today)
                .stream().map(IssueResponseMapDto::new).collect(Collectors.toList());
    }

    @Transactional
    public IssueResponseDetailDto getDetail(Long id){
        // 게시물 상세보기
        Optional<Issue> issueOptional = issueRepository.findById(id);
        try{
            Issue issue = issueOptional.get();
            IssueResponseDetailDto dto = new IssueResponseDetailDto(issue);
            return dto;
        }catch (Exception e) {
            IssueResponseDetailDto detailDto = new IssueResponseDetailDto();
            detailDto.setTitle("존재하지 않는 게시글입니다");
            return detailDto;
        }
    }

    @Transactional
    public String deleteIssue(Long id){
        issueRepository.deleteById(id);
        return "삭제완료!";
    }

}
