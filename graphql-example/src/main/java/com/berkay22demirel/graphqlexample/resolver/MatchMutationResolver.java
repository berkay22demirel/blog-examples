package com.berkay22demirel.graphqlexample.resolver;

import com.berkay22demirel.graphqlexample.entity.Match;
import com.berkay22demirel.graphqlexample.repository.MatchRepository;
import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class MatchMutationResolver implements GraphQLMutationResolver {

    private final MatchRepository matchRepository;

    public Match create(Match match) {
        return matchRepository.save(match);
    }
}
