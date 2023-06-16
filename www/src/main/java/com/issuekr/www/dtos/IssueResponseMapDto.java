package com.issuekr.www.dtos;

import com.issuekr.www.entities.Issue;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class IssueResponseMapDto {

    public Long id;

    public String title;

    public Double lat;

    public Double lng;

    public IssueResponseMapDto(Issue issue){
        this.id = issue.getId();
        this.title = issue.getTitle();
        this.lat = issue.getLat();
        this.lng = issue.getLng();
    }
}
