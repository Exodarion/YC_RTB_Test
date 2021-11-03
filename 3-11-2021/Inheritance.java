package archief;

public class Inheritance {
    public static void main(String[] args) {
        Dier dier1 = new WinterHaas();
        Konijn konijn = new Konijn();
        //Konijn konijn2 = new Dier();
        Dier dier2 = new Dier();
        konijn.leeftijd = 3;
        konijn.oorLengte = 4;
        dier2.leeftijd = 24;
    //    dier2.oorLengte = 5;
        dier1.leeftijd = 6;
    //    dier1.oorLengte = 6;
        OlieTanker ab = new OlieTanker();
        if(dier1 instanceof WinterHaas) {
            System.out.println("je een winterhaas");
            Konijn temp = (Konijn) dier1;
            temp.oorLengte = 9;
        }
        Asiel lief = new Asiel();
        lief.opnemen(new Konijn());
        lief.opnemen(new WinterHaas());
        lief.opnemen(new Dier());
        lief.opnemen(dier1);
        lief.opnemen(konijn);
//        lief.opnemen(ab);
//        lief.opnemen(new OlieTanker());
        System.out.println("het is gelukt");
    }
}
class Asiel{
    void opnemen(Dier hetDier) {
        System.out.println("opnemen in asiel");
    //    hetDier.oorLengte = 4;
        hetDier.voortbewegen();
    }
    
}
class OlieTanker{}

class Dier{    // Parent   Super Base
    int leeftijd;
    String biologischeNaam;    
    void voortbewegen() {
        System.out.println("voortbewegen in dier");        
    }
}
class Konijn extends Dier{   // Child    Sub
    int oorLengte;
    void wortelsKnagen() {
        System.out.println("knagen in konijn");
    }
}
class WinterHaas extends Konijn{  // 
    
}


// Is a relatie   Overerving  Covariant    RICHTING
