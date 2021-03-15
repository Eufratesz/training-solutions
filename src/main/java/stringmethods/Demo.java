package stringmethods;

public class Demo {

    private boolean hasContent(String s){
        return s != null && !s.isEmpty();
    }

    private boolean hasReadableContent(String s){
        return s!= null && !s.isBlank();
    }



    public static void main(String[] args) {

        String name = "John Doe";
        name.toUpperCase();
        System.out.println(name);           //John Doe - nem változtatta meg az állapotát
        String nameUpper = name.toUpperCase();
        System.out.println(nameUpper);      //JOHN DOE

        name = name.toUpperCase();
        System.out.println(name);                                                        //JOHN DOE

        System.out.println("John Doe".toUpperCase().substring(1,4));                    //OHN

        String anotherName = "J";
        System.out.println(anotherName.equals("John"));                                 //false

        String anotherName2 =null;
       // System.out.println(anotherName2.equals("John"));                              //nullpointerException
        System.out.println("John".equals(anotherName2));                                 //false


        System.out.println(String.join("-", "John", "Doe", "Jack", "Doe"));  //John-Doe-Jack-Doe


        System.out.println("   \t  readable    characters  \n".trim());                 // readable    characters /t=tab

        Demo demo = new Demo();
        System.out.println(demo.hasContent("   "));
        System.out.println(demo.hasReadableContent("  "));


    }
}
