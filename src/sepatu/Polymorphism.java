package sepatu;

import sepatu.Sepatu;

public class Polymorphism {
    public static void main(String[] args) {
        Sepatu sepatu1 = new Sepatu("Nike Air Max", 33, 34, 1000);
        sepatu1.display(); // Menampilkan informasi sepatu
        
        Branddiscount diskon1 = new Branddiscount("Nike",10);
        sepatu1.setBrandDiskon(diskon1); // Mengatur diskon
        
        System.out.println("\n");
        sepatu1.display(); // Menampilkan informasi sepatu setelah diskon
    }
}

 