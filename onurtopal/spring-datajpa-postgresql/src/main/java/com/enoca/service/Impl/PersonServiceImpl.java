package com.enoca.service.Impl;

import com.enoca.dto.PersonDto;
import com.enoca.entitiy.Company;
import com.enoca.entitiy.Person;
import com.enoca.repo.CompanyRepository;
import com.enoca.repo.PersonRepository;
import com.enoca.service.PersonService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class PersonServiceImpl implements PersonService {

    private final PersonRepository personRepository;
    private final CompanyRepository companyRepository;

    @Override
    public PersonDto save(PersonDto personDto) {

        Person person=new Person();
        person.setName(personDto.getName());
        person.setSurname(personDto.getSurname());
        final Person personDb =personRepository.save(person);
        List<Company>Liste=new ArrayList<>();

        companyRepository.saveAll(Liste);


        return null;
    }
    @Override
    public void delete(Long id) {
    }
    @Override
    public PersonDto getAll(PersonDto personDto) {
        return null;
    }
    @Override
    public Page<PersonDto>getAll(Pageable pageable) {
        return null;
    }

}
