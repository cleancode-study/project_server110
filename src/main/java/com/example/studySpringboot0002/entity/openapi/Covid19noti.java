package com.example.studySpringboot0002.entity.openapi;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Covid19noti {

    @Id
    private Long id;
    private String continent_cd;
    private String country_eng_nm;
    private String html_origin_cn;
}