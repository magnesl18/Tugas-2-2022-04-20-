package inheritance;

public class Persegi extends BangunDatar{
    int sisi;

    @Override
    int hitung_luas(){
        int luas=sisi*sisi;
        System.out.println("Luas persegi : " + luas);
        return luas;
    }

    int hitung_keliling(){
        int keliling=4*sisi;
        System.out.println("Keliling persegi : " + keliling);
        return keliling;
    }
}
