package simple;
import java.util.ArrayList;
 
public class Store {
 
    private String name;
    ArrayList<Product>products;
    ArrayList<Customer>customers;
    ArrayList<Employee>employees;
    public Store() {
        this.name=null;
        products=new ArrayList<Product>();
    customers=new ArrayList<Customer>();
    employees=new ArrayList<Employee>();
    }
    public Store(String name) {
    this.name=name;
    products=new ArrayList<Product>();
    customers=new ArrayList<Customer>();
    employees=new ArrayList<Employee>();
    }
    public String getName() {
     return name;
    }
    public  boolean isExist (String por_name){
 for (int i = 0; i <products.size(); i++) {
  if(por_name.equals(products.get(i).getName())){
 return  true;
}
 } 
 return false;
   }
 
 public void addProduct(Product new_product){
        if (products.size()==100){
    System.out.println("المخزن ممتلى");
      }else
            products.add(new_product);
    }
    public void removeProduct(String pro_name){
        if (products.isEmpty()){
          System.out.println("المخزن فارغ");
        }
        else {
            if (isExist(pro_name)){
for (int i = 0; i <products.size() ; i++) {
 if(pro_name.equals(products.get(i).getName()))                      products.remove(i);
  System.out.println("تم عملية حذف المنتج ");
                }
            }else{
                System.out.println("هذا المنتج غير موجود !!!");
            }
        }
    }
 public void totalPrice(int cust_id,int q){
        double total=0.0;
        double discount=0.0;
        
for (int i = 0; i < customers.size(); i++) {
if (cust_id==customers.get(i).getID()){
 total=q*customers.get(i).getPurchased();
 System.out.println(" السعر الاجمالي قبل الخصم \n"+total);
 if (customers.get(i).isSpecial_cust()){
 discount=total*(0.5);
 total-=discount;
 }
   }
    }
   System.out.println(" الخصم \t"+discount);
   
        System.out.println(" السعر الاجمالي بعد الخصم \n"+total);
    }
    public  void buy (int cust_id){
        for (int i = 0; i < customers.size(); i++) {
   if (cust_id==customers.get(i).getID()){
   for (int j = 0; j < customers.get(i).purchased.size(); j++) {
  removeProduct(customers.get(i).purchased.get(j).getName());
   }
     }
        }
         }
    public  void print_pro(){
        for (int i = 0; i < products.size(); i++) {
       System.out.println(products.get(i).toString());
     }
  }
    public  void print_cust(){
        for (int i = 0; i < customers.size(); i++) {
        System.out.println(customers.get(i).toString());
        }
    }
    public void print_emp(){
        for (int i = 0; i < employees.size(); i++){ System.out.println(employees.get(i).toString());
   }
    }
    public void increce_salary(double prc){
        for (int i = 0; i < employees.size(); i++) {
        employees.get(i).setNewSalary(prc);
        }
    }
    public boolean check_manager(int id){
        boolean stat =false;
        for (int i = 0; i < employees.size(); i++) {
  if (id==employees.get(i).getID()){
   if (employees.get(i).isManager()){
  stat=true;
   }
    }
     }
 return stat;
    }
    public  void print_special_pro(){
        System.out.println("(قائمة المنتج الخاص");
        for (int i = 0; i < products.size(); i++) {
 if("IT".equals(products.get(i).getKind()))  {
 System.out.println(products.get(i).toString());
  }
   }
    } 
}

    