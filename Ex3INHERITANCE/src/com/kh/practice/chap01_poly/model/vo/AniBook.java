package com.kh.practice.chap01_poly.model.vo;

public class AniBook {
    private String title;
    private String author;
    private String publisher;
    private int accessAge;

    public AniBook(){}
    public AniBook(String title, String author, String publisher,
                   int accessAge){
        this.title=title;
        this.author=author;
        this.publisher=publisher;
        this.accessAge=accessAge;
    }
    public String toSpring(){
        return "title="+title+", author="+author+", publisher="+
                publisher +", accessAge="+accessAge;
    }

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

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getAccessAge() {
        return accessAge;
    }

    public void setAccessAge(int accessAge) {
        this.accessAge = accessAge;
    }
}
