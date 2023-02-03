package StructuralDP.FacadeDP;

public class CustomEncryptor {

    public static void main(String[] args) {
        String text ="Content";// kullanıcını şifrelemsini istediği text

        // kotu kod
        AESEncryptor aesEncryptor=new AESEncryptor();
        aesEncryptor.encrypt(text);

        MD5Encryptor md5Encryptor = new MD5Encryptor();
        md5Encryptor.encrypt(text,"SecretKey");// gereksiz yere faladan key değerşeri almıyoruz

        SHAEncryptor shaEncryptor   = new SHAEncryptor();
        shaEncryptor.encrypt(text,"SecretKey",true);
        // ********************************

        System.out.println("**".repeat(50));
        EncryptorFacade encryptorFacade = new EncryptorFacade();// yukarıdaki ile ayynı işi yapaıyor ancak 3 tane new yapmıyoryz
        encryptorFacade.encrypt(text, EncryptorFacade.EncType.MD5);


    }
}
