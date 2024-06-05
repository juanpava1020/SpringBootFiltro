package com.riwi.FiltroMeta.api.dtos.response;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor




public class SurveyResponse {
     private Long id;
    private String title;
    private String description;
    private LocalDateTime creationDate;
    private UserResponse creatorId;
    private Boolean active;
    
    
}
