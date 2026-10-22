package chernobyl;

public abstract class Operator extends Character { // This will be father of Miner, Firefighter and Scientific

    private boolean spotted;

    public Operator(){
        super();
    }

    public Operator(String name,int turn,int currentCellId,char marker){
        super(name,turn,currentCellId,marker);
        spotted=false;
    }

    public abstract void performActions();

    // SETTERS

    public void setSpotted(boolean spotted) {
        this.spotted = spotted;
    }

    //GETTERS

    public boolean getSpotted(){
        return spotted;
    }

    @Override

    public String toString(){
        return super.toString()+", reconocido="+getSpotted();
    }

}
