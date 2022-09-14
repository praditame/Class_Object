
package class_object_1;


public class Hewan {
    //atribut / data
    private String tipe, suara;
    private int usia;
    
    //setter dari semua variabel/atribut/data
    //setter memiliki parameter
    public void setTipe(String t){
        tipe = t;
    }
    
    public void setSuara(String suara){
        this.suara = suara;
    }
    
    public void setUsia(int usia){
        this.usia = usia;
    }
    
    
    //getter dari semua variabel/atribut/data
    /*getter biasanya tidak memiliki parameter karena
     langsung mengambil data dari setter*/
    
    public String getTipe(){
       return this.tipe; 
    }
    
    public String getSuara(){
        return this.suara;
    }
    
    public int getUsia(){
        return this.usia;
    }
}



