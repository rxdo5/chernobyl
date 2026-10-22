package chernobyl;

public class Scientific extends Operator{

    public Scientific(){
        super();
    }

    public Scientific(String name,int turn,int currentCellId,char marker){
        super(name,turn,currentCellId,marker);
    }

    @Override

    public void performActions(){
        System.out.println("The scientific "+name+" is performing its actions...");
    }

    public String toString(){
        return "Científico"+super.toString()+"}";
    }

}
