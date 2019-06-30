package com.topsoutherncoders.ratingsdataservice.resources;

import com.topsoutherncoders.ratingsdataservice.models.Rating;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ratingsdata")
public class RatingsResource {

    @RequestMapping("/{movieID}")
    public Rating getRaing(@PathVariable("movieID") String movieID) {

        return new Rating(movieID, 4);
    }
}
