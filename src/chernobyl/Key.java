package chernobyl;

public class Key {

    private int keyId;
    private int currentCell;

    public Key(){
    }

    public Key(int keyId,int currentCell){
        this.keyId=keyId;
        this.currentCell=currentCell;
    }

    // SETTERS

    public void setKeyId(int keyId) {
        this.keyId = keyId;
    }

    public void setCurrentCell(int currentCell) {
        this.currentCell = currentCell;
    }

    // GETTERS

    public int getKeyId() {
        return keyId;
    }

    public int getCurrentCell() {
        return currentCell;
    }

    @Override

    public String toString() {
        return "Llave{"+"idLlave="+getKeyId()+", celdaAct="+getCurrentCell()+"}";
    }

}
