package Entities;

public class Game {
    int id;
    String gameName;
    int gamePrice;


    public Game(){

    }

    public Game(int id, String gameName, int gamePrice) {
        this.id = id;
        this.gameName = gameName;
        this.gamePrice = gamePrice;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGameName() {
        return gameName;
    }

    public void setGameName(String gameName) {
        this.gameName = gameName;
    }

    public int getGamePrice() {
        return gamePrice;
    }

    public void setGamePrice(int gamePrice) {
        this.gamePrice = gamePrice;
    }






}