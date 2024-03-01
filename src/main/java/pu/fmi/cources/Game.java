package pu.fmi.cources;

import lombok.Data;

import java.util.UUID;

@Data
public class Game {

    private UUID gameId;

    private Player[][] board;

    private Player turn;

    public Game(){
        gameId = UUID.randomUUID();
        turn = Player.RED;
        board = new Player[6][7];
    }


}
