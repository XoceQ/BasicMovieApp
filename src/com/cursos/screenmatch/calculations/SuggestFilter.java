package com.cursos.screenmatch.calculations;

public class SuggestFilter {
    public void filtering(Rating rating) {
        if (rating.getRating() >= 4) {
            System.out.println("Muy bien evaluado en el momento");
        } else if (rating.getRating() >= 2) {
            System.out.println("Popular en el momento");

        }else {
            System.out.println("Ubicalo en tu lista para verlo después");
        }
    }
}
