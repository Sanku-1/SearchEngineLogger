package com.pluralsight;

import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class SearchEngineLogger {
    public static void main(String[] args) {
        String fileName = "logs.txt";
        Scanner scanner = new Scanner(System.in);
        boolean isDone = false;
        ZonedDateTime currentTime = ZonedDateTime.now();
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("yyyy-dd-MM HH:mm:ssa z");


        while (!isDone) {
            System.out.println("Press 1 to Launch Application");
            int command = scanner.nextInt();
            scanner.nextLine();

            switch (command) {
                case 1:
                    launchApplication(currentTime.format(myFormatObj), fileName);
                    int command1 = scanner.nextInt();
                    scanner.nextLine();
                    switch (command1) {
                        case 1:
                            System.out.println("hi");
                    }
                    break;
            }
        }
    }
    public static void launchApplication(String dateTime, String fileName){
        actionLogger(dateTime, "launch", fileName);
    }

    public static void actionLogger(String dateTime, String action, String fileName){

    }
}
