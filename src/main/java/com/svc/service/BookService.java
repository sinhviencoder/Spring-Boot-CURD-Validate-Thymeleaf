package com.svc.service;

import com.svc.entity.Book;

public interface BookService {
	
	Iterable<Book> getBookAll();

	Book save(Book book);
}
