package Pertemuan_12;

/**
 *
 * @author HP
 */
public class Main {
    public static void main(String[] args){
        System.out.println(" ");
        System.out.println("===================Geometri========================");
        System.out.println("======================00==========================");
        
        ObjectGeometri bidang;
        bidang = new Persegi(8);
        bidang.Jenis_Geometri("Bidang");
        
        bidang = new PersegiPanjang(10,12);
        bidang.Jenis_Geometri("Bidang");
        
        bidang = new Lingkaran(100);
        bidang.Jenis_Geometri("Bidang");
        
        bidang = new Segitiga(20,10);
        bidang.Jenis_Geometri("Bidang");
        
    }
}
