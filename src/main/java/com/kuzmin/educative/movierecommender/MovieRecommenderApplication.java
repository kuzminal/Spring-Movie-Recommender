package com.kuzmin.educative.movierecommender;

import com.kuzmin.educative.movierecommender.components.RecommenderImplementation;
import com.kuzmin.educative.movierecommender.services.FilteringTechnique1;
import com.kuzmin.educative.movierecommender.services.FilteringTechnique2;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class MovieRecommenderApplication implements CommandLineRunner {
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private FilteringTechnique1 filter1;

    @Autowired
    private FilteringTechnique2 filter2;

    public static void main(String[] args) {
        ApplicationContext appContext = SpringApplication.run(MovieRecommenderApplication.class, args);

        RecommenderImplementation recommender = appContext.getBean(RecommenderImplementation.class);

        System.out.println(recommender);
        System.out.println(recommender.getFilter());
    }

    @Override
    public void run(String... args) {
        logger.info("{}",filter1.contentBasedFiltering());
        logger.info("{}",filter2.collaborativeFiltering());
    }
}
