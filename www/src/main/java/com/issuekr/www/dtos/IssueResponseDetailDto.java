package com.issuekr.www.dtos;

import com.issuekr.www.entities.Issue;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class IssueResponseDetailDto {
    private Long id;

    // 글제목
    private String title;

    // 작성자
    private String author;

    // 위도
    private Double lat;

    // 경도
    private Double lng;

    // 내용
    private String content;

    public IssueResponseDetailDto(Issue issue){
        this.id = issue.getId();
        this.title = issue.getTitle();
        this.author = issue.getAuthor();
        this.lat = issue.getLat();
        this.lng = issue.getLng();
        this.content = issue.getContent();
    }
}
