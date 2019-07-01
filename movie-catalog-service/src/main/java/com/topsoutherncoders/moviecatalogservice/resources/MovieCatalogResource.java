package com.topsoutherncoders.moviecatalogservice.resources;

import com.sun.org.apache.xml.internal.resolver.Catalog;
import com.topsoutherncoders.moviecatalogservice.models.CatalogItem;
import com.topsoutherncoders.moviecatalogservice.models.Rating;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/catalog")
public class MovieCatalogResource {

    @RequestMapping("/{userID}")
    public List<CatalogItem> getCatalog(@PathVariable("userID") String userID) {

        List<Rating> ratings = Arrays.asList(
                new Rating("1234",4),
                new Rating("1235",3),
                new Rating("1236",5)
        );

        return ratings.stream().map(rating -> new CatalogItem("Avengers","Action",4));
            .collect(Collectors.toList());
        //get all rated movie IDs
        //for each movie ID, call movie info service and get details
        //put them all together

    }
}
