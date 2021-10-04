public class Main {

    public static void main(String[] args) {

        Deck deck = new Deck();



        //System.out.println(deck.lickNextcCard());



        Card c1 = deck.lickNextcCard();

        Card c2 = deck.lickNextcCard();


        //c1.getR()+c2.getR();

       //int x =(int) c1.getR().getRank()+c2.getR().getRank();

        System.out.println(c1.getR());
        System.out.println(c1.getR().getRank());

        System.out.println(c2.getR());
        System.out.println(c2.getR().getRank());

        System.out.println(c1.getR().getRank()+c2.getR().getRank());

    }

}
