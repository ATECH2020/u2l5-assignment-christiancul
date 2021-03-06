import java.util.Scanner;

public class HowFarAway 
{
    public static void main(String[] args)
    {
        Scanner userIn = new Scanner(System.in);
        double startLat, startLong, endLat, endLong;
        startLat = startLong = endLat = endLong = 0;

        //prompt user
        System.out.print("Enter the latitude of the starting location: ");
        startLat = userIn.nextDouble();

        System.out.print("Enter the longitude of the starting location: ");
        startLong = userIn.nextDouble();

        System.out.print("Enter the latitude of the ending location: ");
        endLat = userIn.nextDouble();

        System.out.print("Enter the longitude of the ending location: ");
        endLong = userIn.nextDouble();
        
        //create GeoLocation objects
        GeoLocation startLocation = new GeoLocation(startLat, startLong);
        GeoLocation endLocation = new GeoLocation(endLat, endLong);

        //display distance from the two locations
        System.out.print("The distance is " + startLocation.distanceFrom(endLocation) + " miles.");

        userIn.close();
    }
}