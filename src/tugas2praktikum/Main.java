package tugas2praktikum;

import java.util.Scanner;
public class Main {
   static int pilih;
    public static void main(String[] args){
        double panjang,lebar,TinggiBalok,r, TinggiTabung;
        int pilih = 0;
        int i = 0;
        Scanner input = new Scanner (System.in);
        do{
            System.out.println("---------------------------------------");
            System.out.println("|       PROGRAM BALOK DAN TABUNG      |");
            System.out.println("---------------------------------------");
            System.out.println("Menu : ");
            System.out.println("1. Balok");
            System.out.println("2. Tabung");
            System.out.println("3. Keluar");
            System.out.print("Pilih : "); 
            pilih = input.nextInt();
        
        if(pilih == 1){
            System.out.print("Masukkan panjang : "); panjang = input.nextDouble();
            System.out.print("Masukkan lebar : "); lebar = input.nextDouble();
            System.out.print("Masukkan tinggi : "); TinggiBalok = input.nextDouble();
            Balok balok = new Balok(panjang,lebar,TinggiBalok);
            System.out.println("\n-------------------Hasil------------------------");
            System.out.println("Luas persegi panjang : " + balok.luas());
            System.out.println("Keliling persegi panjang : " + balok.keliling());            
            System.out.println("Volume Balok : " + balok.volume());
            System.out.println("Luas permukaan balok : " + balok.luasPermukaan());
            new java.util.Scanner(System.in).nextLine();

        }
        else if(pilih == 2){
            System.out.print("Masukkan tinggi : "); TinggiTabung = input.nextDouble();
            System.out.print("Masukkan jari-jari : "); r = input.nextDouble();
            Tabung tabung = new Tabung (r, TinggiTabung);
            System.out.println("\n-------------------Hasil------------------------");
            System.out.println("Luas lingkaran : " + tabung.luas());
            System.out.println("Keliling lingkaran : " + tabung.keliling());            
            System.out.println("Volume Tabung : " + tabung.volume());           
            System.out.println("Luas permukaan Tabung : " + tabung.luasPermukaan());
            new java.util.Scanner(System.in).nextLine();
            }
        else if (pilih==3){
            i=1;
            System.out.println("Terima Kasih!");
            System.exit(0);   
            }
        }while(i==0);
    }  
    }