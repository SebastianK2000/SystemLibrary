package org.book;

public class Book implements Books {

    protected String title;
    protected String author;
    protected int year;
    protected String category;
    protected int pages;

    public Book(String title, String author, int year, String category, int pages)
    {
        this.title = title;
        this.author = author;
        this.year = year;
        this.category = category;
        this.pages = pages;
    }

    public String getTitle() {
        return title;
    }
    public String getAuthor() {
        return author;
    }
    public int getYear() {
        return year;
    }
    public String getCategory() {
        return category;
    }
    public int getPages() {
        return pages;
    }
}
