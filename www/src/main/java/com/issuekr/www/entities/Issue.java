package com.issuekr.www.entities;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table
@Builder
@Data
public class Issue extends BaseTimeEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // 글제목
    @Column(nullable = false)
    private String title;

    // 작성자
    @Column(nullable = false)
    private String author;

    // 위도
    @Column(nullable = false)
    private Double lat;

    // 경도
    @Column(nullable = false)
    private Double lng;

    // 내용
    @Column(nullable = false)
    private String content;
}
