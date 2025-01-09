
public class Bowler {

    String name;
    int wickets;
    int matches;
    int balls_bowled;
    int runs_conceded;

    public Bowler() {
        this.name = "Unknown";
        this.wickets = 0;
        this.matches = 0;
        this.balls_bowled = 0;
        this.runs_conceded = 0;
    }

    public Bowler(String name, int wickets, int matches, int balls_bowled, int runs_conceded) {
        this.name = name;
        this.wickets = wickets;
        this.matches = matches;
        this.balls_bowled = balls_bowled;
        this.runs_conceded = runs_conceded;
    }

    public void computeBowlingAverage() {
        if (isInvalidInput()) {
            return;
        }
        if (wickets == 0) {
            System.out.println("Error: Division by zero");
            return;
        }
        double bowling_avg = (double) runs_conceded / wickets;
        System.out.println("Name: " + name);
        System.out.println("bowling_avg=" + bowling_avg);
    }

    public void showStatistics() {
        if (isInvalidInput()) {
            return;
        }
        System.out.println("Name=" + name);
        System.out.println("wickets=" + wickets);
        System.out.println("matches=" + matches);
        System.out.println("balls_bowled=" + balls_bowled);
        System.out.println("runs_conceded=" + runs_conceded);
    }

    // Method to compute strike rate
    public void computeStrikeRate() {
        if (isInvalidInput()) {
            return;
        }
        if (balls_bowled == 0) {
            System.out.println("Error: Division by zero");
            return;
        }
        double strike_rate = (double) runs_conceded / balls_bowled;
        System.out.println("Name: " + name);
        System.out.println("Strike_rate=" + strike_rate);
    }

    // Method to validate input
    private boolean isInvalidInput() {
        if (wickets < 0 || matches < 0 || balls_bowled < 0 || runs_conceded < 0) {
            System.out.println("Error: Negative values are not allowed");
            return true;
        }
        if (matches == 0 && (runs_conceded > 0 || balls_bowled > 0)) {
            System.out.println("Error: runs_conceded or balls_bowled should be 0 when matches are 0");
            return true;
        }
        return false;
    }

    // Main method for testing
    public static void main(String[] args) {
        Bowler bowler = new Bowler("Sachin", 10, 5, 750, 463);
        bowler.showStatistics();
        bowler.computeBowlingAverage();
        bowler.computeStrikeRate();
    }
}
