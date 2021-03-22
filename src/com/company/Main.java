package com.company;

import java.util.*;



public class Main {

    public static void main(String[] args) {

        ArrayList<String> listA = new ArrayList<>(5);
        System.out.println("Введите 5 разных женских имен: ");
        for (int i = 0; i < 5; i++) {
            Scanner scanner = new Scanner(System.in);
            listA.add(scanner.nextLine());
        }
        Iterator<String> iterator1 = listA.iterator();
        while (iterator1.hasNext()) {
            String listA1 = iterator1.next();
            System.out.println(listA1);
        }

        ArrayList<String> listB = new ArrayList<>(5);
        System.out.println("Введите 5 разных мужских имен: ");
        for (int i = 0; i < 5; i++) {
            Scanner scanner = new Scanner(System.in);
            listB.add(scanner.nextLine());
        }
        Iterator<String> iterator2 = listB.iterator();
        while (iterator2.hasNext()) {
            String listB1 = iterator2.next();
            System.out.println(listB1);
        }

        ArrayList<String> arrayListC = new ArrayList<>();
        Iterator<String> iter1 = listA.iterator();
        Iterator<String> iter2 = listB.iterator();

        while (iter1.hasNext() && iter2.hasNext()) {

            arrayListC.add(iter1.next());
            arrayListC.add(iter2.next());
        }
        System.out.println("---------------------");
        System.out.println(arrayListC);

        Collections.sort(arrayListC, new Comparators());
        System.out.println(arrayListC);


    }


}



