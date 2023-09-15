import java.util.ArrayList;

public class PrimeNumbers {
    public static void main(String[] args) {
        ArrayList<Integer> primeNumbers = new ArrayList<Integer>();
        //int tutacak boş bir arraylist oluşturdum.

        for (int i = 2; i < 100; i++) {//2den 100e kadar olan sayıları gezecek loop
            boolean isPrime = true;//null veremediğim için true atadım

            for (int j = 2; j <= Math.sqrt(i); j++) {//2 ile bir sayının karekökü arasındaki sayılardan hiçbiri
                                                    //o sayıyı tam bölmüyorsa bahse konu sayı asaldır!

                if (i % j == 0) {//else bloğu yazmama gerek yok çünkü bu ife girilmedikçe isPrime true olacak!
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                primeNumbers.add(i);//her isPrime=true olduğunda sayıyı arrayliste ekleyecek.
            }
        }
        System.out.print(primeNumbers);
    }
}