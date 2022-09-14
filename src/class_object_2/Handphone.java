
package class_object_2;

public class Handphone {
    private String tipe, warna, kapasitas;
    
    //setter
    public void setTipe(String t){
        tipe = t;
    }
    
    public void setWarna(String w){
        warna = w;
    }
    
    public void setKapasitas(String k){
        kapasitas = k;
    }
    
    
    //getter
    public String getTipe(){
        return this.tipe;
    }
    
    public String getWarna(){
        return this.warna;
    }
    
    public String getKapasitas(){
        return this.kapasitas;
    }
}
