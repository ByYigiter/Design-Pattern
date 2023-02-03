package StructuralDP.DecoratorDP;

public class PhoneDecorator implements Phone{

    protected  Phone basicPhone;// burada sol tarafa en ust class yada interface yazmak gertekir alt class değişirse hata alma olasılığı var
    // **  constructor


    public PhoneDecorator(IPhone basicPhone) { // burada concrete class fieldlarına ulaşmak için concrete class yazılmalı
        this.basicPhone = basicPhone;
    }

    @Override
    public String getName() {
        return basicPhone.getName();
    }

    @Override
    public int cameraCount() {
        return basicPhone.cameraCount();
    }

    @Override
    public double getPrice() {
        return basicPhone.getPrice();
    }
}
