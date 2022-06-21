 package simple;
 
import java.util.ArrayList;
public class Customer extends Users{ 
    private int num_visits;
    private boolean special_cust;
    public ArrayList<Product>purchased;
    public Customer(){ 
     super.setName(null);
     super.setID(); 
     this.num_visits=0;
     this.special_cust=false;
     purchased=new ArrayList<Product>();
    }
    public Customer(String name){
       super(name);
       super.setID();
       this.num_visits=0;
       this.special_cust=false;
       purchased=new ArrayList<Product>();
    }
   public void setName(String name){
        super.name=name;
   }
   public String getName(){
        return super.name;
   }
   public void setVisits(){
        ++num_visits;
   }
   public int getVisits(){
        return this.num_visits;
   }
   public boolean isSpecial_cust(){
        if (num_visits>2){
         this.special_cust=true;
        }
        return this.special_cust;
   }
   public String getTypeOfCustomer(){
        if (isSpecial_cust()){
            return "عملا خاصين ";
       }
        return  " عملاء جدد";
   }
   public void  addPurchased(Product new_purchased){
        purchased.add(new_purchased);
   }
   public double getPurchased(){
        double total=0;
 for (int i = 0; i < purchased.size(); i++){ System.out.println(purchased.get(i).toString());  
       total+=purchased.get(i).getPrice();
       }
       return total;
   }
   public  String toString(){
      return "("+getID()+")"+ getTypeOfCustomer()+" : "+getName()+" "+"مرة الزيارة "+getVisits();
   }
}