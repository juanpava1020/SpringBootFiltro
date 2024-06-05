package com.riwi.FiltroMeta.domain.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.riwi.FiltroMeta.domain.entities.OptionQuestionEntity;

@Repository
public interface OptionQuestionRepository extends JpaRepository<OptionQuestionEntity,Long>{
    
}
