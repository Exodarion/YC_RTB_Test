package archief;

public class Polymorphism {
    public static void main(String[] args) {
        Dier dier = new Konijn();
        Dier dier2 = new Wolf();
        dier2.voortbewegen();   // polymorfisme - runtimebinding - virtual method invocation -late binding  
        new Asiel().opnemen(new WinterHaas());
        Tembaar t = new Konijn();
        t.temmen();
    }
}

interface Tembaar{
    void temmen();
}




// private default-packageprivate   protected public
class Konijn extends Dier implements Tembaar{ 
    
    public void temmen() {
        System.out.println("sdafa");
    }
    int oorLengte;
    void voortbewegen() {  
        System.out.println("voortbewegen in konijn");
    }
    void wortelsKnagen() {
        System.out.println("knagen in konijn");
    }
}




abstract class Dier{   // state 
    int leeftijd;
    String biologischeNaam;    
    abstract void voortbewegen();
    Dier(){
        System.out.println("c in dier");
    }
}
class Wolf extends Dier{
    
    Wolf(){
        //super(5);
        System.out.println("c in wolf");
    }
    
    void voortbewegen() {
        System.out.println("voortbewegen in wolf");
    }
}



class WinterHaas extends Konijn{  // 
    void voortbewegen() {
        System.out.println("voortbewegen in winterhaas");
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
// override     4 regels 
//1 signature hetzelfde 
//2 returntype moet covariant 
//3 acess niet vernauwen 
//4 covariant throwsen of niets
