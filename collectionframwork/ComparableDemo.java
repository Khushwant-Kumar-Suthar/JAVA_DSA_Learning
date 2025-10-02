package JAVA_DSA_Learning.collectionframwork;
import java.util.*;
@SuppressWarnings("ALL")
class Point implements Comparable{
    int x;
    int y;
    public Point(int x,int y){
        this.x =x;
        this.y = y;
    }

    public String toString(){
        return "x+="+x+" y+="+y;
    }
    public int compareTo(Object obj){
        Point p = (Point)obj;
        if(this.x<p.x) return -1;
        else if(this.x>p.x) return 1;
        else {

            return Integer.compare(this.y, p.y);
        }
    }
}
public class ComparableDemo {
    public static void main(String[] args){
          TreeSet<Point> ts = new TreeSet<>();

        ts.add(new Point(1,1));
        ts.add(new Point(2,4));
        ts.add(new Point(2,3));
        System.out.println(ts);

    }
}
