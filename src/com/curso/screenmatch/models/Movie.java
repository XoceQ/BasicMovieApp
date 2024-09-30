package com.curso.screenmatch.models;

import com.cursos.screenmatch.calculations.Rating;

public class Movie extends Title implements Rating {
    private String director;

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }
    @Override
    public void showTecnicalFeatures(){
        super.showTecnicalFeatures();
        System.out.println("Director: " + director);
    }

    @Override
    public int getRating() {
        return (int) (calculateAverageRating()/2);
    }
}
