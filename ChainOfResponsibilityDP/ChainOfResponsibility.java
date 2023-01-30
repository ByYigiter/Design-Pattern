package BehavioralDP.ChainOfResponsibilityDP;

public class ChainOfResponsibility {
    public static void main(String[] args) {
        ChainOfResponsibility  chainOfResponsibility = new ChainOfResponsibility();
        chainOfResponsibility.chainOfResponsibilityDemo();
    }

    void chainOfResponsibilityDemo(){

        Approver genelMudur =new GenelMudur();
        Approver mudur =new Mudur(genelMudur);
        Approver memur =new Memur(mudur);

        System.out.println("Kredi verme limitleri : ");
        System.out.println( "memur için max : 100");
        System.out.println( "Mudur için max : 500");
        System.out.println( "Genel Mudur için max : unlimited");
        System.out.println("**".repeat(50));
        System.out.println("istenen limit : 50" );
        memur.approveLoan(50);
        System.out.println("**".repeat(50));
        System.out.println("istenen limit : 450" );
        memur.approveLoan(450);
        System.out.println("**".repeat(50));
        System.out.println("istenen limit : 1050" );
        memur.approveLoan(1050);

    }
}
