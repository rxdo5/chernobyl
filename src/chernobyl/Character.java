package chernobyl;

public abstract class Character /*extends Object*/ {

    String name;
    int turn;
    int currentCellId;
    char marker;

    public Character(){
    }

    public Character(String name,int turn,int currentCellId,char marker){
        this.name=name;
        this.turn=turn;
        this.currentCellId=currentCellId;
        this.marker=marker;
    }

    public abstract void performActions();

    public void move(){
        System.out.println(name+" se esta moviendo...");
    }

    // SETTERS

    public void setName(String name) {
        this.name = name;
    }

    public void setTurn(int turn) {
        this.turn = turn;
    }

    public void setCurrentCellId(int currentCellId) {
        this.currentCellId = currentCellId;
    }

    public void setMarker(char marker) {
        this.marker = marker;
    }

    // GETTERS

    public String getName() {
        return name;
    }

    public int getTurn() {
        return turn;
    }

    public int getCurrentCellId() {
        return currentCellId;
    }

    public char getMarker() {
        return marker;
    }

    @Override
    public String toString() {
        return "{nombre="+getName()+", turno="+getTurn()+", idCeldaActual="+getCurrentCellId()+", marca="+getMarker();
    }



}
