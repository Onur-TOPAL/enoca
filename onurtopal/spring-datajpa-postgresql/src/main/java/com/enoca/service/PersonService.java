package com.enoca.service;

import com.enoca.dto.PersonDto;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface PersonService {

    PersonDto save(PersonDto personDto);

    void delete(Long id);

    PersonDto getAll(PersonDto personDto);

    Page<PersonDto> getAll(Pageable pageable);
}
