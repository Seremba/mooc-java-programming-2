
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author seremba
 */
public class Hand {

    private List<Card> cards;

    public Hand() {
        this.cards = new ArrayList<>();
    }

    public void add(Card card) {
        this.cards.add(card);
    }

    public void print() {
        for (Card card : this.cards) {
            System.out.println(card);
        }
    }
}
