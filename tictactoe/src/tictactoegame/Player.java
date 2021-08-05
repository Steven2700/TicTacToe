/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoegame;

/**
 *
 * @author Steven Navarrete
 */
public class Player {

    private String name;
    private int wins;
    private int losses;
    private char mark;

    public Player() {
        name = "HUGH MUNGUS";
        wins = 0;
        losses = 0;

    }

    public Player(String newName) {
        setName(newName);
    }

    public Player(String newName, int newWins) {
        setName(newName);
        setWins(newWins);
    }

    public Player(String newName, int newWins, int newLosses) {
        setName(newName);
        setWins(newWins);
        setLosses(newLosses);

    }

    public Player(String newName, int newWins, int newLosses, char newMark) {
        setName(newName);
        setWins(newWins);
        setLosses(newLosses);
        setMark(newMark);
    }

    public void wins() {
        wins++;
    }

    public void losses() {
        losses++;
    }

    public void setName(String newName) {
        if (newName.length() > 0) {
            name = newName;
        }
    }

    public void setWins(int newWins) {
        wins = newWins;
    }

    public void setLosses(int newLosses) {
        losses = newLosses;
    }

    public void setMark(char newMark) {
        mark = newMark;
    }

    public String getName() {
        return name;
    }

    public int getWins() {
        return wins;
    }

    public int getLosses() {
        return losses;
    }

    public char getMark() {
        return mark;
    }

    public String toString() {
        String chain = (" name: " + getName() + "   wins: " + getWins() + "  losses: " + getLosses() + "  mark: " + getMark());
        return chain;
    }

}
