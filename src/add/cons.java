package add;

public class cons {
    String name;

    String depart;

    public cons(String name , String depart){
        this.name= name;
        this.depart=depart;
    }
    public void printer(){
        System.out.println("name is :" + name);
        System.out.println("depart is :"+ depart);

    }
}
