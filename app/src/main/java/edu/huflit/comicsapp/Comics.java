package edu.huflit.comicsapp;

import java.io.Serializable;

public class Comics implements Serializable{
    int id;
    String name;
    String image;
    String category;
    int likes;
    String chapter;
    String info;
    String author;

    public Comics(int id, String name, String image, String category, int likes, String chapter, String info, String author) {
        this.id = id;
        this.name = name;
        this.image = image;
        this.category = category;
        this.likes = likes;
        this.chapter = chapter;
        this.info = info;
        this.author = author;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getImage() {
        return image;
    }

    public String getCategory() {
        return category;
    }

    public int getLikes() {
        return likes;
    }

    public String getChapter() {
        return chapter;
    }

    public String getInfo() {
        return info;
    }

    public String getAuthor() {
        return author;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public void setChapter(String chapter) {
        this.chapter = chapter;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}



