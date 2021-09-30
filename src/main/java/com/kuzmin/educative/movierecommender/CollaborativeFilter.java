package com.kuzmin.educative.movierecommender;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;

import javax.inject.Named;

//@Component
@Named
@Primary
@Qualifier("CF")
@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
public class CollaborativeFilter implements Filter {
    public String[] getRecommendations(String movie) {
        //logic of collaborative filter
        return new String[] {"Finding Nemo", "Ice Age", "Toy Story"};
    }
}
