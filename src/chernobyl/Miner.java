package chernobyl;

public abstract class Miner extends Operator {

    public Miner(){
        super();
    }

    public Miner(String name,int turn,int currentCellId,char marker){
        super(name,turn,currentCellId,marker);
    }

    @Override

    public void performActions(){
        System.out.println("The miner "+name+" is performing its actions...");
    }

    public String toString(){
        return "Minero"+super.toString()+"}";
    }

}
