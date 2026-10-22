package chernobyl;

public class Volunteer extends Kgb{

    public Volunteer(){
        super();
    }

    public Volunteer(String name,int turn,int currentCellId,char marker){
        super(name,turn,currentCellId,marker);
    }

    @Override

    public void performActions(){
        System.out.println("The volunteer "+name+" is performing its actions...");
    }

    public String toString(){
        return "Voluntario"+super.toString()+"}";
    }

}
