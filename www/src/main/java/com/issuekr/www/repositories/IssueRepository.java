package com.issuekr.www.repositories;

import com.issuekr.www.entities.Issue;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

public interface IssueRepository extends JpaRepository<Issue, Long> {


    // 오늘있던 일만 찾기
    @Query("SELECT i FROM Issue i WHERE i.date = :today ORDER BY i.id DESC")
    List<Issue> findTodayIssue(@Param("today") LocalDate today);
}
