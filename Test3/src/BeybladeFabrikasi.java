public class BeybladeFabrikasi {
    public Beyblade beybladeUret(String beyblade_turu){
        if(beyblade_turu.equals("Dragon")){
            return new Dragon("Takao",800,300,"mavi ejderha","kutsal cabavarla konuşma");
        }
        else if (beyblade_turu.equals("Dranza")){
            return new Dranza("Kai",600,400,"kırmızı anka kuşu");
        }
        else if(beyblade_turu.equals("Drayga")){
            return new Dranza("rei",800,250,"beyaz kaplan");
        }
        else if(beyblade_turu.equals("Draciel")){
            return new Dranza("max",400,1000,"kara kaplunbağa");
        }
        else {
            return null;
        }
    }
}
