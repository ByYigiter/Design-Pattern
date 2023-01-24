package CreationalDP.SingletonDP;

public class SingletonPatternDemo {
    public static void main(String[] args) {
        //SingletonObject obj1=new SingletonObject(); // hatayı gör
        SingletonObject obj2 =SingletonObject.getInstance(); // new olmadan obje oluşturduk
        System.out.println(obj2.message);
        obj2.changeMessage();// burada message değişimi yaptık ==> Merhaba yigit er

        SingletonObject obj3 =SingletonObject.getInstance();
        System.out.println("obje 3 için :" + obj3.message);// burada obj 3 cağirdık ama obj 2 geldi bunuda
                                                //message obj2 ile değişen geldi  ==> Merhaba yigit er


    }

}
