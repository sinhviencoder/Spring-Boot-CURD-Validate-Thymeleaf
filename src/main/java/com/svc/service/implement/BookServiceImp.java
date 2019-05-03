package com.svc.service.implement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.svc.entity.Book;
import com.svc.service.BookService;
import com.svc.service.repository.BookRepository;

@Service
public class BookServiceImp implements BookService {

	@Autowired
	BookRepository bookRepository;

	@Override
	public Book save(Book book) {
		return bookRepository.save(book);
	}

	@Override
	public Iterable<Book> getBookAll() {
		return bookRepository.findAll();
	}

}
