package com.neo;

import javax.print.Doc;

public class Doctor {
    int id;
    String name;
    String speciality;

    Doctor() {}

    Doctor(String name) {
        this.name = name;
    }

   public void showName() {
       System.out.println(name);
   }
}
