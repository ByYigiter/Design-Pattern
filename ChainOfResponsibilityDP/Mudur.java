package BehavioralDP.ChainOfResponsibilityDP;

public class Mudur extends Approver{

    public Mudur(Approver chief) {
        super(chief);
    }

    @Override
    boolean approveLoan(int amount) {
        if (amount<500){
            System.out.println("Mudur approval");
            System.out.println("**".repeat(50));
        }
        else if (chief!=null){
            System.out.println("miktar mudurun onaylama sınırı dışında Şefe yönlendiriliyorsunuz");
            return chief.approveLoan(amount);

        }

        return false;
    }
}
