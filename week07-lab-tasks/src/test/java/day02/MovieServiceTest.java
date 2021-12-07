package day02;

import org.junit.jupiter.api.Test;

import java.nio.file.NoSuchFileException;
import java.nio.file.Path;

import static org.junit.jupiter.api.Assertions.*;

class MovieServiceTest {
    @Test
    void testFillListWithMovies(){
        MovieService movieService = new MovieService(Path.of("src/test/resources/movies.csv"));

        assertEquals(5,movieService.getMovies().size());
        assertEquals("Titanic",movieService.getMovies().get(1).getTitle());
    }

    @Test
    void testFillListWithMoviesFileNotFound(){
        IllegalStateException ise = assertThrows(IllegalStateException.class, ()-> new MovieService(Path.of("movies.csv")));
        assertEquals("Cannot read file", ise.getMessage());
        assertEquals(NoSuchFileException.class, ise.getCause().getClass());
    }
}