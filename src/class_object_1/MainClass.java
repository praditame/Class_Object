
package class_object_1;


public class MainClass {

    public static void main(String[] args) {
        
        /*untuk bisa mengakses class Hewan, Burung, Ikan, 
          perlu membuat object (instance of class)
            */
        
        //akses suara, tipe, dan usia dari class Hewan
        Hewan burung = new Hewan(); 
        Hewan ikan = new Hewan();
        
        //akses method dari class Burung dan Ikan
        Burung b = new Burung();
        Ikan i = new Ikan();
        
        //cara isi dari suara, tipe, dan usia
        burung.setTipe("Kakatua");
        burung.setSuara("Kuk.. kuk.. kuk..");
        burung.setUsia(1);
        
        ikan.setTipe("Lumba Lumba");
        ikan.setSuara("blurp.. blurp.. blurp..");
        ikan.setUsia(0);
        
        
        //cara ambil dari setter (Hewan, Ikan, dan Burung)
        System.out.println("Aku " + burung.getTipe() + 
                " suaraku " + burung.getSuara()+ " usiaku " +
                burung.getUsia() + ". " );
        b.terbang();
        
        System.out.println("Aku " + ikan.getTipe() + 
                " suaraku " + ikan.getSuara()+ " usiaku " +
                ikan.getUsia() + ". " );
        i.berenang();
        
        
        
    }
    
}
