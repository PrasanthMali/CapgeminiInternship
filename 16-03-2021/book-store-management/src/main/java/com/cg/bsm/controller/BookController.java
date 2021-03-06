package com.cg.bsm.controller;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.cg.bsm.entity.Book;
import com.cg.bsm.entity.Publisher;
import com.cg.bsm.service.IBookService;

@Controller
public class BookController {
	
	/* used to display messages */
	public final static int SAVED = 1;
	public final static int DELETED = 2;
	
	@Autowired
	private IBookService bookStore;
	
	/* to bind departments enumeration values to drop down control in ui*/
	@ModelAttribute
	public void populateCommonData(Model model) {
		model.addAttribute("publisher", Publisher.values());
	}
	
	
	@GetMapping(path = "/books")
	public ModelAndView bookListAction() {
		return new ModelAndView("book-list", "books", bookStore.findAll());
	}
	
	@GetMapping(path="/newBook")
	public ModelAndView newBookAction() {
		return new ModelAndView("book-form", "book", new Book());
	}
	
	@PostMapping(path="/newBook")
	public ModelAndView saveBookAction(@Valid @ModelAttribute("book") Book book, BindingResult results) {
		ModelAndView mv;
		if (results.hasErrors()) {
			mv = new ModelAndView("book-form", "book", book);
		} else {
			book = bookStore.save(book);
			long bookId = book.getBookId();
			mv = new ModelAndView("redirect:/home?id="+bookId+"&msgCode="+SAVED);
		}
		return mv;
	}
	
	@GetMapping(path="/deleteBook")
    public ModelAndView deleteBookAction() {
		return new ModelAndView("book-del", "book", new Book());
    }
	
	@PostMapping(path="/deleteBook")
	public ModelAndView deleteBookAction(@Valid @ModelAttribute("bookId") Book book, BindingResult results) {
		ModelAndView mv;
		if (results.hasErrors()) {
			mv = new ModelAndView("book-del", "book", book);
		} else {
			long bookId=book.getBookId();
			bookStore.deleteById(bookId);
			mv = new ModelAndView("redirect:/home?id="+bookId+"&msgCode="+DELETED);
		}
		return mv;
	}
}
