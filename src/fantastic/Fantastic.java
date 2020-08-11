/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fantastic;

import static fantastic.Fantastic.Customer.calculateDate;
import static fantastic.Fantastic.Customer.calculateTourCost;
import static fantastic.Fantastic.Customer.checkCC;
import static fantastic.Fantastic.Customer.enterDay;
import static fantastic.Fantastic.Customer.enterMonth;
import static fantastic.Fantastic.Customer.enterNumAdults;
import static fantastic.Fantastic.Customer.enterNumKids;
import static fantastic.Fantastic.Customer.enterYear;
import static fantastic.Fantastic.Customer.hotelEntry;
import static fantastic.Fantastic.Customer.tourEntry;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author acon3
 */

public class Fantastic {
    
    private String username;
    
    private void storeUsername(String user) {
        this.username = user;
    }
    
    private String getUsername() {
        return username;
    }

    
public static class Customer {
    
    private String name;
    private String date;
    private String tour;
    private String hotel;
    private String reservedBy;
    private int numAdults;
    private int numKids;
    private int totalPayment;
    private int tourCost;
    private int commission;
    private int balance;
    private int netSale;
    private boolean creditCard;
    private int day;
    private int month;
    private int year;
    
    
    
    public Customer(String name, String date, String tour, String hotel, String reservedBy,
                    int numAdults, int numKids, int totalPayment, int tourCost,
                    int commission, int balance, int netSale, boolean creditCard,
                    int day, int month, int year) {
        
        this.name = name;
        this.date = date;
        this.tour = tour;
        this.hotel = hotel;
        this.reservedBy = reservedBy;
        this.numAdults = numAdults;
        this.numKids = numKids;
        this.totalPayment = totalPayment;
        this.tourCost = tourCost;
        this.commission = commission;
        this.balance = balance;
        this.netSale = netSale;
        this.creditCard = creditCard;
        this.day = day;
        this.month = month;
        this.year = year;
    }

    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTour() {
        return tour;
    }

    public void setTour(String tour) {
        this.tour = tour;
    }

    public String getHotel() {
        return hotel;
    }

    public void setHotel(String hotel) {
        this.hotel = hotel;
    }

    public String getReservedBy() {
        return reservedBy;
    }

    public void setReservedBy(String reservedBy) {
        this.reservedBy = reservedBy;
    }

    public int getNumAdults() {
        return numAdults;
    }

    public void setNumAdults(int numAdults) {
        this.numAdults = numAdults;
    }

    public int getNumKids() {
        return numKids;
    }

    public void setNumKids(int numKids) {
        this.numKids = numKids;
    }

    public int getTotalPayment() {
        return totalPayment;
    }

    public void setTotalPayment(int totalPayment) {
        this.totalPayment = totalPayment;
    }

    public int getTourCost() {
        return tourCost;
    }

    public void setTourCost(int tourCost) {
        this.tourCost = tourCost;
    }
    
    public int getCommission() {
        return commission;
    }

    public void setCommission(int commission) {
        this.commission = commission;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
    
    public int getNetSale() {
        return netSale;
    }
    
    public void setNetSale(int netSale) {
        this.netSale = netSale;
    }

    public boolean getCreditCard() {
        return creditCard;
    }

    public void setCreditCard(boolean creditCard) {
        this.creditCard = creditCard;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
    
    public static String calculateDate(int monthX, int dayX, int yearX) {
        
        String dateX = monthX + "/" + dayX + "/" + yearX;
        
        return dateX;
    }
    
    public static String tourEntry() {
        
        Object[] tours = {"Big Bus", "Everglades", "Boat", "Bus/Boat Combo",
                            "Key West", "Sequarium", "Private Tour", "Zoo"};
        
            String tourX = (String)JOptionPane.showInputDialog(
                null,
                "Select Tour\n",
                null,
                JOptionPane.QUESTION_MESSAGE,
                null,
                tours,
                "Select");
        
        return tourX;
    }
    
    public static String hotelEntry() {
        
        Object[] hotels = {"Best Western Doral", "Trump", "Quality 79", "Hampton 79",
                            "Nuvo Suites", "Inter Continental", "Holiday 84",
                            "Holiday 87", "Quinta North", "Homewood Dolphin",
                            "Courtyard 79", "Aloft", "Element Doral", "Baymont",
                            "Vacation Village", "AC", "Residents Inn", "StayBridge 87",
                            "DoubleTree Doral", "Fairfield Doral",
                            "----------------------",
                            "Embassy", "Best Western MS", "Comfort Inn", "Comfort New",
                            "EB", "Holiday Poinciana", "Holiday Lejun", "Hyatt Lejun", 
                            "Hampton Lejun", "Quinta East", "Element MIA",
                            "StayBridge MIA", "Even MIA", "StayBridge MIA",
                            "Regency", "Crowne Plaza", "Courtyard Lejun",
                            "Residents Lejun", "Fairfield Lejun","TownPlace Lejun",
                            "----------------------",
                            "Homewood Lagoon", "Hilton Lagoon", "Hampton Lagoon",
                            "Pullman", "Cambria 72", "Double-Tree 72", " SpringHill 72"};
            
            String hotelX = (String)JOptionPane.showInputDialog(
                null,
                "Select Hotel\n",
                null,
                JOptionPane.QUESTION_MESSAGE,
                null,
                hotels,
                "Select");
        
        return hotelX;
    }
    
    public static int calculateTourCost(String tourX, int numAdultsX, int numKidsX) {
        
        int tourCostX = 0;
        
        if (tourX.equals("Big Bus")) {
            tourCostX = (numAdultsX * 25) + (numKidsX * 25);
        }
        else if (tourX.equals("Everglades")) {
            tourCostX = (numAdultsX * 13) + (numKidsX * 10);
        }
        else if (tourX.equals("Boat")) {
            tourCostX = (numAdultsX * 9) + (numKidsX * 9);
        }
        else if (tourX.equals("Bus/Boat Combo")) {
            tourCostX = (numAdultsX * 34) + (numKidsX * 34);
        }
        else if (tourX.equals("Key West")) {
            tourCostX = (numAdultsX * 25) + (numKidsX * 25);
        }
        else if (tourX.equals("Sequarium")) {
            tourCostX = (numAdultsX * 39) + (numKidsX * 32);
        }
        else if (tourX.equals("Private Tour")) {
            tourCostX = 0;
        }
        else if (tourX.equals("Zoo")) {
            tourCostX = 0;
        }
        
        return tourCostX;
    }
    
    public static boolean checkCC() {
        
        int response = JOptionPane.showConfirmDialog(null, "Credit Card?", null,
                        JOptionPane.YES_NO_OPTION,
                        JOptionPane.QUESTION_MESSAGE);
        
        return (response == 0);
    }

    public static int enterNumAdults() {
        
        int numAdultsX = 0;
        String num;
        
        while(true) {
            
            num = JOptionPane.showInputDialog("Enter number of Adults");
            
            try {   
                numAdultsX = Integer.parseInt(num);
                break;
            }        
            catch (NumberFormatException nfe) {
                JOptionPane.showMessageDialog(null, "Enter a Valid Number");
            }
        }       
        return numAdultsX;
    }
    
    public static int enterNumKids() {
        
        int numKidsX = 0;
        String num;
        
        while(true) {
            
            num = JOptionPane.showInputDialog("Enter number of Kids");
            
            try {   
                numKidsX = Integer.parseInt(num);
                break;
            }        
            catch (NumberFormatException nfe) {
                JOptionPane.showMessageDialog(null, "Enter a Valid Number");
            }
        }       
        return numKidsX;
    }
    
    public static int enterMonth() {
        
        int monthX = 0;
        String num;
        
        while(true) {
            
            num = JOptionPane.showInputDialog("Enter the Month");
            
            try {   
                monthX = Integer.parseInt(num);
                if(monthX >= 1 && monthX <= 12) {
                    break;                
                }
            }        
            catch (NumberFormatException nfe) {
                JOptionPane.showMessageDialog(null, "Enter a Valid Number (1-12)");
            }
        }
        return monthX;
    }
    
    public static int enterDay() {
        
        int dayX = 0;
        String num;
        
        while(true) {
            
            num = JOptionPane.showInputDialog("Enter the Day");
            
            try {   
                dayX = Integer.parseInt(num);
                if(dayX >= 1 && dayX <= 31) {
                    break;                
                }
            }        
            catch (NumberFormatException nfe) {
                JOptionPane.showMessageDialog(null, "Enter a Valid Number (1-31)");
            }
        }
        return dayX;
    }
    
    public static int enterYear() {
        
        int yearX = 0;
        String num;
        
        while(true) {
            
            num = JOptionPane.showInputDialog("Enter the Year");
            
            try {   
                yearX = Integer.parseInt(num);
                if(yearX >= 2012 && yearX <= 2020) {
                    break;                
                }
            }        
            catch (NumberFormatException nfe) {
                JOptionPane.showMessageDialog(null, "Enter a Valid Number (2015-2020)");
            }
        }
        return yearX;
    }
    
    
    @Override
    public String toString() {
        String output = "Name: " + getName() +
                      "\n\tDate: " + getMonth() + "/" + getDay() + "/" + getYear() +
                      "\n\tTour: " + getTour() +
                      "\n\tHotel: " + getHotel() +
                      "\n\tReservedBy: " + getReservedBy() +
                      "\n\tAdults: " + getNumAdults() +
                      "\n\tKids: " + getNumKids() +
                      "\n\tTotal: " + getTotalPayment() +
                      "\n\tCommission: " + getCommission() +
                      "\n\tBalance: " + getBalance() +
                      "\n\tCC: " + getCreditCard() +
                      "\n" + "\n";
        return output;
    }
    
}    
    



    public static void main(String[] args) throws FileNotFoundException, NullPointerException, IOException {
        
        Fantastic obj = new Fantastic();
        //Customer cust = new Customer();
        
        ArrayList<Customer> customerList = new ArrayList<>();
        
        String outf = JOptionPane.showInputDialog("Output file?");
        
        
        
        JOptionPane.showMessageDialog(null, "Welcome to Fantastic Tours Database");
        
    //__________________________________________________________________________
    
        Object[] users = {"Claudia", "Paula", "Jesse", "Lila"};
            String user = (String)JOptionPane.showInputDialog(
                null,
                "Select Username\n",
                null,
                JOptionPane.QUESTION_MESSAGE,
                null,
                users,
                "Select");
        
        obj.storeUsername(user);
    
    //__________________________________________________________________________
    
        Object[] programFunctions = {"Tours Data-Entry", "Ports Data-Entry"};
            String function = (String)JOptionPane.showInputDialog(
                null,
                "Select Function\n",
                null,
                JOptionPane.QUESTION_MESSAGE,
                null,
                programFunctions,
                "Select");            
    
    //__________________________________________________________________________
    
        if (function.equals("Tours Data-Entry")) {
            
            boolean check = true;
            
            while (check == true) {
            
                //customerEntry();

                String nameX = JOptionPane.showInputDialog("Enter customer name");
                String tourX = tourEntry();       
                String hotelX = hotelEntry();
                String reservedByX = JOptionPane.showInputDialog("Enter Reserver's name");
                int numAdultsX = enterNumAdults();
                int numKidsX = enterNumKids();
                int totalPaymentX = Integer.parseInt(JOptionPane.showInputDialog("Enter Total Payment"));
                int tourCostX = calculateTourCost(tourX, numAdultsX, numKidsX);
                int commissionX = Integer.parseInt(JOptionPane.showInputDialog("Enter Total commission"));
                int balanceX = totalPaymentX - commissionX;
                int netSaleX = totalPaymentX - commissionX - tourCostX;
                boolean creditCardX = checkCC();
                int monthX = enterMonth();
                int dayX = enterDay();
                int yearX = enterYear();
                String dateX = calculateDate(monthX, dayX, yearX);

                Customer client = new Customer(nameX, dateX, tourX, hotelX, reservedByX, numAdultsX,
                                                numKidsX, totalPaymentX, tourCostX, commissionX,
                                                balanceX, netSaleX, creditCardX, dayX, monthX, yearX);

                client.setName(nameX);                  client.setTour(tourX);
                client.setHotel(hotelX);                client.setReservedBy(reservedByX);
                client.setNumAdults(numAdultsX);        client.setNumKids(numKidsX);
                client.setTotalPayment(totalPaymentX);  client.setTourCost(tourCostX);
                client.setCommission(commissionX);      client.setBalance(balanceX);
                client.setNetSale(netSaleX);            client.setCreditCard(creditCardX);
                client.setDay(dayX);                    client.setMonth(monthX);
                client.setYear(yearX);                  client.setDate(dateX);

                customerList.add(client);
                
                int response = JOptionPane.showConfirmDialog(null, "Continue?", null,
                               JOptionPane.YES_NO_OPTION,
                               JOptionPane.QUESTION_MESSAGE);
                
                if (response == 1) {
                    check = false;
                }
                

            }
            
            if (outf == null) {
                outf = JOptionPane.showInputDialog("Output file?");
            }
            
            try(FileWriter fos = new FileWriter("customers.csv", true);
            BufferedWriter bW = new BufferedWriter(fos);
            PrintWriter out = new PrintWriter(bW))
                
            {
                //out.println("Date, Hotel, Tour, Customer, Reserved, Adults, Kids, Total, Deposit, Balance");
                for (int i = 0; i < customerList.size(); i ++) {
                    out.print(customerList.get(i).getDate() + 
                            "," + customerList.get(i).getHotel() +
                            "," + customerList.get(i).getTour() +
                            "," + customerList.get(i).getName() +
                            "," + customerList.get(i).getReservedBy() +
                            "," + customerList.get(i).getNumAdults() +
                            "," + customerList.get(i).getNumKids() +
                            "," + customerList.get(i).getTotalPayment() +
                            "," + customerList.get(i).getCommission() +
                            "," + customerList.get(i).getBalance());
                    out.println();
                }
                
            
            }
        } 
        
    }    
}
