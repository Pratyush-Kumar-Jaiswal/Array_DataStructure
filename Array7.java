import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

class GameEntry implements Comparable{
    String name;
    int score;

    public GameEntry(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "("+score + ", "+ name+ ")";
    }

    @Override
    public int compareTo(Object o) {
        GameEntry obj=(GameEntry) o;
        int comparescore=obj.getScore();
        return this.score-comparescore;
    }
}
public class Array7 {
    public static void main(String[] args) {
        ArrayList<GameEntry> arr=new ArrayList<>();
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the no of players playing");
        int n=sc.nextInt();
        for (int i = 0; i < n; i++) {
            String name;
            int score;
            System.out.println("Enter the name");
            name=sc.nextLine();
            System.out.println("Enter the score");
            score=sc.nextInt();
            sc.nextLine();
            arr.add(new GameEntry(name,score));
        }

        Collections.sort(arr);
        for (GameEntry g:
             arr) {
            System.out.println(g);
        }
    }
}
