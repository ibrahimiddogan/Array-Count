import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        int[] dizi = {10, 20, 20, 10, 10, 20, 5, 20};

        // Her elemanın frekansını hesaplamak için dizi içinde dolaşıyoruz.
        for (int i = 0; i < dizi.length; i++) {
            int eleman = dizi[i];
            int frekans = 1; // Her eleman en az bir kez tekrar ettiği için başlangıç frekansı 1.

            // Diğer elemanları kontrol ederek frekansı hesaplıyoruz.
            for (int j = i + 1; j < dizi.length; j++) {
                if (dizi[j] == eleman) {
                    frekans++;
                }
            }

            // Frekansı 0 yaparak aynı elemanın tekrar hesaplanmasını engelliyoruz.
            dizi[i] = 0;

            // Sadece bir kez bulunan elemanları ve frekanslarını yazdırıyoruz.
            if (frekans > 0) {
                System.out.println(eleman + " sayısı " + frekans + " kere tekrar edildi.");
            }
        }
    }
}