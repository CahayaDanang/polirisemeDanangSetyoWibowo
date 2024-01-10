package Pertemuan_12;

/**
 *
 * @author HP
 */
public class PersegiPanjang extends ObjectGeometri {
    int Panjang, Lebar, Luas;
    
    PersegiPanjang(int Panjang, int Lebar){
        this.Panjang = Panjang;
        this.Lebar = Lebar;
        this.Luas = Panjang* Lebar;
    }
    
    public void Jenis_Geometri(String Jenis){
        System.out.println("Bangun ini termasuk bangun geometri berjenis " + Jenis);
        System.out.println("Memiliki Luas : " + this.Luas);
        System.out.println(" ");
    }
}
