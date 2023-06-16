package com.issuekr.www.dtos;

import com.issuekr.www.entities.Issue;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
// 전체 리스트 반환시 사용할 Dto
public class IssueResponseAllDto {

    private Long id;

    // 글제목
    private String title;

    // 작성자
    private String author;

    // 작성/수정일자
    private LocalDateTime modifiedDate;

    //map 함수에 사용할 생성자
    public IssueResponseAllDto(Issue issue){
        this.id = issue.getId();
        this.title = issue.getTitle();
        this.author = issue.getAuthor();
        this.modifiedDate = getModifiedDate();
    }
}
