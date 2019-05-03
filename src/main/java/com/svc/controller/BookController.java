package com.svc.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.svc.entity.Book;
import com.svc.service.AuthorService;
import com.svc.service.BookService;

@Controller
public class BookController {
	@Autowired
	BookService bookService;
	@Autowired
	AuthorService authorService;

	@RequestMapping(value = "/book/add", method = RequestMethod.GET)
	public String addBook(Book book, Model model) {
		model.addAttribute("authors", authorService.getAuthorAll());
		return "form-add-book";
	}

	@RequestMapping(value = "/book/add", method = RequestMethod.POST)
	public String addBook(@ModelAttribute("book") @Valid Book book, BindingResult bindingResult, Model model) {

		if (bindingResult.hasErrors()) {
			model.addAttribute("authors", authorService.getAuthorAll());
			return "form-add-book";
		}
		bookService.save(book);
		return "redirect:/book/list-book";
	}
	

	@RequestMapping(value = "/book/list-book", method = RequestMethod.GET)
	public String listBook(Model model) {
		model.addAttribute("books", bookService.getBookAll());
		return "list-book";
	}
}
