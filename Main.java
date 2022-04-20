package inheritance;

public class Main {
    public static void main(String[] args){
        BangunDatar bangun_datar = new BangunDatar();
        Persegi persegi = new Persegi();
        PersegiPanjang persegi_panjang = new PersegiPanjang();

        bangun_datar.hitung_luas();
        System.out.println("----------------------------");
        persegi.sisi = 5;
        persegi.hitung_luas();
        persegi_panjang.panjang = 3;
        persegi_panjang.lebar = 6;
        persegi_panjang.hitung_luas();
        System.out.println("");
        System.out.println("");
        bangun_datar.hitung_keliling();
        System.out.println("----------------------------");
        persegi.hitung_keliling();
        persegi_panjang.hitung_keliling();
    }
}
