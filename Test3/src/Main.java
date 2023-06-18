import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Beyblade programına goş geldiniz..");
        System.out.println("çıkış için q ya basınız...");

        Scanner scanner = new Scanner(System.in);

        while(true){

            System.out.println("hangi beyblade i üretmek istiyorsunuz ? ");
            String islem = scanner.nextLine();

            if (islem.equals("q")){

                System.out.println("sistemden çıkılıyor.");
                break;
            }
            else {
                BeybladeFabrikasi fabrika = new BeybladeFabrikasi();

                Beyblade beyblade = fabrika.beybladeUret(islem);

                if(beyblade == null){

                    System.out.println("lütfen geçerli bir beyblade ismi giriniz.");
                }

                else {
                    beyblade.bilgileriGoster();
                    beyblade.saldir();
                    beyblade.kutsalCanavarOrtayaCıkar();
                }



            }
        }


    }
}