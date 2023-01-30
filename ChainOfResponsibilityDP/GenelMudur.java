package BehavioralDP.ChainOfResponsibilityDP;

public class GenelMudur extends Approver{
    public GenelMudur() {
        super(null);
    }

    @Override
    boolean approveLoan(int amount) {

            System.out.println("Genel Müdür approval");
            System.out.println("**".repeat(50));

       return true;

    }
}
