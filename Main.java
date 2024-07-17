import java.util.*;
import java.awt.Color;
import java.awt.Font;
import java.io.File;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextPane;
import javax.swing.text.BadLocationException;
import javax.swing.text.Style;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;
import java.io.FileNotFoundException;

class insan {
    String id,dogum,esi,anne,baba,kan,meslek,meden,kizlik,cins,isim,soyisim;
    insan(){

    }
    insan(String m,String m1,String m2,String m3,String m4,String m5,String m6,String m7,String m8,String m9,String m10,String m11){
        id=m;
        isim=m1;
        soyisim=m2;
        dogum=m3;
        esi=m4;
        anne=m5;
        baba=m6;
        kan=m7;
        meslek=m8;
        meden=m9;
        kizlik=m10;
        cins=m11;

    }
}

public class mainn {
    public static void main(String[] args) throws FileNotFoundException{

        JTextPane textPane = new JTextPane();
        textPane.setBounds(0,0,1500,850);
        textPane.setVisible(true);
        StyledDocument doc = textPane.getStyledDocument();
        Style style = textPane.addStyle("I'm a Style", null);
        StyleConstants.setForeground(style, Color.RED);

        JFrame frame = new JFrame();
        Font font = new Font("Verdana", Font.BOLD, 18);
        textPane.setFont(font);

        int eleman = 0;

        frame.getContentPane().add(textPane);
        frame.setSize(1500,850);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        String[] Kisi = new String[600]; 
        insan[] insanlar=new insan[100];
        int kisisay=0,kontrol=0,kontrol2=0;
        int say=0,kosul=0;
        File belge=new File("Test.csv");
        if(belge.exists()){
            System.out.println("Belge var.");
        }
        else{
            System.out.println("Belge yok");
        }
        Scanner s =new Scanner(belge);
        while(s.hasNextLine()){
            String satir=s.nextLine();
            String[] split = satir.split(";");
            for(int i=0;i<split.length;i++){
                Kisi[kisisay]=split[i];
                System.out.println(split[i]+" ");
                kisisay++;
                kontrol++;
            }
            if(kontrol>12){
                kontrol2=kisisay-12;
                for(int m1=0;m1<say;m1++){
                    String kos1=Kisi[kontrol2];
                    String kos2=insanlar[m1].id;
                        if(kos1.equals(kos2)){
                            System.out.println(Kisi[kontrol2]);
                            System.out.println("Girdiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii--------------------");
                            kosul=1;
                        }
                }
                if(kosul==0){
                insanlar[say]=new insan(Kisi[kontrol2],Kisi[kontrol2+1],Kisi[kontrol2+2],Kisi[kontrol2+3],Kisi[kontrol2+4],Kisi[kontrol2+5],Kisi[kontrol2+6],Kisi[kontrol2+7],Kisi[kontrol2+8],Kisi[kontrol2+9],Kisi[kontrol2+10],Kisi[kontrol2+11]);
                say++;
                }
                kosul=0;
            }
        }
        kontrol=0;
        File belge1=new File("Test1.csv");
        if(belge1.exists()){
            System.out.println("Belge var.");
        }
        else{
            System.out.println("Belge yok");
        }
        Scanner s1 =new Scanner(belge1);
        while(s1.hasNextLine()){
            String satir=s1.nextLine();
            String[] split = satir.split(";");
            for(int i=0;i<split.length;i++){
                Kisi[kisisay]=split[i];
                System.out.println(split[i]+" ");
                kisisay++;
                kontrol++;
            }
            if(kontrol>12){
                kontrol2=kisisay-12;
                for(int m1=0;m1<say;m1++){
                    String kos1=Kisi[kontrol2];
                    String kos2=insanlar[m1].id;
                        if(kos1.equals(kos2)){
                            System.out.println(Kisi[kontrol2]);
                            System.out.println("Girdiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii--------------------");
                            kosul=1;
                        }
                }
                if(kosul==0){
                insanlar[say]=new insan(Kisi[kontrol2],Kisi[kontrol2+1],Kisi[kontrol2+2],Kisi[kontrol2+3],Kisi[kontrol2+4],Kisi[kontrol2+5],Kisi[kontrol2+6],Kisi[kontrol2+7],Kisi[kontrol2+8],Kisi[kontrol2+9],Kisi[kontrol2+10],Kisi[kontrol2+11]);
                say++;
                }
                kosul=0;
            }
        }
        kontrol=0;
        File belge2=new File("Test2.csv");
        if(belge2.exists()){
            System.out.println("Belge var.");
        }
        else{
            System.out.println("Belge yok");
        }
        Scanner s2 =new Scanner(belge2);
        while(s2.hasNextLine()){
            String satir=s2.nextLine();
            String[] split = satir.split(";");
            for(int i=0;i<split.length;i++){
                Kisi[kisisay]=split[i];
                System.out.println(split[i]+" ");
                kisisay++;
                kontrol++;
            }
            if(kontrol>12){
                kontrol2=kisisay-12;
                for(int m1=0;m1<say;m1++){
                    String kos1=Kisi[kontrol2];
                    String kos2=insanlar[m1].id;
                        if(kos1.equals(kos2)){
                            System.out.println(Kisi[kontrol2]);
                            System.out.println("Girdiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii--------------------");
                            kosul=1;
                        }
                }
                if(kosul==0){
                insanlar[say]=new insan(Kisi[kontrol2],Kisi[kontrol2+1],Kisi[kontrol2+2],Kisi[kontrol2+3],Kisi[kontrol2+4],Kisi[kontrol2+5],Kisi[kontrol2+6],Kisi[kontrol2+7],Kisi[kontrol2+8],Kisi[kontrol2+9],Kisi[kontrol2+10],Kisi[kontrol2+11]);
                say++;
                }
                kosul=0;
            }
        }
        kontrol=0;
        File belge3=new File("Test3.csv");
        if(belge3.exists()){
            System.out.println("Belge var.");
        }
        else{
            System.out.println("Belge yok");
        }
        Scanner s3 =new Scanner(belge3);
        while(s3.hasNextLine()){
            String satir=s3.nextLine();
            String[] split = satir.split(";");
            for(int i=0;i<split.length;i++){
                Kisi[kisisay]=split[i];
                System.out.println(split[i]+" ");
                kisisay++;
                kontrol++;
            }
            if(kontrol>12){
                kontrol2=kisisay-12;
                for(int m1=0;m1<say;m1++){
                    String kos1=Kisi[kontrol2];
                    String kos2=insanlar[m1].id;
                        if(kos1.equals(kos2)){
                            System.out.println(Kisi[kontrol2]);
                            System.out.println("Girdiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii--------------------");
                            kosul=1;
                        }
                }
                if(kosul==0){
                insanlar[say]=new insan(Kisi[kontrol2],Kisi[kontrol2+1],Kisi[kontrol2+2],Kisi[kontrol2+3],Kisi[kontrol2+4],Kisi[kontrol2+5],Kisi[kontrol2+6],Kisi[kontrol2+7],Kisi[kontrol2+8],Kisi[kontrol2+9],Kisi[kontrol2+10],Kisi[kontrol2+11]);
                say++;
                }
                kosul=0;
            }
        }
        System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
            for(int ml=0;ml<say;ml++){
                System.out.println(insanlar[ml].id);
                System.out.println(insanlar[ml].isim);
            }
            System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
            System.out.println("---------------------------------------------------------");
            
        s.close();
        s1.close();
        s2.close();
        s3.close();
        int menu=0,menusec=0;
        
        while(menu==0){
            String kos3;
            String kos8;
            String kos9;
            String kos4;
            String kos7;
            int kos5=0,kos10;
            int day=0,day1=0,day2=0;
            
            //menü gelecek
            String girdi5=JOptionPane.showInputDialog(null, "1-Ayni isime sahip kisilerin yasları\n2-Kan grubu sorgulama\n3-Soyundaki meslegi devam ettirenleri sorgulama");
            eleman = Integer.parseInt(girdi5);

            System.out.println("Yapmak istediginiz islemi seciniz:");
            System.out.println("1-Ayni isime sahip kisilerin yasları");
            System.out.println("2-Kan grubu sorgulama");
            System.out.println("3-Soyundaki meslegi devam ettirenleri sorgulama");
            menusec = eleman;
            switch(menusec){
                case 1:
                textPane.setText("");
                    for(int k=0;k<say;k++){
                        for(int n=k+1;n<say;n++){
                            if(insanlar[k].isim.equals(insanlar[n].isim)){
                                kos3=insanlar[k].dogum;
                                kos7=insanlar[n].dogum;
                                if(insanlar[k].dogum.length()==9){
                                    kos4=kos3.substring(5, 9);
                                    kos5=Integer.valueOf(kos4);
                                    day=2022-kos5;
                                }
                                if(insanlar[k].dogum.length()==10){
                                    kos4=kos3.substring(6, 10);
                                    kos5=Integer.valueOf(kos4);
                                    day=2022-kos5;
                                }
                                if(insanlar[n].dogum.length()==9){
                                    kos4=kos7.substring(5, 9);
                                    kos5=Integer.valueOf(kos4);
                                    day1=2022-kos5;
                                }
                                if(insanlar[n].dogum.length()==10){
                                    kos4=kos7.substring(6, 10);
                                    kos5=Integer.valueOf(kos4);
                                    day1=2022-kos5;
                                }

                                if(insanlar[k].cins.equals("Erkek")){
                                    StyleConstants.setForeground(style, Color.BLUE);
                                    try { doc.insertString(doc.getLength(), insanlar[k].isim+" "+insanlar[k].soyisim+" "+day+"\n",style); }
                                    catch (BadLocationException e){}
                                }
                                else{
                                    StyleConstants.setForeground(style, Color.RED);
                                    try { doc.insertString(doc.getLength(), insanlar[k].isim+" "+insanlar[k].soyisim+" "+day+"\n",style); }
                                    catch (BadLocationException e){}
                                }
                                if(insanlar[k].cins.equals("Erkek")){
                                    StyleConstants.setForeground(style, Color.BLUE);
                                    try { doc.insertString(doc.getLength(), insanlar[n].isim+" "+insanlar[n].soyisim+" "+day1+"\n",style); }
                                    catch (BadLocationException e){}
                                }
                                else{
                                    StyleConstants.setForeground(style, Color.RED);
                                    try { doc.insertString(doc.getLength(), insanlar[n].isim+" "+insanlar[n].soyisim+" "+day1+"\n",style); }
                                    catch (BadLocationException e){}
                                }

                                    StyleConstants.setForeground(style, Color.BLACK);
                                    try { doc.insertString(doc.getLength(), "---------------------------------------------------------\n",style); }
                                    catch (BadLocationException e){}
                                
                                System.out.println("---------------------------------------------------------");
                                System.out.println(insanlar[k].isim+" "+insanlar[k].soyisim+day);
                                System.out.println(insanlar[n].isim+" "+insanlar[n].soyisim+day1);
                                System.out.println("---------------------------------------------------------");
                            }
                        }
                    }
                    break;
                case 2:
                    textPane.setText("");
                    //kullanıcıdan input al
                    String girdi6=JOptionPane.showInputDialog(null, "Istediginiz kan grubunu giriniz:");
                    System.out.println("Istediginiz kan grubunu giriniz:");
                    for(int m=0;m<say;m++){
                        if(girdi6.equals(insanlar[m].kan)){
                            if(insanlar[m].cins.equals("Erkek")){
                                StyleConstants.setForeground(style, Color.BLUE);
                                try { doc.insertString(doc.getLength(), insanlar[m].isim+" "+insanlar[m].soyisim+" "+insanlar[m].meslek+" "+insanlar[m].meden+" "+insanlar[m].cins+"\n",style); }
                                catch (BadLocationException e){}
                            }
                            else{
                                StyleConstants.setForeground(style, Color.RED);
                                try { doc.insertString(doc.getLength(), insanlar[m].isim+" "+insanlar[m].soyisim+" "+insanlar[m].meslek+" "+insanlar[m].meden+" "+insanlar[m].cins+"\n",style); }
                                catch (BadLocationException e){}
                            }
                                StyleConstants.setForeground(style, Color.BLACK);
                                try { doc.insertString(doc.getLength(), "---------------------------------------------------------\n",style); }
                                catch (BadLocationException e){}
                            System.out.println(insanlar[m].isim+" "+insanlar[m].soyisim+" "+insanlar[m].meslek+" "+insanlar[m].meden+" "+insanlar[m].cins);
                            System.out.println("----------------------------------------");
                        }
                    }
                    break;
                case 3:
                textPane.setText("");
                int mlk=0;
                int mlk1=0;
                String kang;
                String kang1;
                String kang2;
                String kang3;
                    for(int i=0;i<say;i++){
                        kos3=insanlar[i].dogum;
                        if(insanlar[i].dogum.length()==9){
                            kos4=kos3.substring(5, 9);
                            kos5=Integer.valueOf(kos4);
                            day=2022-kos5;
                        }
                        if(insanlar[i].dogum.length()==10){
                            kos4=kos3.substring(6, 10);
                            kos5=Integer.valueOf(kos4);
                            day=2022-kos5;
                        }
                            for(int m=0;m<say;m++){
                                kang = insanlar[m].anne;
                                kang2=insanlar[m].anne+" "+insanlar[m].soyisim;
                                    for(mlk1=0;mlk1<say;mlk1++){
                                        if(insanlar[mlk1].isim.equals(insanlar[m].anne)&&insanlar[mlk1].kizlik!=null){
                                            kang +=" "+insanlar[mlk1].kizlik;

                                            break;
                                        }
                                    }
                                
                                kos7=insanlar[m].dogum;
                                    if(insanlar[m].dogum.length()==9){
                                        kos4=kos7.substring(5, 9);
                                        kos5=Integer.valueOf(kos4);
                                        day1=2022-kos5;
                                    }
                                    if(insanlar[m].dogum.length()==10){
                                        kos4=kos7.substring(6, 10);
                                        kos5=Integer.valueOf(kos4);
                                        day1=2022-kos5;
                                    }
                                if((insanlar[m].anne.equals(insanlar[i].esi)||kang.equals(insanlar[i].esi)||kang2.equals(insanlar[i].esi))&&insanlar[m].baba.equals(insanlar[i].isim) && insanlar[m].soyisim.equals(insanlar[i].soyisim)&&insanlar[m].meslek.equals(insanlar[i].meslek)&&day1<day){
                                    for(int l=0;l<say;l++){
                                        kang1=insanlar[l].anne;
                                        kang3=insanlar[m].anne+" "+insanlar[m].soyisim;
                                        for(mlk=0;mlk<say;mlk++){
                                            if(insanlar[mlk].isim.equals(insanlar[l].anne)&&insanlar[mlk].kizlik!=null){
                                                kang1+=" "+insanlar[mlk].kizlik;

                                                break;
                                            }
                                        }
                                        
                                    kos8=insanlar[l].dogum;
                                    if(insanlar[l].dogum.length()==9){
                                        kos9=kos8.substring(5, 9);
                                        kos10=Integer.valueOf(kos9);
                                        day2=2022-kos10;
                                    }
                                    if(insanlar[l].dogum.length()==10){
                                        kos9=kos8.substring(6, 10);
                                        kos10=Integer.valueOf(kos9);
                                        day2=2022-kos10;
                                    }
                                    
                                        if((insanlar[l].anne.equals(insanlar[m].esi)||kang1.equals(insanlar[m].esi)||kang3.equals(insanlar[m].esi))&&insanlar[l].baba.equals(insanlar[m].isim)&&insanlar[l].soyisim.equals(insanlar[m].soyisim)&&insanlar[l].meslek.equals(insanlar[m].meslek)&&day2<day1){
                                            //alttakileri ekrana yazdır
                                            System.out.println(insanlar[l].isim+" "+insanlar[l].soyisim+" "+"Dede meslegini devam ettiriyor");
                                            System.out.println("Dede:"+insanlar[i].isim+" "+insanlar[i].soyisim);
                                            System.out.println("Meslek:"+insanlar[l].meslek);
                                            System.out.println("----------------------------------------------------------");

                                                StyleConstants.setForeground(style, Color.BLUE);
                                                try { doc.insertString(doc.getLength(), insanlar[l].isim+" "+insanlar[l].soyisim+" "+"Dede meslegini devam ettiriyor\n",style); }
                                                catch (BadLocationException e){}

                                                StyleConstants.setForeground(style, Color.BLUE);
                                                try { doc.insertString(doc.getLength(), "Dede:"+insanlar[i].isim+" "+insanlar[i].soyisim+"\n",style); }
                                                catch (BadLocationException e){}

                                                StyleConstants.setForeground(style, Color.BLUE);
                                                try { doc.insertString(doc.getLength(), "Meslek:"+insanlar[l].meslek+"\n",style); }
                                                catch (BadLocationException e){}
                                            
                                                StyleConstants.setForeground(style, Color.BLACK);
                                                try { doc.insertString(doc.getLength(), "---------------------------------------------------------\n",style); }
                                                catch (BadLocationException e){}
                                        }
                                    }
                                    //alttakileri ekrana yazdır
                                                StyleConstants.setForeground(style, Color.BLUE);
                                                try { doc.insertString(doc.getLength(), insanlar[m].isim+" "+insanlar[m].soyisim+" "+"Baba meslegini devam ettiriyor\n",style); }
                                                catch (BadLocationException e){}

                                                StyleConstants.setForeground(style, Color.BLUE);
                                                try { doc.insertString(doc.getLength(), "Baba:"+insanlar[i].isim+" "+insanlar[i].soyisim+"\n",style); }
                                                catch (BadLocationException e){}

                                                StyleConstants.setForeground(style, Color.BLUE);
                                                try { doc.insertString(doc.getLength(), "Meslek:"+insanlar[m].meslek+"\n",style); }
                                                catch (BadLocationException e){}
                                            
                                                StyleConstants.setForeground(style, Color.BLACK);
                                                try { doc.insertString(doc.getLength(), "---------------------------------------------------------\n",style); }
                                                catch (BadLocationException e){}
                                    System.out.println(insanlar[m].isim+" "+insanlar[m].soyisim+" "+"Baba meslegini devam ettiriyor");
                                    System.out.println("Baba:"+insanlar[i].isim+" "+insanlar[i].soyisim);
                                    System.out.println("Meslek:"+insanlar[m].meslek);
                                    System.out.println("----------------------------------------------------------");
                                    
                                }
                            
                            }
                        
                    }

                    break;
                case 0:
                    break;
            }
        }

    }
}
