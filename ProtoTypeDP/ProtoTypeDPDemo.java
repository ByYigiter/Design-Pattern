package CreationalDP.ProtoTypeDP;

public class ProtoTypeDPDemo {

    public static void main(String[] args) {
        Soldier availableSoldier = new Soldier(100,45,
                                            20,50,80,2,"Kılıc",true);

        Soldier notAvailableSoldier = new Soldier(100,45,
                                            20,50,80,2,"Kılıc",false); //bu  sekilde değilde aşagıdakı gibi yap

        Soldier notAvailableSoldier2= availableSoldier.clone();// bu metot yeni bir obje dondurur onuda Soldier turnude asker e atama yap
        notAvailableSoldier2.setAvailableForWar(false);

        System.out.println("**".repeat(30));
        System.out.println("notAvailableSoldier için cıktı :");
                notAvailableSoldier.showSoldierInfo();// constructor ile yapılan obje

        System.out.println("**".repeat(30));
        System.out.println("notAvailableSoldier2 için cıktı :");
        notAvailableSoldier2.showSoldierInfo();// clonlama ile yapılan obje

    }
}
