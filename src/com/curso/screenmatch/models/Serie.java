package com.curso.screenmatch.models;

public class Serie extends Title{
    private int seasons;
    private int episodesPerSeason;
    private int minutesPerEpisode;

    @Override
    public int getDurationInMinutes(){
        return seasons * episodesPerSeason * minutesPerEpisode;
    }
    public int getSeasons() {
        return seasons;
    }

    public void setSeasons(int seasons) {
        this.seasons = seasons;
    }

    public int getEpisodesPerSeason() {
        return episodesPerSeason;
    }

    public void setEpisodesPerSeason(int episodesPerSeason) {
        this.episodesPerSeason = episodesPerSeason;
    }

    public int getMinutesPerEpisode() {
        return minutesPerEpisode;
    }

    public void setMinutesPerEpisode(int minutesPerEpisode) {
        this.minutesPerEpisode = minutesPerEpisode;
    }
    @Override
    public void showTecnicalFeatures(){
        super.showTecnicalFeatures();
        System.out.println("Temporadas: " + seasons);
        System.out.println("Episodios por temporada: " + episodesPerSeason);
        System.out.println("Minutos por Episodio: " + minutesPerEpisode);
    }
}
