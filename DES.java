import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.spec.InvalidKeySpecException;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.CipherOutputStream;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.swing.*;
public class DES
{
    String mod;
    static int flag=0;
public static void encryptDecrypt(String key, int cipherMode, File in, File out)
throws InvalidKeyException, NoSuchAlgorithmException, InvalidKeySpecException,
NoSuchPaddingException, IOException
{
 FileInputStream fis = new FileInputStream(in);
 FileOutputStream fos = new FileOutputStream(out);
 DESKeySpec desKeySpec = new DESKeySpec(key.getBytes());
SecretKeyFactory skf = SecretKeyFactory.getInstance("DES");
SecretKey secretKey = skf.generateSecret(desKeySpec);
Cipher cipher = Cipher.getInstance("DES/ECB/PKCS5Padding");

if(cipherMode == Cipher.ENCRYPT_MODE)
{
 cipher.init(Cipher.ENCRYPT_MODE,secretKey,SecureRandom.getInstance("SHA1PRNG"));
 CipherInputStream cis = new CipherInputStream(fis, cipher);
write(cis,fos);
}
else if(cipherMode == Cipher.DECRYPT_MODE)
{
 cipher.init(Cipher.DECRYPT_MODE,secretKey,SecureRandom.getInstance("SHA1PRNG"));
 CipherOutputStream cos = new CipherOutputStream(fos, cipher);
write(fis,cos);
}
}
private static void write(InputStream in, OutputStream out) throws IOException
{
byte[] buffer=new byte[64];
int numofBytesRead;
while((numofBytesRead=in.read(buffer))!=-1)
{
out.write(buffer,0,numofBytesRead);
}
out.close();
in.close();
}
public DES(String str)
{
    mod=str;
}
public DES(String str,String mod,String ex)
{
    this.mod=mod;
    String s= new String();
    JFrame f= new JFrame();
    try{
        //File rakesh = new File("c:\\xxxxyyyy.txt");
        File plaintext = new File(str);
        File encrypted;
      encrypted = new File(str.substring(0,str.length()-4)+"encry."+ex);
      File decrypted;
      decrypted = new File(str.substring(0,str.length()-4)+"decry."+ex);
      if(this.mod.equals("encryption")){
      encryptDecrypt("12345678",Cipher.ENCRYPT_MODE,plaintext,encrypted);
      JOptionPane.showMessageDialog(f,"file encrypted");}
      else if(this.mod.equals("decrypted")){
      encryptDecrypt("12345678",Cipher.DECRYPT_MODE,plaintext,decrypted);
      JOptionPane.showMessageDialog(f,"file decrypted");}
    }
    catch(FileNotFoundException e)
    {
        
        JOptionPane.showMessageDialog(f,"file not found");
    }
catch(InvalidKeyException | NoSuchAlgorithmException | InvalidKeySpecException | NoSuchPaddingException | IOException e)
{
e.printStackTrace();
}
    
}
public static void main(String[] args)
{
    
}

 
    DES() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}







