package com.topsoutherncoders.moviecatalogservice.resources;

import com.sun.org.apache.xml.internal.resolver.Catalog;
import com.topsoutherncoders.moviecatalogservice.models.CatalogItem;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/catalog")
public class MovieCatalogResource {

    @RequestMapping("/{userID}")
    public List<CatalogItem> getCatalog(@PathVariable("userID") String userID) {

        return Collections.singletonList(
                new CatalogItem("Avengers","Action",4)
        );
    }
}
