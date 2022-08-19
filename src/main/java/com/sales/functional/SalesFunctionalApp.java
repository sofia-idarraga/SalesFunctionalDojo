package com.sales.functional;

import com.sales.functional.database.Database;
import com.sales.functional.entities.Sale;

import java.util.ArrayList;
import java.util.Scanner;

public class SalesFunctionalApp {
    static ArrayList<Sale> sales = Database.loadDatabase();
    public static void main(String[] args) {
        loadMenu();
    }

    public static void menu(){
        System.out.println("Supplies sales");
        System.out.println("1. Online purchased");
        System.out.println("2. Sales located in NY that use / does not use a coupon");
        System.out.println("3. Amount of sales where customers use and does not use a coupon");
        System.out.println("4. Sales made in YYYY");
        System.out.println("5. Sales where satisfaction is N");
        //TO DO:
        System.out.println("6. Total payment per customer");
        System.out.println("7. Sales where customer are women that purchase In Store");
        System.out.println("8. How many products per tags customers bought");
        System.out.println("9. How many men and women uses coupon");
        System.out.println("10. Customer that spent more and less");

    }

    public static void loadMenu(){
        Scanner sc = new Scanner(System.in);
        menu();
        System.out.print("Type option: ");
        String op=sc.nextLine();
        switch(op){
            case "1":
                //getOnlinePurchases();
                break;
            case "2":
                System.out.print("Coupon usage? Y/N: ");
                //getNySales(sc.nextLine());
                break;
            case "3":
                //couponUsage();
                break;
            case "4":
                System.out.print("What year do you need?: ");
                //salesByYear(sc.nextLine());
                break;
            case "5":
                System.out.print("What qualification do you need (1-5): ");
                //salesBySatisfaction(sc.nextLine());
                break;
            default:
                System.out.println("Invalid input. Try again.");
        }

    }

    //TO DO: Make 7 to solve: 5 in class, 5 as hw

    //1. Get all sales with purchased method 'Online'

    //2. Get all sales which location is New York and does not used a coupon

    //3. Get the amount of sales where customers uses a coupon

    //4. Get the sales made in YYYY

    //5. Get the amount of sales where satisfaction is less than 4.

    //6. Calculate the total payment that customers did in each sale.

    //7. Get all sales where customer are women that purchases In Store

    //8. Get how many products per tags customers bought

    //9. Get how many men and women uses the coupon

    //10. Get the customers that spent more and less.
}
