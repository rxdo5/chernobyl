package chernobyl;

public abstract class Kgb extends Character{

    public Kgb() {
        super();
    }

    public Kgb(String name,int turn,int currentCellId,char marker) {
        super(name,turn,currentCellId,marker);
    }

    public abstract void performActions();

    public void spot() {
        System.out.println(name+" is spotting a new nuclear operator...");
    }

}
