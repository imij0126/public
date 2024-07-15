package com.kh.practice.list.library.model.vo;

public class Book implements Comparable<Book> {
    private String title;
    private String author;
    private String category;
    private int price;

    public Book() {}

    public Book(String title, String author, String category, int price) {
        this.title = title;
        this.author = author;
        this.category = category;
        this.price = price;
    }

    // Getter 및 Setter 메서드
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return title + "/" + author + "/" + category + "/" + price;
    }

    @Override
    public int hashCode() {
        // 간단한 해시코드 구현
        return title.hashCode() + author.hashCode() + category.hashCode() + price;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Book book = (Book) obj;
        return price == book.price &&
                title.equals(book.title) &&
                author.equals(book.author) &&
                category.equals(book.category);
    }

      @Override
        public int compareTo(Book other) {
        return this.title.compareTo(other.title);
    }
}