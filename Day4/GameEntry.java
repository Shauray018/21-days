public class GameEntry {
    private String name;
    private int score; 

    public GameEntry(int s, String n) { 
        score = s; 
        name = n;
    }

    public String getName() { return name;} 

    public int getScore() {return score;}

    public String toString() { 
        return "(" + name + ", " + score + ")";
    }
}