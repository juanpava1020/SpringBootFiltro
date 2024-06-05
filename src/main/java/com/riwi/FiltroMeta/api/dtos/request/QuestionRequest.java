package com.riwi.FiltroMeta.api.dtos.request;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class QuestionRequest {
    @NotBlank(message = "text is required")
    private String text;

    @NotBlank(message = "type is required")
    private String type;

    private long surveyId;

    private boolean active;
    
}
