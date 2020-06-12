import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Mark {
    static List<Info> data = new LinkedList<>();

    public static void main(String[] args) throws FileNotFoundException {
        readInfo();
        for(var x : data){
            System.out.print(x.getX() + ", ");
        }
        System.out.println("\n");
        for(var x : data){
            System.out.print(x.getY() + ", ");
        }
        System.out.println("\n");
        for(var x : data){
            System.out.print((x.isD()?"1":"0") + ", ");
        }

    }

    public static void readInfo() throws FileNotFoundException {
        Scanner scanner = new Scanner(new FileReader("resources/Data.csv"));
        for (int i = 0; i < 65; ++i) {
            String s = scanner.nextLine();
            String[] str = s.split("\t");
            Integer[] integers = new Integer[3];
            for(int j =0; j < 3; ++j){
                integers[j] = Integer.parseInt(str[j]);
            }
            data.add(new Info(integers[0], integers[1] != 0, integers[2]));
        }
    }
}
