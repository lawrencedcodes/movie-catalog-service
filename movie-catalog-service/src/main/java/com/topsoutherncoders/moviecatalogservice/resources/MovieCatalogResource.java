package com.topsoutherncoders.moviecatalogservice.resources;

import com.sun.org.apache.xml.internal.resolver.Catalog;
import com.topsoutherncoders.moviecatalogservice.models.CatalogItem;
import com.topsoutherncoders.moviecatalogservice.models.Movie;
import com.topsoutherncoders.moviecatalogservice.models.Rating;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/catalog")
public class MovieCatalogResource {

    @RequestMapping("/{userID}")
    public List<CatalogItem> getCatalog(@PathVariable("userID") String userID) {

        RestTemplate restTemplate = new RestTemplate();

        List<Rating> ratings = Arrays.asList(
                new Rating("1234",4),
                new Rating("1235",3),
                new Rating("1236",5)
        );

        return ratings.stream().map(rating -> {
            Movie movie = restTemplate.getForObject("http://localhost:8081/movies/"+rating.getMovieID(), Movie.class);
            return new CatalogItem(movie.getName(),"Action",rating.getRating())
        })
            .collect(Collectors.toList());
        //get all rated movie IDs
        //for each movie ID, call movie info service and get details
        //put them all together

    }

}
