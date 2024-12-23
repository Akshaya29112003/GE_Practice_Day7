package Object_Oriented_Programs;

import java.util.Random;
import java.util.*;

public class DeckOfCards {
    public static String suit[] = {"Clubs", "Diamonds", "Hearts", "Spades"};
    public static String rank[] = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
    public static String cards[] = new String[suit.length * rank.length];

    public void cards_Distribution() {
        int in = 0;
        for (int i = 0; i < suit.length; i++) {
            for (int j = 0; j < rank.length; j++) {
                cards[in] = rank[j] + " of " + suit[i];
                in++;
            }
        }

        Random rand = new Random();
        for (int i = 0; i < cards.length; i++) {
            int rand_index = rand.nextInt(cards.length);
            String temp = cards[i];
            cards[i] = cards[rand_index];
            cards[rand_index] = temp;
        }

        String[][] players = new String[4][9];
        int index = 0;
        for (int i = 0; i < 4; i++) {
            System.out.println("Cards Distributed To Player : " + (i + 1));
            for (int j = 0; j < 9; j++) {
                players[i][j] = cards[index];
                System.out.println(" " + players[i][j] + " ");
                index++;
            }
            System.out.println();
        }
        
        System.out.println("After Sorting :");
        int index1 = 0;
        for (int i = 0; i < 4; i++) {
            System.out.println("Cards Distributed To Player : " + (i + 1));
            for (int j = 0; j < 9; j++) {
                players[i][j] = cards[index1];
                index1++;
            }

            sortCardsByRank(players[i]);

            for(String card : players[i]){
                System.out.println(" " + card);
            }
            System.out.println();
        }
    }

        public static void sortCardsByRank(String[] playerCards) {
            Arrays.sort(playerCards, (card1, card2) -> {
                int rank1 = java.util.Arrays.asList(rank).indexOf(card1.split(" ")[0]);
                int rank2 = java.util.Arrays.asList(rank).indexOf(card2.split(" ")[0]);
                return Integer.compare(rank1, rank2);
            });
        }
        

    public static void main(String args[]){
        DeckOfCards ans = new DeckOfCards();
        ans.cards_Distribution();
    }
}


