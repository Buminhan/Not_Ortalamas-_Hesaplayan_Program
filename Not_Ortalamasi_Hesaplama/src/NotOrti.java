
import java.util.Scanner;

public class NotOrti {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double m1, m2, f, mat, fiz, kim, turk, tar, muz;
        System.out.println("Matematik ilk vize notunuzu giriniz:");
        m1 = input.nextInt();
        System.out.println("Matematik ikinci vize notunuzu giriniz:");
        m2 = input.nextInt();
        System.out.println("Matematik final notunuzu giriniz:");
        f = input.nextInt();
        mat = m1*0.3+m2*0.3+f*0.4;

        System.out.println("Fizik ilk vize notunuzu giriniz:");
        m1 = input.nextInt();
        System.out.println("Fizik ikinci vize notunuzu giriniz:");
        m2 = input.nextInt();
        System.out.println("Fizik final notunuzu giriniz:");
        f = input.nextInt();
        fiz = m1*0.3+m2*0.3+f*0.4;

        System.out.println("Kimya ilk vize notunuzu giriniz:");
        m1 = input.nextInt();
        System.out.println("Kimya ikinci vize notunuzu giriniz:");
        m2 = input.nextInt();
        System.out.println("Kimya final notunuzu giriniz:");
        f = input.nextInt();
        kim = m1*0.3+m2*0.3+f*0.4;

        System.out.println("Türkçe ilk vize notunuzu giriniz:");
        m1 = input.nextInt();
        System.out.println("Türkçe ikinci vize notunuzu giriniz:");
        m2 = input.nextInt();
        System.out.println("Türkçe final notunuzu giriniz:");
        f = input.nextInt();
        turk = m1*0.3+m2*0.3+f*0.4;

        System.out.println("Tarih ilk vize notunuzu giriniz:");
        m1 = input.nextInt();
        System.out.println("Tarih ikinci vize notunuzu giriniz:");
        m2 = input.nextInt();
        System.out.println("Tarih final notunuzu giriniz:");
        f = input.nextInt();
        tar = m1*0.3+m2*0.3+f*0.4;

        System.out.println("Müzik ilk vize notunuzu giriniz:");
        m1 = input.nextInt();
        System.out.println("Müzik ikinci vize notunuzu giriniz:");
        m2 = input.nextInt();
        System.out.println("Müzik final notunuzu giriniz:");
        f = input.nextInt();
        muz = m1*0.3+m2*0.3+f*0.4;

        System.out.println("Matematik Ortalamanız: "+mat+((mat>=60)?".Geçtiniz.":".Kaldınız."));
        System.out.println("Fizik Ortalamanız: "+fiz+((fiz>=60)?".Geçtiniz.":".Kaldınız."));
        System.out.println("Kimya Ortalamanız: "+kim+((kim>=60)?".Geçtiniz.":".Kaldınız."));
        System.out.println("Türkçe Ortalamanız: "+turk+((turk>=60)?".Geçtiniz.":".Kaldınız."));
        System.out.println("Tarih Ortalamanız: "+tar+((tar>=60)?".Geçtiniz.":".Kaldınız."));
        System.out.println("Müzik Ortalamanız: "+muz+((muz>=60)?".Geçtiniz.":".Kaldınız."));

    }
}
