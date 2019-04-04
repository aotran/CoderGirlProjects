import static java.lang.System.out;

public class Temperatures {
    public static void main(String[] args) {

        // hardcoding the data
        int[][] temperatures = {
        {68, 70, 76, 70, 68, 71, 75},
        {76, 76, 87, 84, 82, 75, 83},
        {73, 72, 81, 78, 76, 73, 77},
        {64, 65, 69, 68, 70, 74, 72}
        };

        String[] daysOfWeek = {"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};
        String[] timesOfDay = {"7 AM", "3 PM", "7 PM", "3 AM"};

        out.println("Temperature Calculator");
        out.println("\n" + "The data provided are:");
        out.print("      ");
        for (int row = 0; row < daysOfWeek.length; row++) {
            out.print(daysOfWeek[row] + " ");
        }
        out.print("\n");
        for (int row = 0; row < temperatures.length; row++) {
            out.print(timesOfDay[row] + ":");
            for (int col = 0; col < temperatures[0].length; col++) {
                out.printf("%4d", temperatures[row][col]);
            }
            out.print("\n");
        }

        // calling methods for daily average
        out.println("\n" + "Based on that data, the following are the average temperatures for the week.");
        for (int day = 0; day < temperatures[0].length; day++) {
            out.println(daysOfWeek[day] + ": " + dailyAverage(temperatures, day));
        }

        // calling methods for time of day average
        out.print("\n");
        for (int timeOfDay = 0; timeOfDay <temperatures.length; timeOfDay++) {
            out.println(timesOfDay[timeOfDay] + ": " + timeOfDayAverage(temperatures, timeOfDay));
        }

        // calling method to get whole average
        out.println("\n" + "The final average temperature for the week was: " + twoDimenArrayAverage(temperatures));
    }
    // end of main method

    // navigating the data to get an average temp for a single day (one column)
    public static int dailyAverage(int[][] table, int day) {
        int sum = 0;
        for (int time = 0; time < table.length; time++) {
            sum += table[time][day];
        }
        return sum/table.length;
    }

    // navigating the data to get an average temp for a single time (one row)
    public static int timeOfDayAverage(int[][] table, int time) {
        int sum = 0;
        for (int day = 0; day < table[0].length; day++) {
            sum += table[time][day];
        }
        return sum/table[0].length;
    }

    // overall averaging a table
    public static int twoDimenArrayAverage(int[][] table) {
        int sum = 0;
        int count = 0;
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; j++) {
                sum += table[i][j];
                count++;
            }
        }
        return sum/count;
    }
}
