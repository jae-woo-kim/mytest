package com.example.firstproject.entity;

import jakarta.persistence.*;
import lombok.*;

@AllArgsConstructor
@ToString
@Entity
@Getter
@Setter
@NoArgsConstructor
public class Article {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)  // DB가 id 자동 생성
    private Long id;

    @Column
    private String title;

    @Column
    private String content;

}
