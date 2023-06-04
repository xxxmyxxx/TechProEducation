package day05concatinationoperatorstypecasting;

public class TypeCasting {
    public static void main(String[] args) {
        /*
        Numeric primitive  data type larinin birbirine donusturulemsine "Type Casting" denir
        Numeric (sayisal) Data type lar byte-short-int-long-float-double

         */
        //NOTE 1:Kucuk data typelarini buyuk data typelarina cevirmeyi java otomatik olarak yapar
        //bu isleme "AutoWidening" (otomatik genisletme) denir

        //Note 2:Buyuk datatype larini kucuk data typelarina cevirmek riskli bir isdir ,java bu riskli isi otomatik olarak yapmaz
        //bu islemi kod yazandan bekler
        //Bu isleme "ExplicitNarrowing" (Acıktan Daraltma) denir

        //byte data type ini int data type ceviriniz
        byte age = 13;
        int ageInt = age;//AutoWidening

        //int data type ni short data type ina ceviriniz
        int weight =312;
        short weightShort = (short) weight;//Explicit Narrowing

        //int data type float data typeına çeviriniz.

        int footNumber = 43;

        float footNumberFloat = footNumber;    // AutoWidening
        System.out.println("footNumberFloat = " + footNumberFloat);

        short footNumberShort = (short) footNumber; //Expilicit Narrowing - açıkça daraltma
        System.out.println("footNumber = " + footNumber);

        double note = 260.78;

        short noteShort = (short)note;
        System.out.println("noteShort = " + noteShort);

        byte numByte= (byte)noteShort; // -128....0 1 2 3 ...127 = toplam 256 tane değer modunu al kalan 4
        System.out.println("numByte = " + numByte);// 4


    }
}