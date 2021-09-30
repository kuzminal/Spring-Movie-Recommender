package com.kuzmin.educative.movierecommender.services;

import com.kuzmin.educative.movierecommender.aop.MeasureTime;
import com.kuzmin.educative.movierecommender.repository.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FilteringTechnique1 {
    @Autowired
    private Movie movie;

    @MeasureTime
    public String contentBasedFiltering() {
        return movie.getMovieDetails();
    }
}
