package simple;

public class Product {
   private String pro_name;
   private double price;
    static  int ID_start=100;
   private int ID;
    private String Kind;
    private int quantity;
    private Product(){
        this.pro_name=null;
        this.price=0.0;
        this.Kind=null;
        this.quantity=0;
        this.ID+=ID_start;
    }
    public Product(String name,double price,String Kind,int q){
        this.pro_name=name;
        this.price=price;
        this.Kind=Kind;
        this.quantity=q;
        this.ID=ID_start++;
    }
  public void setQuantity(int q){
       this.quantity=q;
    }
    public int getQuantity(){
       return this.quantity;
    }
    public void setName(String name){
        this.pro_name=name;
    }
    public String getName(){
       return this.pro_name;
    }
    public void setPrice(double price){
        this.price=price;
    }
    public double getPrice(){
        return this.price;
    }
    public void setKind(String Kind){
        this.Kind=Kind;
    }
    public String getKind(){
        return this.Kind;
    }
    public void setID(){
        this.ID=ID_start++;
    }
    public int getID(){
        return this.ID;
    }
    public String toString(){
        return "رقم المنتج"+"("+getID()+")"+"اسم المنتج " +getName()+" : "+"سعر المنتج "+" "+getPrice()+" ري."+" الكمية "+getQuantity();
    }
}
