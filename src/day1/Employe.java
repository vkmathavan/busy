package day1;

public class Employe extends salary{
   private String name;
   private String jobdescription;

   public void setName(){
       this.name=name;
   }

   public String getName(){
       return name;


   }
   public void setJobdescription(){
       this.jobdescription=jobdescription;
   }

   public String getJobdescription(){

       return jobdescription;
    }
    public void getdata(String name,String jobdescription,int salary){
       this.name=name;
       this.jobdescription=jobdescription;
       this.salary=salary;
    }
    public void print(){
        System.out.println("Name is:"+ name);
        System.out.println("jobdescription is:"+jobdescription);
        System.out.println("salary is:"+salary);
    }

}
