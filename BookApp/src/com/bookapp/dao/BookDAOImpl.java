package com.bookapp.dao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.bookapp.model.Book;

public class BookDAOImpl implements BookDAO {

	@Override
	public List<Book> getAllBooks() {
		// TODO Auto-generated method stub
		return showBookList();
	}

	@Override
	public List<Book> getByAuthor(String author) {
		// TODO Auto-generated method stub
		List<Book> newBookList=new ArrayList<>();
		for(Book book : showBookList()) {
			if(book.getAuthor().equals(author))
				newBookList.add(book);
		}
		return newBookList;
	}

	@Override
	public List<Book> getByCategory(String category) {
		// TODO Auto-generated method stub
		List<Book> newBookList =new ArrayList<>();
		for (Book book : showBookList()) {
			if(book.getAuthor().equals(category))
				newBookList.add(book);
		}
		
		return null;
	}

	@Override
	public List<Book> getById(int id) {
		// TODO Auto-generated method stub
		for(Book book : showBookList()) {
			if(book.getBookId()==id)
				return showBookList();
		}
		return null;
	}
	
	private List<Book> showBookList(){
		return Arrays.asList(
				new Book(1,"Learn Java","Teja","Tech",900.0),
				new Book(1,"7 Habbits","charan","self-help",900.0),
				new Book(1,"Learn Ikigai","Ram","selfhelp",1700.0),
				new Book(1,"Learn Spring","Tom","Tech",500.0));
	}

}
