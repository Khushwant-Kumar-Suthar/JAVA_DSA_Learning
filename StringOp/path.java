package JAVA_DSA_Learning.StringOp;

import java.util.Scanner;

public class path {
    public static float getShortestPath(String path) {
        int x = 0, y = 0;
        for (int i = 0; i < path.length(); i++) {
            char dir = path.charAt(i);
            // north
            if (dir == 'N') {
                y++;
            }
            // south
            else if (dir == 'S') {
                y--;
            }
            // west
            else if (dir == 'W') {
                x--;
            }
            // East
            else {
                x++;
            }
        }
        int X2 = x*x;
        int Y2 = y*y;
        return (float)Math.sqrt(X2+Y2);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a direction string ");
        String str = in.nextLine();
        String str2 = str.toUpperCase();
        System.out.println("Shortest path is : "+getShortestPath(str2));
    }
}
