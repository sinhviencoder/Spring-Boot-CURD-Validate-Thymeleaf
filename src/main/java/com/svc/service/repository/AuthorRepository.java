package com.svc.service.repository;

import org.springframework.data.repository.CrudRepository;

import com.svc.entity.Author;

public interface AuthorRepository extends CrudRepository<Author, Integer>{

}
