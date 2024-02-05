public class Shadowing {
    static int a =20; // this will be shadowed at line 6
    public static void main(String[] args) {
        System.out.println(a); // 20
        int a; // the class variable at line 2 is shadowed by variable
        a = 30;
//      System. out. println(x); // scope will begin when value is initialised
        System.out.println(a); // 30
        fun();
    }
     static void fun() {
         System.out.println(a); // 20
    }
}
