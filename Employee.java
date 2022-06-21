package simple;

public class Employee extends Users{
    private double salary;
    private String type_of_emloyee;
    public Employee(){
        super.setName(null);
        super.setID();
        this.salary=0.0;
        this.type_of_emloyee=null;
    }
    public Employee(String name,double salary,String type ){
        super(name);
        this.salary=salary;
        this.type_of_emloyee=type;
        super.setID();
    }
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return this.name;
    }
    public int grtID(){
        return super.ID;
    }
    public void setSalary(double salary){
       this.salary=salary;
    }
    public double getSalary(){
       return  this.salary;
    }
    public void setType(String type){
        this.type_of_emloyee=type;
    }
    public String getType(){
        return  this.type_of_emloyee;
    }
    public void setNewSalary(double perc){
        double incre=salary*perc/100;
        this.salary+=incre;
    }
    public boolean isManager(){
        boolean type=false;
    if (type_of_emloyee.equals("manager")){ type=true;
     }  
        return type;
    }
    public String toString(){
        return "الموظف "+"("+getType()+")"+getName()+" "+"("+grtID()+")"+"مرتب"+getSalary()+"ري.";
    }
}