package org.example;

import org.example.model.entities.Department;
import org.example.model.entities.Seller;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Department obj = new Department(1, "Books");
        Seller seller = new Seller(1, "Bob","bob@gmail.com", new Date(), 1000.0, obj);
        System.out.println(obj);
        System.out.println(seller);
    }
}