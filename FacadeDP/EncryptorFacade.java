package StructuralDP.FacadeDP;

public class EncryptorFacade {


    private AESEncryptor aesEncryptor = new AESEncryptor();
    private MD5Encryptor md5Encryptor = new MD5Encryptor();
    private SHAEncryptor shaEncryptor = new SHAEncryptor();

    public void encrypt(String text, EncType encType){// tercih kısmını enum ile kısıtlama yağptık

        switch (encType){
            case AES: aesEncryptor.encrypt(text);
            break;
            case MD5: md5Encryptor.encrypt(text,"KEY");
            break;
            case SHA: shaEncryptor.encrypt(text,"KEY",true);
            break;
            default: throw new IllegalStateException(encType.toString());
        }


    }

    public  enum EncType {

        SHA,
        MD5,
        AES
    }
}
