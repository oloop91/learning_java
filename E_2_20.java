/*

author : oloop

*/

public class E_2_20
{

    public static int[] create_deck()
    {
        int[] deck = new int[52];
        for ( int i = 0; i < 52;  i++)
        {
            deck[i] = i;
        }
        return deck;
    }

    public static void shuffle(int[] deck)
    {
        int n = deck.length;
        for (int i = 0; i < n; i++)
        {
            int r = i + (int) (Math.random() * (n-i));
            int temp = deck[i];
            deck[i] = deck[r];
            deck[r] = temp;
        }
    }

    public static String card_name(int i)
    {
        String[] SUITS = { "Clubs", "Diamonds", "Hearts", "Spades" };
        String[] RANKS =
        {
            "2", "3", "4", "5", "6", "7", "8", "9", "10",
            "Jack", "Queen", "King", "Ace"
        };

        return RANKS[i%13] + " of " + SUITS[i/13];

    }

    public static void print_hand(int[] deck, int k)
    {
        for (int i = 0; i < 5; i++)
        {
            StdOut.println(card_name(deck[k*5+i]));
        }
        StdOut.println();
    }

    public static void main(String[] args)
    {
        int n = Integer.parseInt(args[0]);

        int[] deck = create_deck();

        shuffle(deck);

        for ( int i = 0; i < n; i++)
        {
            print_hand(deck, i);
        }

    }





    

                

           

            




}