package StructuralDP.DecoratorDP;

public class Iphone11ProMax extends Iphone11Pro{
    public Iphone11ProMax(IPhone basicPhone) {
        super(basicPhone);
    }

    @Override
    public String getName() {
        return super.getName()+"Max";// phoneDecaratoreden alındaydı 3 methoduda eklem yapmamız lazımdı son modeldende extend ederek kullandık
    }

    @Override
    public double getPrice() {
        return super.getPrice()+ 1000;
    }

    public  String extraMethod() { // yeni bir ozellik bu telefona ekleme yapabiliriz
        return "Gold Color";

    }
}
