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
        System.out.println("Minero "+name+" performing its actions...");
    }

    public String toString(){
        return "Minero"+super.toString()+"}";
    }

}
