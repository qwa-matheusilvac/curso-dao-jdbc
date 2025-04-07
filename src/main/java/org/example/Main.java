package org.example;

import org.example.model.dao.DaoFactory;
import org.example.model.dao.SellerDao;
import org.example.model.entities.Department;
import org.example.model.entities.Seller;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        Department obj = new Department(1, "Books");
//        Seller seller = new Seller(1, "Bob","bob@gmail.com", new Date(), 1000.0, obj);
        System.out.println("==== TESTE FIND BY ID ====");
        SellerDao sellerDao = DaoFactory.createSellerDao();
        Seller seller = sellerDao.findById(4);
        System.out.println(seller);
//        System.out.println(obj);

        System.out.println("==== TESTE FIND BY DEPARTMENT ====");
        Department department = new Department(4, null);
        List<Seller> list = sellerDao.findByDepartment(department);
        list.forEach(System.out::println);

        System.out.println("==== TESTE FIND ALL ====");
        List<Seller> listAll = sellerDao.findAll();
        listAll.forEach(System.out::println);

        System.out.println("\n=== INSERT =====");
        Seller newSeller = new Seller(null, "Greg", "greg@gmail.com", new Date(), 4000.0, department);
        sellerDao.insert(newSeller);
        System.out.println("Inserted! New id = " + newSeller.getId());

        System.out.println("\n=== UPDATE =====");
        seller = sellerDao.findById(7);
        seller.setName("Martha Waine");
        sellerDao.update(seller);
        System.out.println("Update completed");


        System.out.println("\n=== TEST 6: seller delete =====");
        System.out.println("Enter id for delete test: ");
        int id = sc.nextInt();
        sellerDao.deleteById(id);
        System.out.println("Delete completed");

        sc.close();

    }
}