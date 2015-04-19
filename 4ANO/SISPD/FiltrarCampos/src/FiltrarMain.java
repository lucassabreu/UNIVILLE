import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;


public class FiltrarMain {

    public static void main(String[] args) throws Exception {
        
        String s = "/media/Dados/Documents/workspace/UNIVILLE/4ANO/SISPD/ENEM/";
        String d = null;
        
        byte[] b = new byte[1180];
        
        //BufferedReader br = new BufferedReader(new FileInputStream(file));
        File in = new File(s + "DADOS_ENEM_SUL_2011.txt"); // new File(s + "microdados_enem2011/DADOS/DADOS_ENEM_2011.TXT");
        FileInputStream fis = new FileInputStream(in);
        
        File f = new File(s + "DADOS_ENEM_SUL_2011.txt");
        FileOutputStream fos = new FileOutputStream(f);

        System.out.println(f.getAbsolutePath());
        
        /*if (!f.exists()) {
            f.createNewFile();
        }*/
        
        //System.out.println(6349410080l);
        System.out.println(in.length() / b.length);
        
        int i = 0;
        double totalRead = 0;
        
        while(fis.available() > 0) {
            //i++;
            fis.read(b);
            
            totalRead += b.length;
            
            d = new String(new byte[]{b[530], b[531]});
            
            b = (new String(b).substring(0, 1179) + '\n').getBytes();
            System.out.println(d);
            
            /*if (d.equals("SC") || d.equals("PR") || d.equals("RS"))
                fos.write(b);*/
            
            System.out.printf("%.9f\n", totalRead / ((double) in.length()));
            
            //System.out.println(new String(b).subSequence(0, 1179));
        }
        
        fos.flush();
        fos.close();
    }
    
}
