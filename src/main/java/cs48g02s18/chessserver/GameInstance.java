package cs48g02s18.chessserver;

import cs48g02s18.chessgame.Board;
import cs48g02s18.chessgame.Piece;
import cs48g02s18.chessgame.Player;

public class GameInstance {
   private ServerPlayer hostServerPlayer; //future change to more generalized form (doesn't need to be host/guest
    private ServerPlayer guestServerPlayer;             //eg if we wanted to have a game queue
    private Player whitePlayer;
    private Player blackPlayer;
    private Board gameBoard;
    private Player gamePlayer;


    public GameInstance(ServerPlayer hostServerPlayer) {
        this.hostServerPlayer = hostServerPlayer;
    }

    public void addPlayer(ServerPlayer guestServerPlayer){
        if (this.guestServerPlayer == null){
            this.guestServerPlayer = guestServerPlayer;
            this.setUpBoard();
        }
    //todo
    }

    public void submitNextMove(ServerPlayer player, Move nextMove) {
        if (isValidMove(nextMove, player)) {
            player.setNextMove(nextMove);
        }
        else {
            System.out.print("an invalid move was submitted");
        }
        //todo make return string
    }

    private void setUpBoard(){
        this.gameBoard.setUp(whitePlayer, blackPlayer);
    }

    public void resolveTurn() {
        Move hostNextMove = hostServerPlayer.getNextMove();
        Move guestNextMove = guestServerPlayer.getNextMove();

        if (!isValidMove(hostNextMove, this.hostServerPlayer)){
            hostNextMove = null;
        }
        if (!isValidMove(guestNextMove, this.guestServerPlayer)){
            guestNextMove = null;
        }
        Piece hostPiece = gameBoard.getPiece(hostNextMove.getStartPosition().x, hostNextMove.getStartPosition().y);
        Piece guestPiece = gameBoard.getPiece(guestNextMove.getStartPosition().x, guestNextMove.getStartPosition().y);

        if(hostNextMove.getEndPosition() == guestNextMove.getEndPosition()) {
            //for if both pieces are going to the same location
            //todo set up in detail
            guestPiece.capture();
            //hostPiece.setPosition(hostNextMove.getEndPosition());
        }
        else {
           // hostPiece.setPosition(hostNextMove.getEndPosition());
            //guestPiece.setPosition(guestNextMove.getEndPosition());
        }

        hostServerPlayer.setNextMove(null);
        guestServerPlayer.setNextMove(null);
    }

    public Board getGameBoard() {
        return gameBoard;
    }

    public boolean isValidMove(Move move, ServerPlayer player){
        return true; //todo make actually check
    }
}
