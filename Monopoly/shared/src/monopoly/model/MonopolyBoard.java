package monopoly.model;

import java.awt.Color;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


public class MonopolyBoard implements Serializable {
    private static final long serialVersionUID = 1L;

    private final List<BoardSpace> board = new ArrayList<>(40);

    public MonopolyBoard() {

        board.add(new Go());
        board.add(new Property("Mediterranean Avenue", 60, new Color(139, 69, 19)));
        board.add(new CommunityChest());
        board.add(new Property("Baltic Avenue", 60, new Color(139, 69, 19)));
        board.add(new Tax("Income Tax", 200));


        board.add(new Railroad("Reading Railroad"));
        board.add(new Property("Oriental Avenue", 100, new Color(173, 216, 230)));
        board.add(new Chance());
        board.add(new Property("Vermont Avenue", 100, new Color(173, 216, 230)));
        board.add(new Property("Connecticut Avenue", 120, new Color(173, 216, 230)));


        board.add(new Jail());
        board.add(new Property("St. Charles Place", 140, Color.MAGENTA));
        board.add(new Utility("Electric Company"));
        board.add(new Property("States Avenue", 140, Color.MAGENTA));
        board.add(new Property("Virginia Avenue", 160, Color.MAGENTA));

        board.add(new Railroad("Pennsylvania Railroad"));
        board.add(new Property("St. James Place", 180, Color.ORANGE));
        board.add(new CommunityChest());
        board.add(new Property("Tennessee Avenue", 180, Color.ORANGE));
        board.add(new Property("New York Avenue", 200, Color.ORANGE));

        board.add(new FreeParking());
        board.add(new Property("Kentucky Avenue", 220, Color.RED));
        board.add(new Chance());
        board.add(new Property("Indiana Avenue", 220, Color.RED));
        board.add(new Property("Illinois Avenue", 240, Color.RED));


        board.add(new Railroad("B&O Railroad"));
        board.add(new Property("Atlantic Avenue", 260, Color.YELLOW));
        board.add(new Property("Ventnor Avenue", 260, Color.YELLOW));
        board.add(new Utility("Water Works"));
        board.add(new Property("Marvin Gardens", 280, Color.YELLOW));

        board.add(new GoToJail());
        board.add(new Property("Pacific Avenue", 300, Color.GREEN));
        board.add(new Property("North Carolina Avenue", 300, Color.GREEN));
        board.add(new CommunityChest());
        board.add(new Property("Pennsylvania Avenue", 320, Color.GREEN));


        board.add(new Railroad("Short Line"));
        board.add(new Chance());
        board.add(new Property("Park Place", 350, Color.BLUE));
        board.add(new Tax("Luxury Tax", 100));
        board.add(new Property("Boardwalk", 400, Color.BLUE));
    }


    public List<BoardSpace> getBoard() {
        return board;
    }
}
