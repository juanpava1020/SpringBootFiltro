package com.riwi.FiltroMeta.domain.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Builder
@Entity(name = "optionquestion")
@AllArgsConstructor
@NoArgsConstructor
public class OptionQuestionEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false)
    @Lob
    private String text;

    @Column(nullable = false, length = 50)
    private String type;

    
    private int questionId;

    @Column(nullable = false)
    private boolean active;
    
}
