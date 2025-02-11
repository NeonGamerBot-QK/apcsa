package com.saahild;
public class Vehicle {
   private String manufacture;
   private int year;
   private String fuel;
   private String brand;
   public Vehicle(String manName, int year, String type, String brand) {
       manufacture = manName;
       this.year = year;
       fuel  = type;
       this.brand = brand;
   }
   public String getManufactureName() {
       return manufacture;
   }
   public String getBrand() {
       return brand;
   }
   public String fuelType() {
       return fuel;
      }
   public void honk() {
       System.out.println("Loud Noise");
   }
}
