package com.saahild;
// Subclass Car inheriting from Vehicle
class Car extends Vehicle {
   private int mpg;
   private boolean locked;
   private int maxSpeed;

   public Car(String  manufacture, int year, int mpg, int maxSpeed, String fuel, String brand) {
       super(manufacture, maxSpeed, fuel, brand);
       this.mpg = mpg;
       locked = false;
       this.maxSpeed = maxSpeed;
   }
   public int getMPG() {
       return mpg;
   }
      public boolean isLocked() {
       return locked;
   }
   public int getMaxSpeed(){
       return maxSpeed;
   }
   @Override
   public void honk() {
       System.out.println("Awooga!");
   }
}
