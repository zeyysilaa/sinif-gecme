import java.util.Scanner;
public class Sınıf {
    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);

        double matematik, fizik, turkce, kimya, muzik;

        System.out.println("Matematik notunuz : ");
        matematik = girdi.nextDouble();

        System.out.println("Fizik notunuz : ");
        fizik = girdi.nextDouble();

        System.out.println("Türkçe notunuz : ");
        turkce = girdi.nextDouble();

        System.out.println("Kimya notunuz : ");
        kimya = girdi.nextDouble();

        System.out.println("Müzik notunuz : ");
        muzik = girdi.nextDouble();

        double ortalama = (matematik + fizik + turkce + kimya + muzik) / 5;

        if ((0 <= matematik && matematik <=100) && (0 <= fizik && fizik <= 100) && (0<= turkce && turkce <= 100) && (0 <= kimya && kimya <= 100) && (0 <= muzik && muzik <=100)){
            System.out.println("Notlarınız aralığa uygun, ortalamanız hesaplanıyor.");
        }if (0 < ortalama && ortalama < 55){
            System.out.println(";Üzgünüm, sınıfı geçemediniz.");
        }else {
            System.out.println("Tebrikler, sınıfı geçtiniz.");
        }

        System.out.println("Ortalamanız : " + ortalama);



    }
}
