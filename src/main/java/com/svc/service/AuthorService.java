package com.svc.service;

import com.svc.entity.Author;

public interface AuthorService {

	Author save(Author author);

	Iterable<Author> getAuthorAll();
}
