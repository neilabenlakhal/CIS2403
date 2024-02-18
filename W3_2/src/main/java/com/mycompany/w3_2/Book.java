/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.w3_2;

/**
 *
* Access modifiers: 

* Public: Everyone can access.
* Default (Package-Private): Only classes in the same "folder" (package) can access.
* Private: Only this class can access.
* Protected: Only this class and its "family" (subclasses) can access.

* These access levels help in controlling who can see and modify the information 
 inside our Book class, making sure that everything stays organized and secure.
 * 
 * 
 * 
 * @author nlakhal
 */
public class Book {
    // Public attribute (anyone can see and change it)
    public String title;

    // Default (package-private) attribute (only classes in the same folder/package can see and change it)
    String author;

    // Private attribute (only this class can see and change it)
    private int pageCount;

    // Protected attribute (only this class and its subclasses can see and change it)
    protected String genre;

    // Constructor (a special method to create a new book)
    public Book(String title, String author, int pageCount, String genre) {
        this.title = title;
        this.author = author;
        this.pageCount = pageCount;
        this.genre = genre;
    }

    // Public method (anyone can ask the book to display info)
    public void displayInfo() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Page Count: " + pageCount);
        System.out.println("Genre: " + genre);
    }
}

