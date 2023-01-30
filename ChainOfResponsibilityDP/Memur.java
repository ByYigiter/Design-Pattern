package BehavioralDP.ChainOfResponsibilityDP;

public class Memur extends Approver{
    public Memur(Approver chief) {
        super(chief);
    }

    @Override
    boolean approveLoan(int amount) {
        if (amount<100){
            System.out.println("memur approval");
            System.out.println("**".repeat(50));
        }
        else if (chief!=null){
            System.out.println("miktar memurun onaylama sınırı dışında Şefe yönlendiriliyorsunuz");
            return chief.approveLoan(amount);

        }
        return false;
    }
}
