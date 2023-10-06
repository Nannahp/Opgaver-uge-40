package Vehicles.authorsandbook;

import java.util.ArrayList;

public class Author {

    private String name;
    private char gender;
    private String email;
    private ArrayList<Book> books = new ArrayList<Book>();

    public Author(String name, char gender, String email){
        this.name = name;
        this.gender = gender;
        setEmail(email);
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public char getGender() {
        return gender;
    }

    public String getEmail() {
        return email;
    }

    public ArrayList<Book> getBooks() {
        return books;
    }

    public void addBooks(Book book) {
        books.add(book);


    }
}
