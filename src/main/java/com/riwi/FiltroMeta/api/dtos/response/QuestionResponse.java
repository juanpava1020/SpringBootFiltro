package com.riwi.FiltroMeta.api.dtos.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor

public class QuestionResponse {
    private long id;
    private String text;
    private String type;
    private SurveyResponse surveyId;
    private boolean active;
}
