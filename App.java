import player.Player;
import dice.Dice;
import coordinates.Coordinates;
import jumper.Jumper;
import board.Board;
import game.Game;
import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
 HashMap<String, Jumper> map = new HashMap<>();
 map.put("6", new Jumper(new Coordinates(9,5),new Coordinates(6, 6)));
 map.put("97", new Jumper(new Coordinates(0, 1),new Coordinates(9, 9)));
 map.put("21", new Jumper(new Coordinates(7, 0),new Coordinates(0, 9)));
 map.put("64", new Jumper(new Coordinates(3, 3),new Coordinates(7, 4)));

        Player p1 = new Player();
        p1.setPlayerDetailsFromUserInput(p1);
        p1.getPlayersDetails();
        Player p2 = new Player();
        p2.setPlayerDetailsFromUserInput(p2);
        System.out.println("Player Name:"+ p1.getPlayerName());
        System.out.println("Player Name:"+ p2.getPlayerName()); 
       /*  Dice d = new Dice();
        System.out.println(d.diceRoll()); 
        Coordinates c = new Coordinates(9,4);
        Coordinates d = new Coordinates(6,3);

       System.out.println( c.printCoordinates());

       Jumper j = new Jumper(c,d);
       System.out.println(j.getJumperName()); */
       Board b = new Board(10, map);
       b.printBoard();
        Game game = new Game(b, new Player[]{p1,p2}, new Dice());
        game.play();
    }
}
 