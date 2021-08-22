package com.enoca.controller;

import com.enoca.dto.PersonDto;
import com.enoca.service.PersonService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/person")
@RequiredArgsConstructor

public class PersonController {
    private final PersonService personService;

    @PostMapping
    public ResponseEntity<PersonDto>kaydet(@RequestBody PersonDto personDto){
        return ResponseEntity.ok(personService.save(personDto));
}


}
