package com.riwi.FiltroMeta.infrastructure.abstract_service;

import com.riwi.FiltroMeta.api.dtos.request.UserRequest;
import com.riwi.FiltroMeta.api.dtos.response.UserResponse;

public interface IUserService  extends ServicioBase<UserRequest, UserResponse, Long> {
    
}
