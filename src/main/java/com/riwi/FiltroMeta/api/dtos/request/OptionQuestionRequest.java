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

public class OptionQuestionRequest {
    @NotBlank(message = "text is required")
    private String text;

    private long questionId;

    private boolean active;
    
}
