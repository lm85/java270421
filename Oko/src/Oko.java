import java.util.ArrayList;

public class Oko {
    private ArrayList<Player> players = new ArrayList<>();
    Player winner;
    Deck deck;


    public Oko(int numPlayes) {

        this.deck = new Deck();

        for(int i=0;i<numPlayes;i++)
            this.players.add(new Player("Hráč"+String.valueOf(i),this.deck );

    }

    public ArrayList<Player> getPackOfCards() {
        return players;
    }


    public void spustit() {
        //TODO: rozdání prvních karet
        do {
            if (this.round()) {
                System.out.println("Vítězem je: "+winner.getName());
                break;
            }


        } while (this.getPackOfCards().size()>0);


    }

    private boolean round() {
        System.out.println("Další kolo");

        for (Player player:this.players) {

            System.out.println("Hraje hráč: "+player.getName());


            player.lickNextcCard();

            if (this.kralovskeOko(player.getPackOfCards())) {

                this.winner=player;
                return true;

            }
            else if (this.maOko(player.getPackOfCards())) {
                this.winner=player;
                return true;
            }else if (otherOver21(player)){
                this.winner=player;
                return false;
            }




        }
        if (this.equalSumCards()) this.winner=this.minSumCardsPlayer();
        
        System.out.println("-----");
        return false;
    }

    private boolean kralovskeOko(ArrayList<Card> deck) {

        if (deck.size()>2) return false;

        if ((deck.get(0).getR().getRank()+deck.get(1).getR().getRank())==22) return true;

        return false;
    }

    private boolean maOko(ArrayList<Card> deck) {

       /*if (deck.size()>2) return false;

        if ((deck.get(0).getR().getRank()+deck.get(1).getR().getRank())==22) return true;
*/
        return false;
    }

    private boolean otherOver21(Player curPlayer) {
    int sumOver=0;
        for (Player player:this.players) {

            if (player!=curPlayer)
                if (player.getSumCards()>21)
                    sumOver++;



        }
        return (this.players.size()-1)==sumOver;

    }

    private Player minSumCardsPlayer() {
        int min=this.players.get(0).getSumCards();

        Player minPlayer = this.players.get(0);

        for (Player player:this.players) {

            if(player.getSumCards()<min)  {
                min=player.getSumCards();
                minPlayer = player;

            }



        }
        return minPlayer;
    }



    private boolean equalSumCards() {

        int sumCard=this.players.get(0).getSumCards();

        for (Player player:this.players) {

            if(sumCard != player.getSumCards()) return false;
            else sumCard = player.getSumCards();


        }
        return true;
}

}
