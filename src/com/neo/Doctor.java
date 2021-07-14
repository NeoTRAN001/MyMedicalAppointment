package com.neo;

import javax.print.Doc;

public class Doctor {
    static int id = 0;
    String name;
    String speciality;

    Doctor() {
        id++;
    }

    Doctor(String name) {
        this.name = name;
        id++;
    }

   public void showName() {
       System.out.println(name);
   }

   public void showId() {
        System.out.println("ID Doctor: " + id);
   }
}
