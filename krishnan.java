import java.time.LocalTime;

public class EODTask {
    public static void main(String[] args) {
        // Define EOD time (let's assume it's 5:00 PM)
        LocalTime eodTime = LocalTime.of(17, 0); // 5:00 PM

        // Get the current time
        LocalTime currentTime = LocalTime.now();

        // Check if it's EOD or not
        if (currentTime.isAfter(eodTime)) {
            System.out.println("It's past EOD! Please submit the task first thing tomorrow.");
        } else {
            System.out.println("You still have time! Current time is " + currentTime);
        }
    }
}
