package pu.fmi.cources;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class GameServiceImpl implements GameService{

    private Logger LOG = LoggerFactory.getLogger(GameServiceImpl.class);

    private GameRepoInMemory gameRepo;

    public GameServiceImpl(GameRepoInMemory gameRepo) {
        this.gameRepo = gameRepo;
    }



    @Override
    public Game startNewGame() {

        var game = new Game();

        gameRepo.save(game);

        return game;
    }

    @Override
    public void makeMove(Move move) {

    }

    @Override
    public Game getGame(UUID gameId) {
        return null;
    }
}
