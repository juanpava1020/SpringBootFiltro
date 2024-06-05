package com.riwi.FiltroMeta.infrastructure.abstract_service;

import org.springframework.data.domain.Page;

public interface ServicioBase <RequestDTO, ResponseDTO, ID>{

    ResponseDTO create(RequestDTO request);

    ResponseDTO get(ID id);

    Page<ResponseDTO> getAll(int Page, int size);

    ResponseDTO update(ID id, RequestDTO request);

    void delete(ID id);
}