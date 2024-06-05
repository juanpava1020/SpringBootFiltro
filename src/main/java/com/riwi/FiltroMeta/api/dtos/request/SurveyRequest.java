package com.riwi.FiltroMeta.api.dtos.request;

import java.time.LocalDateTime;



import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor

public class SurveyRequest {

    @NotBlank(message = "title is required")
    private String title;

    private String descripcion;

    @NotNull(message = "creacion date is required")
    private LocalDateTime creationDate;

    @NotNull(message = "creator id is required")
    private long creatorId;

    @NotNull(message = "active is required")
    private boolean active;
    

    
}
