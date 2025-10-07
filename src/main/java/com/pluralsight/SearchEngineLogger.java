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
                    System.out.println("Please select your next action:");
                    System.out.println("1. Search");
                    System.out.println("2. Exit the Application");
                    int command1 = scanner.nextInt();
                    scanner.nextLine();
                    switch (command1) {
                        case 1:
                            System.out.println("Enter your search query here:");
                            String userQuery = scanner.nextLine();
                            searchApplication(currentTime.format(myFormatObj), fileName, userQuery);
                            break;
                        case 2:
                            System.out.println("Thank you for trying this application!");
                            exitApplication(currentTime.format(myFormatObj), fileName);
                            isDone = true;
                            break;
                    }
                    break;
            }
        }
    }
    public static void launchApplication(String dateTime, String fileName){
        actionLogger(dateTime, "launch", fileName);
    }

    public static void searchApplication(String dateTime, String fileName, String search){
        actionLogger(dateTime, "search", fileName, search);
    }

    public static void exitApplication(String dateTime, String fileName){
        actionLogger(dateTime, "exit", fileName);
    }

    public static void actionLogger(String dateTime, String action, String fileName){
    }

    public static void actionLogger(String dateTime, String action, String fileName, String search){
    }
}
