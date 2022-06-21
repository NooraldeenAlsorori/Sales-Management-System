package simple;

import java.util.Scanner;

public class StoreManagementSystem {
    public static void main(String[] args) {
    
    
        Store my_store=new Store("نظام مبيعات ");
        System.out.println("____________["+my_store.getName()+"]____________");
        System.out.println("مرحبا بكم في السوبر ماركة");
        System.out.println("القائمة الرئسية"+"\n"+"اختار احد العمليات التالية بالرقم حيث"); 
        try {
            Scanner input=new Scanner(System.in);
            int choice=0; 
           do { 
                System.out.println("ادارة المنتجات"+"-[1]");
                System.out.println("اضافة مستخدمين وعملاء"+"-[2]");
                System.out.println("بيع منتج "+"-[3]");
                System.out.println("عرض المنتجات الموجودة في المخزن"+"-[4]");
                System.out.println("الخروج من النظام "+"-[5]"); System.out.println("--------------------");
                System.out.print("ادخل رقم العملية "+">>>");
                choice =input.nextInt();
                switch (choice){
                    case 1:
                        int s1=0;
                        do {
                                        System.out.println( "-------("+"قائمة اضافة منتج "+")-------"+"\n"+"اختار اي عمليه من العمليات التالية :");                          System.out.println("اضافة منتج  جديد للمخزن " +"-( 1 )");                           System.out.println("حذف منتج " + "-( 2 )");                          System.out.println("عرض المنتجات " + "-( 3 )");                          System.out.println("العودة الى القائمة الرئسية " + "-( 4 )");                            System.out.print("ادخل رقم العملية "+">>>");                            s1=input.nextInt(); 
 
 switch (s1){ 
 case 1:                                   System.out.println("ادخل اسم المنتج");                                   String pro_name=input.next();                                  System.out.println("سعر المنتج ");                                   double price =input.nextDouble();                                 System.out.println("نوع المنتج ");                                  String special_pro =input.next();
 System.out.println("ادخل الكمية");
int quantity=input.nextInt(); 
Product new_product=new Product(pro_name,price,special_pro, quantity);                                  my_store.addProduct(new_product);
 break;
  case 2:                                   System.out.println("ادخل رقم الموظف ليسمح لك بحذف منتج");                                  int id=input.nextInt();                                  if (my_store.check_manager(id)){
  System.out.println("ادخل اسم المنتج المراد حذفه ");                                       pro_name=input.next();                                       my_store.removeProduct(pro_name);}
  else
{
System.out.println("لاتملك الصلاحية لحذف منتج  ");
   }
  break;
 case 3:
  if (my_store.products.isEmpty()){
   System.out.println("لا يوجد اي منتج في المخزن ");
 }
 else {
  System.out.println("تمة عملية عرض المنتجات ");                                        my_store.print_pro();
  }
   break;
  }
 }
 while (s1!=4);
    break;
  case 2:
   int s2;
    do {
    System.out.println( "-------("+"قائمة اضافة مستخدمين وموظفين  "+")-------"+"\n"+"اختار اي عملية من العمليات التالية :");                          System.out.println( "اضافة عميل " + "-( 1 )");                          System.out.println("اضافة موظف " + "-( 2 )");                           System.out.println("زيادة نسبة راتب موظف  " + "-( 3 )");                           System.out.println("عرض العملاء " + "-( 4 )");                            System.out.println("عرض الموظفين " + "-( 5 )");                            System.out.println("العودة الى القائمة الرئسية"+"-( 6)");                            System.out.print("ادخل رقم العملية "+">>>");                            s2=input.nextInt();
    switch (s2){ 
        case 1:                                 System.out.println("ادخل اسم العميل");                                  String cus_name =input.next();                                   Customer new_customer=new Customer(cus_name);                            my_store.customers.add(new_customer);
          break;
         case 2:                                  System.out.println("ادخل اسم الموظف");                                   String emp_name=input.next();                                   System.out.println("ادخل راتب الموظف ");                                    double salary=input.nextDouble();                                    System.out.println("هل هو موظف او مدير اضغط (1) مدير اضغط (2) موظف ");                                   int x=input.nextInt();                                  String type_emp;                                  if (x==1){ 
    type_emp="manager";   }
    else {   
     type_emp="user";
  }                                   Employee new_Emp=new Employee(emp_name,salary,type_emp);
// 'to'
                                   my_store.employees.add(new_Emp);
        break;
       case 3:                               System.out.println("ادخل رقم الموظف المراد زيادة الراتب له");                                   int y=input.nextInt();                                 if (my_store.employees.size()>0){ 
for (int i = 0; i < my_store.employees.size(); i++){
 if (y==my_store.employees.get(i).getID()){
System.out.println("ادخل مقدار زيادة الراتب %");                                  double percent=input.nextDouble();                                   my_store.increce_salary(percent);
  }
   }
   }
   else  
  System.out.println("لايوجد موظف بهذا الرقم");
   break;
     case 4:                               if((my_store.customers.isEmpty())){   
      System.out.println("لايوجد عملاء ");
 }
 else{                                       System.out.println("قائمة العملاء ");                                       my_store.print_cust();
 }
 break;
    case 5:                                  if((my_store.employees.isEmpty())){   
  System.out.println("لايوجد موظفين ");
   }
   else { 
    System.out.println("قائمة الموظفين ");                                     my_store.print_emp();
 }
      break;   }
  }while (s2!=6);
break;
 case 3:
    int s3 = 0;
    int n=0;
    int nuOfPi=0;
    int q=0;
  System.out.println("ادخل رقم العميل ");
  int cus_id=input.nextInt() ;                if (my_store.customers.size()>0){
  for (int i = 0; i < my_store.customers.size(); i++) {
   if (cus_id==my_store.customers.get(i).getID()){
     System.out.println(my_store.customers.get(i).toString());
 
 while (s3!=-1){ 
 System.out.println("ادخل رقم المنتج ");
  int pro_id=input.nextInt();                                  for (int j = 0; j < my_store.products.size(); j++) {                                    
   if (pro_id==my_store.products.get(j).getID()){ 
   System.out.println(my_store.products.get(j).toString());
   System.out.println("ادخل الكمية ");
    q=input.nextInt();  if(my_store.products.get(j).getQuantity()>=q){ 
    
  nuOfPi+=q; 
  my_store.customers.get(n).setVisits();                                                                                 my_store.customers.get(i).addPurchased(my_store.products.get(j));  
  my_store.products.get(j).setQuantity(my_store.products.get(j).getQuantity()-q);                                        n=i;                                           break;}
  else 
  System.out.println("الكمية المباعه اكبر من الكميه الموجودة في المخزن") ;                                      }else if (pro_id != my_store.products.get(j).getID()){
                                           System.out.println("المنتج غير موجود في المتجر ");                                          break;
        }
          }                                   System.out.println("ادخل ( 0 ) لأضافة منتج اخر او ( 1- ) عند الانتهاء");                                   s3=input.nextInt();
    }
     }
      }                 
      
     System.out.println( my_store.customers.get(n).getTypeOfCustomer());
                             System.out.println(" شراء ");                                                                      my_store.totalPrice(cus_id,q);                  
                                           //my_store.buy(cus_id);  
                                                                                                                                                                                                      my_store.customers.get(n).purchased.clear();
    
System.out.println(" عدد القطع = "+ nuOfPi);}
   else System.out.println("لايوجد عميل");
           break;
         case 4:
     System.out.println("منتج الخاص ");                 my_store.print_special_pro();
              break;
                }            System.out.println("__________________________");
            }while (choice != 5);
        } catch (Exception e) {
     System.out.println("ادخال غير صحيح ");
     System.out.println("مع السلامة ");
          // e.printStackTrace();
        }
   }
   }
 