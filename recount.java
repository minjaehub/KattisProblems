import java.util.Scanner;
import java.util.HashMap;
import java.util.*;
import java.util.Map.*;

public class recount {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        HashMap<String, Integer> hm = new HashMap<>();
        // int count = 0;
        String mostVoted = "";

        while (true) {
            String a = scan.nextLine();

            if (a.equals("***")) { // (a == "***") -> why doesn't it work?
                break;
            }

            hm.put(a, hm.getOrDefault(a, 0) + 1);
        }

        // find the max value. then check how many max values there are. if there's one,
        // print key if not, print run off
        int maxValueInhm = (Collections.max(hm.values())); // This will return max value in the HashMap
        int count = 0;

        for (Entry<String, Integer> entry : hm.entrySet()) { // Iterate through HashMap
            if (entry.getValue() == maxValueInhm) {
                mostVoted = entry.getKey();
                count++;
            }
        }
        if (count > 1) {
            System.out.println("Runoff!");

        } else {
            System.out.println(mostVoted);
        }
    }
}
