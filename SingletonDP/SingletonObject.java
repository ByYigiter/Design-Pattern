package CreationalDP.SingletonDP;

public class SingletonObject {

    String message ="Merhaba";
    private static SingletonObject instance = new SingletonObject();

    // eger constructor private yapılırsa bu demektirki new leme yapılmaasın
    private SingletonObject(){ };// private yaptık artık başka classdan new yapamayız bu satır bunu yaptı
    public static SingletonObject getInstance(){// bu method static yaparak obje uretmeyi new demeden gelir
        return instance;// içinde inctance çağırır oda kendi içinde private olan bir yeni SingletonObject uretir ***
    }

    public void changeMessage(){
        this.message=this.message +" yigit er";
    }
}
