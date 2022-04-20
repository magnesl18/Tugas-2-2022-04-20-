package inheritance;

public class PersegiPanjang extends BangunDatar{
    int panjang;
    int lebar;

    @Override
    int hitung_luas(){
        int luas=panjang*lebar;
        System.out.println("Luas persegi panjang : " + luas);
        return luas;
    }

    int hitung_keliling(){
        int keliling=2*(panjang+lebar);
        System.out.println("Keliling persegi panjang : " + keliling);
        return keliling;
    }
}
