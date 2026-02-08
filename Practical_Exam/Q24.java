class Temperature implements Runnable {
    public void run() {
        System.out.println("Fetching Temperature...");
        int temp = 30; 
        System.out.println("Temperature: " + temp + "°C");
    }
}

class Humidity implements Runnable {
    public void run() {
        System.out.println("Fetching Humidity...");
        int humidity = 65; 
        System.out.println("Humidity: " + humidity + "%");
    }
}

class WeatherReport implements Runnable {
    public void run() {
        System.out.println("Displaying Combined Weather Report...");
        int temp = 30;
        int humidity = 65;
        System.out.println("Weather Report: " + temp + "°C and " + humidity + "% Humidity");
    }
}

public class Q24 {
    public static void main(String[] args) {
   
        Temperature t = new Temperature();
        Humidity h = new Humidity();
        WeatherReport w = new WeatherReport();

        Thread tempThread = new Thread(t);
        Thread humThread = new Thread(h);
        Thread reportThread = new Thread(w);

        tempThread.start();
        humThread.start();
        reportThread.start();
    }
}