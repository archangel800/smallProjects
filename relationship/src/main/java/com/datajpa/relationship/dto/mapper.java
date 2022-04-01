package com.datajpa.relationship.dto;

import com.datajpa.relationship.dto.resposeDto.AuthorResponseDto;
import com.datajpa.relationship.dto.resposeDto.BookResponseDto;
import com.datajpa.relationship.model.Author;
import com.datajpa.relationship.model.Book;

import java.util.ArrayList;
import java.util.List;

public class mapper {
    public static BookResponseDto bookToBookResponseDto(Book book){
        BookResponseDto bookResponseDto = new BookResponseDto();
        bookResponseDto.setId(book.getId());
        bookResponseDto.setCategoryName(book.getCategory().getName());
        List<String> names = new ArrayList<>();
        List<Author> authors = book.getAuthors();
        for(Author author: authors){
            names.add(author.getName());
        }

        bookResponseDto.setAuthorNames(names);
        return bookResponseDto;
    }

    public static List<BookResponseDto> bookResponseDtos(List<Book> books){
        List<BookResponseDto> bookResponseDtos = new ArrayList<>();
        for (Book book:books){
            bookResponseDtos.add(bookToBookResponseDto(book));
        }
        return bookResponseDtos;
    }
    public static AuthorResponseDto authorToAuthorResponseDto(Author author){
        AuthorResponseDto authorResponseDto = new AuthorResponseDto();
        authorResponseDto.setId(author.getId());
        authorResponseDto.setName(author.getName());
        List<String> names = new ArrayList<>();
        List<Book> books = author.getBooks();
        for (Book book : books){
            names.add(book.getName());
        }
        authorResponseDto.setBookNames(names);
        return authorResponseDto;
    }
    public static List<AuthorResponseDto> authorResponseDtos(List<Author> authors){
        List<AuthorResponseDto> authorResponseDtos = new ArrayList<>();
        for(Author author: authors){
            authorResponseDtos.add(authorToAuthorResponseDto(author));
        }
        return authorResponseDtos;
    }
}
