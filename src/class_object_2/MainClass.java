
package class_object_2;

import java.io.*;

public class MainClass {

    public static void main(String[] args) {
        BufferedReader br = new BufferedReader (
        new InputStreamReader (System.in));
        
        Handphone hp = new Handphone();
        Samsung samsung = new Samsung();
        
        try {
            
            do {                
                System.out.println("-- PBO Cell --");
                System.out.println("1. Isi data HP");
                System.out.println("2. Beli HP");
                System.out.println("3. Keluar aplikasi");
                System.out.print("Pilih menu : ");
                int pilih = Integer.parseInt(br.readLine());
                
                switch(pilih){
                    case 1:
                        System.out.println("-- Isi Data --");
                        System.out.print("Tipe : ");
                        hp.setTipe(br.readLine());
                        System.out.print("Warna : ");
                        hp.setWarna(br.readLine());
                        System.out.print("Kapasitas : ");
                        hp.setKapasitas(br.readLine());
                        System.out.print("Harga : ");
                        samsung.setHarga(Integer.parseInt(br.readLine()));
                        System.out.println("");
                        break;
                    case 2:
                        System.out.println("-- Beli HP --");
                        System.out.print("Jumlah beli : ");
                        samsung.setJumlah(Integer.parseInt(br.readLine()));
                        System.out.println("Total bayar : " + samsung.getBeli());
                        System.out.println("");
                        break;
                    case 3:
                        System.exit(0);
                }
            } while (true);
            
            
            
        } catch (Exception e) {
            System.out.println("Inputan salah / bukan angka");
        }
    }
    
}
