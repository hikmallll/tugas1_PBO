package sepatu;

class Sepatu {

    private String name;
    public int price;
    private int size;
    private int dimensions;
    private Branddiscount branddiscount;
    
    public Sepatu(String name, int size, int dimensions, int price) {
        this.name = name;
        this.size = size;
        this.dimensions = dimensions;
        this.price = price;
    }

    public void display() {
        System.out.println("Nama           : " + this.name);
        System.out.println("Size           : " + this.size);
        System.out.println("Dimensions     : " + this.dimensions + "cm");
        System.out.println("Brand discount : " + this.setBranddiskon());
        System.out.println("Discount       : " + this.setdiscount()+"%");
        System.out.println("Price          : " + this.sethargaTotal() + "k");
    }

    public void setBrandDiskon(Branddiscount branddiscount) {
        this.branddiscount = branddiscount;
    }

    public int sethargaTotal() {
        if (branddiscount != null) {
            return this.price - (this.price * this.branddiscount.getDiskon() / 100);
        } else {
            return this.price;
        }
    }
    
    public int setdiscount(){
        if (branddiscount != null) {
            return this.branddiscount.getDiskon();
        } else {
            return 0;
        }
    }
    
    public String setBranddiskon(){
        if (branddiscount != null) {
            return this.branddiscount.getBrand();
        } else {
            return "Tidak ada brand";
        }
    }

}

class Branddiscount {
    private String brand;
    private int discount;

    public Branddiscount(String brand, int discount) {
        this.discount = discount;
        this.brand = brand;
    }

    public int getDiskon() {
        return this.discount;
    }
    
    public String getBrand() {
        return this.brand;
    }
}