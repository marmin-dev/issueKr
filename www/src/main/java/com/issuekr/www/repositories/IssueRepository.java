package com.issuekr.www.repositories;

import com.issuekr.www.entities.Issue;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDateTime;
import java.util.List;

public interface IssueRepository extends JpaRepository<Issue, Long> {

    // 오늘있던 일만 찾기
//    List<Issue> findAllByCreatedDateBetween(LocalDateTime start, LocalDateTime end, Sort sort);
}
