package com.berkay22demirel.graphqlexample.resolver;

import com.berkay22demirel.graphqlexample.entity.Match;
import com.berkay22demirel.graphqlexample.repository.MatchRepository;
import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@AllArgsConstructor
public class MatchQueryResolver implements GraphQLQueryResolver {

    private final MatchRepository matchRepository;

    public List<Match> getAll() {
        return matchRepository.findAll();
    }

    public Match getById(Long id) {
        return matchRepository.findById(id);
    }
}
