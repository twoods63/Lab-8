import java.util.*;
public class Lab8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String time1 = "";
        boolean valid1 = true;

        String time2 = "";
        boolean valid2 = true;

        int h1 = 0, m1 = 0, s1 = 0;
        int h2 = 0, m2 = 0, s2 = 0;

        System.out.println("Enter time 1 in 24hr format as follows (HH:MM:SS)");
        time1 = sc.nextLine();
        if (Objects.equals(time1, "\n")) {
            System.out.println("Enter a valid time");
            valid1 = false;
        } else {
            String [] split = time1.split(":");
            if (split.length!=3) {
                System.out.println("Enter a valid time");
                valid1 = false;
            } else {
                h1 = Integer.parseInt(split[0]);
                m1 = Integer.parseInt(split[1]);
                s1 = Integer.parseInt(split[2]);

                if(h1 < 0 || h1 > 23) {
                    System.out.println("Hour must be below 24");
                    valid1 = false;
                }
                if (m1 < 0 || m1 > 59) {
                    System.out.println("Minutes must be less than 60");
                    valid1 = false;
                }
                if (s1 < 0 || s1 > 59) {
                    System.out.println("Seconds must be less 60");
                    valid1 = false;
                }
            }
        }

        if (valid1) {
            System.out.println("Enter time 2 in 24hr format as follows (HH:MM:SS)");
            time2 = sc.nextLine();

            if (Objects.equals(time2, "\n")) {
                System.out.println("Enter a valid time");
                valid2 = false;
            } else {
                String [] split = time2.split(":");
                if (split.length!=3) {
                    System.out.println("Enter a valid time");
                    valid2 = false;
                } else {
                    h2 = Integer.parseInt(split[0]);
                    m2 = Integer.parseInt(split[1]);
                    s2 = Integer.parseInt(split[2]);

                    if (h2 < 0 || h2 > 23) {
                        System.out.println("Hour must be below 24");
                        valid2 = false;
                    }
                    if (m2 < 0 || m2 > 59) {
                        System.out.println("Minutes must be less than 60");
                        valid2 = false;
                    }
                    if (s2 < 0 || s2 > 59) {
                        System.out.println("Seconds must be less than 60");
                        valid2 = false;
                    }
                }
            }
        }
        if (valid1 && valid2) {
            long secs = (h2 * 3600 + m2 * 60 + s2) - (h1 * 3600 + m1 * 60 + s1);
            System.out.println("Difference in seconds: " + secs);
        }
        sc.close();
    }
}