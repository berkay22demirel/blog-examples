package com.berkay22demirel.graphqlexample.repository;

import com.berkay22demirel.graphqlexample.entity.Match;
import com.berkay22demirel.graphqlexample.entity.Player;
import com.berkay22demirel.graphqlexample.entity.Score;
import com.berkay22demirel.graphqlexample.entity.Team;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class MatchRepository {

    private static final Map<Long, Match> matchDb;

    static {
        matchDb = new HashMap<>();

        Player player1 = new Player("Cenk Tosun", 27, 188, 75);
        Player player2 = new Player("Quaresma", 31, 177, 70);
        Player player3 = new Player("Muslera", 29, 190, 75);
        Player player4 = new Player("Falcao", 33, 185, 73);
        Player player5 = new Player("Altay", 22, 192, 77);
        Player player6 = new Player("Mesut Özil", 30, 175, 70);

        Team team1 = new Team("Beşiktaş", "Turkey", Arrays.asList(player1, player2));
        Team team2 = new Team("Galatasaray", "Turkey", Arrays.asList(player3, player4));
        Team team3 = new Team("Fenerbahçe", "Turkey", Arrays.asList(player5, player6));

        Match match1 = new Match(team1, team2, new Score(1, 0), new Date(), "Super Lig");
        Match match2 = new Match(team1, team3, new Score(3, 1), new Date(), "Super Lig");
        Match match3 = new Match(team2, team3, new Score(0, 0), new Date(), "Super Lig");

        matchDb.put(1L, match1);
        matchDb.put(2L, match2);
        matchDb.put(3L, match3);
    }

    public List<Match> findAll() {
        return new ArrayList<>(matchDb.values());
    }

    public Match findById(Long id) {
        return matchDb.get(id);
    }

    public Match save(Match match) {
        matchDb.put((long) matchDb.size() + 1, match);
        return match;
    }
}
