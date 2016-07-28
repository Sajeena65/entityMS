/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sajeena.entityMS;

import com.sajeena.entityMS.dao.entityDAO;
import com.sajeena.entityMS.dao.impl.entityDAOImpl;
import com.sajeena.entityMS.entity.entity;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       entityDAO entitydao = new entityDAOImpl();
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("1.Enter entity detail:");
            System.out.println("2.Delete record:");
            System.out.println("3.Show all:");
            System.out.println("4.Search by Id:");
            System.out.println("5.Exit");
            System.out.println("Enter your choice [1-5]:");
            int choice = input.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter entity detail:");
                    entity c = new entity();
                    System.out.println("Enter entity ID: ");
                    c.setId(input.nextInt());
                    System.out.println("Enter entity Name: ");
                    c.setEntityname(input.next());
                    System.out.println("Enter description:");
                    c.setDescription(input.next());
                    System.out.println("Enter Status: ");
                    c.setStatus(input.nextBoolean());
                    if (entitydao.insert(c)) {
                        System.out.println("Inserted successfully");

                    } else {
                        System.out.println("Data Full");
                    }
                    break;
                case 2:
                    System.out.println("Enter the Id to delete: ");
                    int id = input.nextInt();
                    if (entitydao.delete(id)) {
                        System.out.println("Id No " + id + " is deleted successfully.");
                    } else {
                        System.out.println("Id not found.");
                    }

                    break;
                case 3:
                    System.out.println("Listing all entities:");
                    entity[] ar = entitydao.getAll();
                    for (int i = 0; i < ar.length; i++) {
                        entity a = ar[i];
                        if (a != null) {
                            System.out.println("Id:" + a.getId());
                            System.out.println("Name:" + a.getEntityname());                           
                            System.out.println("Description:" + a.getDescription());
                            System.out.println("Status:" + a.isStatus());

                        }
                    }
                    break;
                case 4:
                    System.out.println("Enter Id:");
                    int a = input.nextInt();
                    entity x = entitydao.getbyId(a);
                    if(x!=null){
                     System.out.println("Id:" + x.getId());
                            System.out.println("Name:" + x.getEntityname());                           
                            System.out.println("Description:" + x.getDescription());
                            System.out.println("Status:" + x.isStatus());
                     }else
                    System.out.println("entity could not be found.");
                    break;
                case 5:
                    System.exit(0);
                    break;
            }
        }
    }
    
}
