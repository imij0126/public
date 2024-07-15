package com.kh.practice.list.library.controller;

import com.kh.practice.list.library.model.vo.Book;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BookController {
    private List<Book> bookList = new ArrayList<>();

    public BookController() {}

    public void insertBook(Book bk) {
        bookList.add(bk);
    }

    public ArrayList<Book> selectList() {
        return new ArrayList<>(bookList);
    }

    public ArrayList<Book> searchBook(String keyword) {
        ArrayList<Book> searchList = new ArrayList<>();
        for (Book book : bookList) {
            if (book.getTitle().contains(keyword)) {
                searchList.add(book);
            }
        }
        return searchList;
    }

    public Book deleteBook(String title, String author) {
        for (Book book : bookList) {
            if (book.getTitle().equals(title) && book.getAuthor().equals(author)) {
                bookList.remove(book);
                return book;
            }
        }
        return null;
    }

    public int ascBook() {
        Collections.sort(bookList);
        return 1;
    }
}