package Pertemuan_12;

/**
 *
 * @author HP
 */
public class Lingkaran extends ObjectGeometri{
    double phi = 3.14;
    double r, Luas;
    
    Lingkaran(double r){
        this.r = r;
        this.Luas = phi*r*r;
    }
    
    public void Jenis_Geometri(String Jenis){
        System.out.println("Bangun ini termasuk bangun geometri berjenis " + Jenis);
        System.out.println("Memiliki Luas : " + this.Luas);
        System.out.println(" ");
    }
}
