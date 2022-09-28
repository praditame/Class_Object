/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package constructor_1;
import java.io.*;
public class MainClass {

   
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader 
        (new InputStreamReader(System.in));
        
        //object (instance of class)
        //karena ada 2 constructor, maka dibuat 2 object
        //1. admin
        //2. akun baru
        Akun admin = new Akun();
        Akun akunBaru = new Akun("","");
        
        //variabel
        String username, password;
        
        //menu
        do {            
            System.out.println("--- Login ---");
            System.out.println("1. Login admin");
            System.out.println("2. Buat akun baru");
            System.out.println("3. Lihat akun");
            System.out.println("4. Ubah password");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu : ");
            int menu = Integer.parseInt(br.readLine());
            switch(menu){
                case 1:
                    System.out.println("-- Login admin --");
                    System.out.print("Masukkan username : ");
                    username = br.readLine();
                    System.out.print("Masukkan password: ");
                    password = br.readLine();
                    
                    //mencocokkan username dan password
                    if (username.equalsIgnoreCase(admin.getUsername())
                            && password.equals(admin.getPassword())) {
                        System.out.println("Sukses!");
                    } else {
                        System.err.println("Gagal!");
                    }
                    break;
                case 2:
                    System.out.println("-- Buat akun --");
//                    System.out.print("Masukkan username : ");
//                    username = br.readLine();
                    System.out.print("Masukkan password: ");
                    password = br.readLine();
                    
                    //memasukkan variabel ke dalam constructor
                    akunBaru = new Akun("", password);
                    System.out.println("");
                  
                    break;
                case 3:
                    System.out.println("-- Lihat akun --");
                    System.out.println("1. Admin");
                    System.out.println("Username : " + admin.getUsername());
                    System.out.println("Password : " + admin.getPassword());
                    System.out.println("");
                    System.out.println("2. Akun baru");
                    System.out.println("Username : " + akunBaru.getUsername());
                    System.out.println("Password : " + akunBaru.getPassword() 
                            + "\n");
                    break;
                case 4:
                    System.out.println("-- Ubah Password --");
                    System.out.print("Masukkan password lama : ");
                    password = br.readLine();
                    if (password.equals(akunBaru.getPassword())) {
                        System.out.print("Masukkan password baru : ");
                        akunBaru.setPassword(br.readLine());
                        System.out.println("Berhasil");
                    } else {
                        System.err.println("Cek kembali password lama anda");
                    }
                     System.out.println("");
                    break;
                case 5: System.exit(0);
            }
        } while (true);
        
        
      
    }
    
}
