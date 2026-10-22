package chernobyl;

public abstract class Firefighter extends Operator {

    int coolingDeviceBattery;

    public Firefighter(){
        super();
        coolingDeviceBattery = 5;
    }

    public Firefighter(String name,int turn,int currentCellId,char marker){
        super(name,turn,currentCellId,marker);
        coolingDeviceBattery=5;
    }

    private void rechargeCoolingDevice(){
        coolingDeviceBattery=5;
    }

    public void cool(){
        System.out.println("The firefighter "+name+" is cooling the zone...");
    }

    // SETTERS

    public void setCoolingDeviceBattery(int coolingDeviceBattery) {
        this.coolingDeviceBattery = coolingDeviceBattery;
    }

    // GETTERS

    public int getCoolingDeviceBattery() {
        return coolingDeviceBattery;
    }

    @Override
    public String toString(){
        return "Bombero"+super.toString()+", cargaRefrigerador="+getCoolingDeviceBattery()+"}";
    }

}
