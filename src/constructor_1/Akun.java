
package constructor_1;


public class Akun {
    
    //inisialisasi atribut username, password
    private String username, password;
    
    //constructor non parameter / default (admin)
    public Akun(){
        //user admin sudah ditentukan username dan passwordnya
        username = "admin";
        password = "admin";
    }
    
    //constructor parameter (akun baru)
    public Akun(String u, String p){
        u = "user";
        password = p;
    }
    
//    public Akun (String p){
//        password = p;
//    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
    
    
    
    
    
    
}
