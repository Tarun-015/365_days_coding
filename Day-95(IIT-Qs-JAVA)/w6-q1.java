// Given as input a set of four objects of class CricketPlayer complete the Java code to segregate the players represented by these objects into batsmen and bowlers.
// Create an ArrayList object to store the four objects of CricketPlayer. Segregate them as batsmen and bowlers based on the following criteria: 
// A player is termed as a batsman if his/her average runs per match are greater than 25.
// A player is termed as a bowler if his/her average wickets per match are greater than 1.
// Create ArrayList bt to store the batsmen and ArrayList bw to store the bowlers. Observe that the same player could belong to both the lists. 
// Print the list of bowlers in a line, followed by the list of batsmen in the next line, using the displayPlayers(ArrayList<CricketPlayer> bw, ArrayList<CricketPlayer> bt) method.

import java.util.*;
class CricketPlayer{
  private String name;
  private int wickets;
  private int runs;
  private int matches;
  public CricketPlayer(String s, int w, int r, int m){
    this.name = s;
    this.wickets = w;
    this.runs = r;
    this.matches = m;
  }
  public String getName(){
    return name;
  }
  public int getWickets(){
    return wickets;
  }
  public int getRuns(){
    return runs;
  }
  public double avgRuns(){
    return runs/matches;
  }
  public double avgWickets(){
    return wickets/matches;
  }
} 
public class Main {
// Define displayPlayers() method here
     public static void displayPlayers(ArrayList<CricketPlayer> bw, ArrayList<CricketPlayer> bt) {
        // Print bowlers
        for (CricketPlayer p : bw) {
            System.out.print(p.getName() + " ");
        }
        System.out.println();
        // Print batsmen
        for (CricketPlayer p : bt) {
            System.out.print(p.getName() + " ");
        }
        System.out.println();
    }

 public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    CricketPlayer p1 = new CricketPlayer(sc.next(), sc.nextInt(), 
                                sc.nextInt(), sc.nextInt());
    CricketPlayer p2 = new CricketPlayer(sc.next(), sc.nextInt(), 
                                sc.nextInt(), sc.nextInt());
    CricketPlayer p3 = new CricketPlayer(sc.next(), sc.nextInt(), 
                                sc.nextInt(), sc.nextInt());
    CricketPlayer p4 = new CricketPlayer(sc.next(), sc.nextInt(), 
                                sc.nextInt(), sc.nextInt());

    // Define ArrayList objects here
     ArrayList<CricketPlayer> players = new ArrayList<>();
        players.add(p1);
        players.add(p2);
        players.add(p3);
        players.add(p4);

        ArrayList<CricketPlayer> bt = new ArrayList<>(); // batsmen
        ArrayList<CricketPlayer> bw = new ArrayList<>(); // bowlers

        for (CricketPlayer p : players) {
            if (p.avgRuns() > 25) {
                bt.add(p);
            }
            if (p.avgWickets() > 1) {
                bw.add(p);
            }
        }


 displayPlayers(bw, bt);
  }
}  