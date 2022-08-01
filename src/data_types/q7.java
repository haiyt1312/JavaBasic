package data_types;

public class q7 {
    public static void main(String[] args) {
        double hour = 5,minutes = 56, seconds = 23, meters = 2500;
        System.out.println("Your speed in meters/second is " + meters / ( hour * 3600 + minutes * 60 + seconds));
        System.out.println("Your speed in km/h is " + ( meters / 1000 ) / ( hour + minutes / 60 + seconds / 3600));
        System.out.println("Your speed in miles/h is "+ (meters / 1609) / (hour + minutes / 60 + seconds / 3600));
    }
}
