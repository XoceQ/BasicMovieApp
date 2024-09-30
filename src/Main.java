import com.curso.screenmatch.models.Episode;
import com.curso.screenmatch.models.Movie;
import com.curso.screenmatch.models.Serie;
import com.cursos.screenmatch.calculations.SuggestFilter;
import com.cursos.screenmatch.calculations.TimeCalculator;

public class Main {
    public static void main(String[] args) {

        //crear y mostrar los datos de mi película

        Movie myMovie = new Movie();
        myMovie.setName("Encanto");
        myMovie.setDateReleased(2021);
        myMovie.setDurationInMinutes(120);
        myMovie.setPackedIncluded(true);
        myMovie.setDirector("Jared Bush");
        System.out.println("Detalles de la Película: ");
        myMovie.showTecnicalFeatures();
        myMovie.evaluate(7.8);
        myMovie.evaluate(5);
        myMovie.evaluate(6);

        System.out.println("Total de calificaciones: " + myMovie.getTotalRatings());
        System.out.println("Calificación promedio: " + myMovie.calculateAverageRating());

        //crear y mostrar los datos de mi serie
        Serie casaDragon = new Serie();
        casaDragon.setName("La casa del dragón");
        casaDragon.setDateReleased(2022);
        casaDragon.setSeasons(1);
        casaDragon.setMinutesPerEpisode(50);
        casaDragon.setEpisodesPerSeason(10);
        System.out.println("\n Detalles de la serie: ");
        casaDragon.showTecnicalFeatures();
        System.out.println( "Duración Total en Minutos: " + casaDragon.getDurationInMinutes());

        // Usar TimeCalculator para calcular el tiempo total
        TimeCalculator calculator = new TimeCalculator();
        calculator.include(myMovie);
        calculator.include(casaDragon);

        System.out.println("\nTiempo total de películas y series: " + calculator.getTotalTime() + " minutos");

        SuggestFilter  suggestFilter = new SuggestFilter();
        suggestFilter.filtering(myMovie);

        Episode episode = new Episode();
        episode.setNumber(1);
        episode.setName("La casa Targaryen");
        episode.setSerie(casaDragon);
        episode.setTotalViews(50);

        suggestFilter.filtering(episode);

    }
}