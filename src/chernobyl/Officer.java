package chernobyl;

public abstract class Officer extends Kgb{

    public Officer(){
        super();
    }

    public Officer(String name,int turn,int currentCellId,char marker){
        super(name,turn,currentCellId,marker);
    }

    @Override

    public void performActions(){
        System.out.println("The officer "+name+" is performing its actions...");
    }

    public String toString(){
        return "Oficial"+super.toString()+"}";
    }

}
