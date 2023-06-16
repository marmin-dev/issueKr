package com.issuekr.www.dtos;

import com.issuekr.www.entities.Issue;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@NoArgsConstructor
@Getter
@Setter
public class IssueRequestDto {

    String title;

    String author;

    Double lat;

    Double lng;

    String content;

    // 저장시 엔티티로 바꿀 메서드
    public Issue toEntity(IssueRequestDto dto){
        return Issue.builder()
                .title(dto.title)
                .author(dto.author)
                .lat(dto.lat)
                .lng(dto.lng)
                .content(dto.content).build();
    }
}
