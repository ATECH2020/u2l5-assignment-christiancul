import java.util.Scanner;

public class HowFarAway 
{
    public static void main(String[] args)
    {
        Scanner userIn = new Scanner(System.in);
        double startLat, startLong, endLat, endLong;
        startLat = startLong = endLat = endLong = 0;

        System.out.print("Enter the latitude of the starting location: ");
        startLat = userIn.nextFloat();

        System.out.print("Enter the longitude of the starting location: ");
        startLong = userIn.nextFloat();

        System.out.print("Enter the latitude of the ending location: ");
        endLat = userIn.nextFloat();

        System.out.print("Enter the longitude of the ending location: ");
        endLong = userIn.nextFloat();
        
        GeoLocation startLocation = new GeoLocation(startLat, startLong);
        GeoLocation endLocation = new GeoLocation(endLat, endLong);

        //System.out.printf("The distance is %f miles.", startLocation.distanceFrom(endLocation));
        System.out.print("The distance is " + startLocation.distanceFrom(endLocation) + " miles.");

        userIn.close();
    }
}