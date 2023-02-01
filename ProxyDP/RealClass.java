package StructuralDP.ProxyDP;

public class RealClass implements ImageGenerator{

    private String fullPath;

    public RealClass(String fullPath) {
        this.fullPath = fullPath;
    }

    @Override
    public void showImage() {
        System.out.println("resim gösteriliyor ..." + fullPath);
    }

    // normalde bu gib 100 tane method lar kullanılmayacka bu nun cozumu proxx class ile cözeriz
    public  void  changeImage(){
    }

    public  void changeFormatOfImage() {

    }


}
