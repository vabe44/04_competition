package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.print("Enter the number of applicants: ");
        Scanner konzol = new Scanner(System.in);
        int numApps = konzol.nextInt();
        ArrayList<String> appNames = new ArrayList<>();
        ArrayList<Integer> appEmployees = new ArrayList<>();
        for(int i = 0; i < numApps; i++) {
            System.out.print(String.format("Enter the name of the %d. applicant: ", i+1));
            appNames.add(konzol.next());
            System.out.print("Enter the number of employees at %d: " + appNames.get(i) + ": ");
            appEmployees.add(konzol.nextInt());
        }

        int maxEmps = appEmployees.get(0);
        for (Integer employees : appEmployees) {
            if (employees > maxEmps) {
                maxEmps = employees;
            }
        }
        String maxName = appNames.get(appEmployees.indexOf(maxEmps));
        System.out.print("Applicant with the highest number of employees: " + maxName + ", with " + maxEmps + " employees.");

    }
}
