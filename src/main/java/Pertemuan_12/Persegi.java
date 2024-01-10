
package Pertemuan_12;

/**
 *
 * @author HP
 */
public class Persegi extends ObjectGeometri {
    int Sisi;
    float Luas;
    
    Persegi(int Sisi){
        this.Sisi = Sisi;
        this.Luas = Sisi * Sisi;
    }
    
    public void Jenis_Geometri(String Jenis){
        System.out.println("Nama : Danang Setyo Wibowo");
        System.out.println("Bangun ini termasuk bangun geometri berjenis " + Jenis);
        System.out.println("Memiliki Luas : " + this.Luas);
        System.out.println(" ");
    }
    
    
}
