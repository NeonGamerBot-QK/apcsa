package com.saahild;

public class Suv  extends Car{
    private int rows;
    private int towCapacity;
    public Suv(int rows, int towCapacity) {
        super("honda", 2020, rows*towCapacity, 300/rows, "gas", "suv");
this.rows = rows;
this.towCapacity = towCapacity;
}    
public boolean hasThirdRow() {
    return rows == 3;
}
public int getTowCapacity() {
    return towCapacity;
}

}
