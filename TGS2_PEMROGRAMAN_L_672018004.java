package tgs2_pemrograman_l_672018004;
import java.util.Scanner;
public class TGS2_PEMROGRAMAN_L_672018004 {
    public static void main (String[] args) {
    Scanner scan = new Scanner(System.in);
    int tinggi,tinggisegitiga,m,l,posisi,jumlah,pusat,simbol,awal,akhir;
    System.out.print("Masukkan tinggi: ");
    tinggi = scan.nextInt();
    tinggisegitiga = tinggi/2;
    m=1;
    for (int i=0; i < tinggi; i++) 
    {
        posisi = 1;
        jumlah = (i+1)*2-1;
        pusat = (jumlah+1)/2;
        for(int j=0; j < (tinggi*2)-1; j++)
        { 
            l = tinggi - m;
            if(tinggi==1)
            {
            System.out.print("**");
            } 
            else if((j<l) || (j>=(l+2*m-1)))
            {
            System.out.print(" ");
            } 
            else 
            {
            if(m > tinggisegitiga) 
            { 
                simbol =( m - 1 ) / 2;
                akhir = pusat + simbol;
                awal = pusat - simbol;
                if(posisi == pusat) 
                    {
                        System.out.print("2");
                    }
                else if(posisi == awal || posisi == akhir) 
                    {
                        System.out.print("3");
                    }
                else if(posisi == 1 || posisi == jumlah)
                    {
                        System.out.print("*");
                    }
                else 
                    {
                        System.out.print("#");
                    }
            }
            else 
            {
               System.out.print("*");
            }
                posisi = posisi + 1;
            }
        }
            m = m+1;
            System.out.println();
    }
    }
}
