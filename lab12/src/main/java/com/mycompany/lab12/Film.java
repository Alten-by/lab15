/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab12;

import java.util.List;

/**
 *
 * @author Timofey
 */
public class Film{
    private int id;
    private String title;
    private String genre;
    private int rating;
    private List<Integer> criticScores;
    public Film(int id, String title, String genre, int rating, List<Integer> criticScores){
        this.id = id;
        this.title = title;
        this.genre = genre;
        this.rating = rating;
        this.criticScores = criticScores;
    }
    public int getRating(){
        return rating;
    }
    public void setRating(int rating){
        this.rating=rating;
    }
    public double getAverageScore(){
        if (criticScores == null || criticScores.isEmpty()) {
        return 0;
        }
        int all = 0;
        for(int score : criticScores)
            all += score;
        return (double)all/criticScores.size();
    }
    
        public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public List<Integer> getCriticScores() {
        return criticScores;
    }

    public void setCriticScores(List<Integer> criticScores) {
        this.criticScores = criticScores;
    }
    
    @Override
    public String toString() {
        return "Film{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", genre='" + genre + '\'' +
                ", rating=" + rating +
                ", criticScores=" + criticScores +
                ", averageScore=" + getAverageScore() +
                '}';
    }
}

