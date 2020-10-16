/*

author : oloop

excercise : 3.2.6

*/

public class Location
{
    private final double latitude;
    private final double longitude;

    public Location(double lat, double longi)
    {
        latitude = lat;
        longitude = longi;
    }

    public double distanceTo(Location l)
    {
        double x1 = Math.sin(Math.toRadians(  latitude));
        double x2 = Math.sin(Math.toRadians(l.latitude));
        double y1 = Math.cos(Math.toRadians(  latitude));
        double y2 = Math.cos(Math.toRadians(l.latitude));
        double yy = Math.cos(Math.toRadians(longitude - l.longitude));
        double d = 60 * Math.toDegrees(Math.acos( x1*x2 + y1*y2 * yy));
        return d;
    }

    public static void main(String[] args)
    {
        double lt1 = Double.parseDouble(args[0]);
        double lg1 = Double.parseDouble(args[1]);
        double lt2 = Double.parseDouble(args[2]);
        double lg2 = Double.parseDouble(args[3]);
        Location l1 = new Location(lt1, lg1);
        Location l2 = new Location(lt2, lg2);
        StdOut.println(l1.distanceTo(l2));
    }
}