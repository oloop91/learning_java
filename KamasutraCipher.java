/*

author : oloop

*/

public class KamasutraCipher
{
    
    public static String encode(String s, String key1, String key2)
    {
        if (key1.contains(s))
        {
            int i = key1.indexOf(s);
            return key2.substring(i, i+1);
        }
        else
        {
            int i = key2.indexOf(s);
            return key1.substring(i,i+1);
        }
    }

    public static String encode_word(String s, String key1, String key2)
    {
        String encoded = "";
        for ( int i = 0; i < s.length(); i++)
        {
            encoded = encoded + encode(s.substring(i,i+1),key1,key2);
        }
        return encoded;
    }

    public static void main(String[] args)
    {
        String key1 = args[0];
        String key2 = args[1];
        String[] code = StdIn.readAllStrings();
        for ( int i = 0; i < code.length; i++)
        {
            StdOut.print(encode_word(code[i], key1, key2) + " ");
        }
        StdOut.println();

    }
}