package Pertemuan_12;

/**
 *
 * @author HP
 */
public class Segitiga extends ObjectGeometri {
    int Tinggi, Alas;
   double Luas;
   
   
    Segitiga(int Tinggi, int Alas){
       this.Tinggi = Tinggi;
       this.Alas = Alas;
       this.Luas = 0.5 * Alas * Tinggi;
   }
    
    public void Jenis_Geometri(String Jenis){
        System.out.println("Bangun ini termasuk bangun geometri berjenis " + Jenis);
        System.out.println("Memiliki Luas : " + this.Luas);
        System.out.println(" ");
    }
}
