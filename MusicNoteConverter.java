/*

author : oloop

*/

public class MusicNoteConverter
{
    public static void main(String[] args)
    { 
        while(!StdIn.isEmpty())
        {
            String n = StdIn.readString();
            // StdOut.println(n.length());

            if      ( n.equals("A") ) StdOut.println("0 0.5 ");
            else if ( n.equals("A#")) StdOut.println("1 0.5 ");
            else if ( n.equals("B") )StdOut.println("2 0.5 ");
            else if ( n.equals("C") )StdOut.println("3 0.5 ");
            else if ( n.equals("C#"))StdOut.println("4 0.5 ");
            else if ( n.equals("D") )StdOut.println("5 0.5 ");
            else if ( n.equals("D#"))StdOut.println("6 0.5 ");
            else if ( n.equals("E") )StdOut.println("7 0.5 ");
            else if ( n.equals("F") )StdOut.println("8 0.5 ");
            else if ( n.equals("F#"))StdOut.println("9 0.5 ");
            else if ( n.equals("G") )StdOut.println("10 0.5 ");
            else if ( n.equals("G#"))StdOut.println("11 0.5 ");
            else if ( n.equals("="))StdOut.println("12 0.25 ");
            
        }
    }
}