package chernobyl;

public class Main {

    public static void main(String[] args) {

//OPERADORES NUCLEARES
        Character p1 = new Scientific("Legásov", 1, 10, 'L');
        Character p2 = new Scientific("Shcherbina", 2, 1, 'S');
        Character p3 = new Miner("Glújov", 4, 0, 'G');
        Character p4 = new Firefighter();
        p4.setName("Ignatenko");
        p4.setTurn(7);
        p4.setCurrentCellId(12);
        p4.setMarker('I');

//KGB
        Character p5 = new Officer("Vladimir", 1, 11, 'V');
        Character p6 = new Volunteer("Yuri", 1, 34, 'Y');
        Character p7 = new Volunteer("Anatoli", 1, 35, 'T');

//LLAVES
        Key llave1 = new Key(1/*"001"*/, 31);
        Key llave2 = new Key(2/*"002"*/, 44);

//MOSTRANDOINFORMACIÓN
        System.out.println(""); //Línea en blanco
        System.out.println("OPERADORES NUCLEARES");
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());
        System.out.println(""); //Línea en blanco
        System.out.println("KGB");
        System.out.println(p5.toString());
        System.out.println(p6.toString());
        System.out.println(p7.toString());
        System.out.println(""); //Línea en blanco
        System.out.println("LLAVES");
        System.out.println(llave1.toString());
        System.out.println(llave2.toString());
        System.out.println(""); //Línea en blanco
        System.out.println("SIMULACIÓN");
        p1.performActions();
        p2.performActions();
        p3.performActions();
        p4.performActions();
        p5.performActions();
        p6.performActions();
        p7.performActions();
    }

}
