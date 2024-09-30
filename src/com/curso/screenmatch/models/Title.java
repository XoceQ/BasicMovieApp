package com.curso.screenmatch.models;

public class Title {
    private String name;
    private int dateReleased;
    private int durationInMinutes;
    private boolean packedIncluded;
    private double ratingSum;
    private int totalRatings;

    public String getName() {
        return name;
    }

    public int getDateReleased() {
        return dateReleased;
    }

    public int getDurationInMinutes() {
        return durationInMinutes;
    }

    public boolean isPackedIncluded() {
        return packedIncluded;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDateReleased(int dateReleased) {
        this.dateReleased = dateReleased;
    }

    public void setDurationInMinutes(int durationInMinutes) {
        this.durationInMinutes = durationInMinutes;
    }

    public void setPackedIncluded(boolean packedIncluded) {
        this.packedIncluded = packedIncluded;
    }

    public int getTotalRatings(){
        return totalRatings;
    }

    public void showTecnicalFeatures(){
        System.out.println("Nombre: " + name);
        System.out.println("Fecha de lanzamiento: " + dateReleased);
        System.out.println("Duración en minutos: " + getDurationInMinutes());
        System.out.println("Incluido en paquete: " + (packedIncluded ? "Si " : "No"));
    }

    public void evaluate(double grade){
        ratingSum += grade;
        totalRatings++;

    }
    public double calculateAverageRating(){
        return totalRatings > 0 ? ratingSum / totalRatings : 0 ;
    }
}
