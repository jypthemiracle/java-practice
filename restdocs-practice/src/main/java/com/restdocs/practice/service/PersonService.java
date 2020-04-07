package com.restdocs.practice.service;

import com.restdocs.practice.api.domain.Person;
import com.restdocs.practice.api.domain.PersonRepository;
import com.restdocs.practice.api.dto.PersonDto;
import com.restdocs.practice.api.exception.NotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class PersonService {

  private final PersonRepository personRepository;

  public List<PersonDto.Response> findAll() {

    return personRepository.findAll().stream()
        .map(PersonDto.Response::of)
        .collect(Collectors.toList());
  }

  public PersonDto.Response findById(Long id) {

    return personRepository.findById(id)
        .map(PersonDto.Response::of)
        .orElseThrow(NotFoundException::new);
  }

  public PersonDto.Response add(PersonDto.Create create) {

    Person target = create.toEntity();
    Person created = personRepository.save(target);

    return PersonDto.Response.of(created);
  }

  public void delete(Long id) {

    Person person = personRepository.findById(id)
        .orElseThrow(NotFoundException::new);

    personRepository.delete(person);
  }

  @Transactional
  public PersonDto.Response update(Long id, PersonDto.Update update) {

    Person updated = personRepository.findById(id)
        .map(update::apply)
        .orElseThrow(NotFoundException::new);

    return PersonDto.Response.of(updated);
  }
}