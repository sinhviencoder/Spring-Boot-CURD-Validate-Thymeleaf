package com.svc.service.repository;

import org.springframework.data.repository.CrudRepository;

import com.svc.entity.Book;


public interface BookRepository extends CrudRepository<Book, Integer>{

}
