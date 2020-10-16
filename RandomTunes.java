/* 

author : oloop

*/


public class RandomTunes
{
    public static void main(String[] args)
    {
        // 1.5.36
        
        while (true)
        {
            int note = (int) (Math.random()*12);
            double time =  Math.random()*Math.random();
            StdOut.println(note + " " + time);  
        }  // played with playtune.java
    }
}