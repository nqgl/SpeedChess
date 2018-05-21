package cs48g02s18.chessServer;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.io.Serializable;

@JsonIgnoreProperties(ignoreUnknown = true)
public class DataPassCreateGame extends DataPass {
    private String gameName;

    public DataPassCreateGame(String username, String password, String newGameName) {
        super(username, password);
        gameName = newGameName;
    }

    public String getGameName() {
        return gameName;
    }

    @Override
    public String toString() {
        return "DataPassCreateGame{" + super.toString() +
                "gameName='" + gameName + '\'' +
                '}';
    }
}

