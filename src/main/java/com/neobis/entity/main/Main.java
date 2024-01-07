package com.neobis.entity.main;


import com.neobis.dao.AuthorDAO;
import com.neobis.dao.BookDAO;
import com.neobis.dao.PublisherDAO;
import com.neobis.entity.book.Author;
import com.neobis.entity.book.Book;
import com.neobis.entity.book.Genre;
import com.neobis.entity.book.Publisher;

import java.util.Date;

public class Main
{
    public static void main( String[] args )
    {

//            AuthorDAO authorDAO = new AuthorDAO();
//            Author author1 = new Author(null, "Sean", "MCNail", 0773052654, "sean00@mail.com", "He was born in 1967 near the Candem town.");
//            authorDAO.deleteAuthor(author1);
//
//            PublisherDAO publisherDAO =new PublisherDAO();
//            Publisher publisher1 = new Publisher(null, "Penguin House", "34 Buchinham street, London, UK", 8790998);
//            publisherDAO.deletePublisher(publisher1);
//
//            Book book1 = new Book();
//            BookDAO bookDAO = new BookDAO();
//            bookDAO.deleteBook(book1);

            Long authorId = 1L;

            AuthorDAO authorDAO = new AuthorDAO();
            Author author = authorDAO.getAuthorById(authorId);
            if (author != null) {
                System.out.println("Author Found: " + author);


            } else {
                System.out.println("No author found with ID: " + authorId);
            }
        }

}

