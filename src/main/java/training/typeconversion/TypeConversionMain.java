package training.typeconversion;

public class TypeConversionMain {

    public static void main(String[] args) {
        int i = 5;              //int 32 bit, long 64 bit,
        long l = 500;
        float f = 1;
        double d = 10.1;

        l =i;
     //   i=l;   nem lehet értékül adni.

        f=l;        //lehet, de adatvesztéssel járhat.
        d = l;      //lehet, de adatvesztéssel járhat.


        byte b = 12;
     //   byte b2 = 300;  //túl nagy, hibát jelez a fordító.


        //Explicit konverzió: szűkebb tartomány felé -- információvesztés történhet.

        i = (int) l;  //a felső bitek kerülnek levágásra.
        i = (int)d;     //adatvesztés: elvesznek a tizedes jegyek.



    }
}
