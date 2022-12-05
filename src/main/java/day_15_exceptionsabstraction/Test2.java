package day_15_exceptionsabstraction;
public class Test2 {

    String str = "a"; // 4.adim
    void A() {
        try {
            str = str + "b"; // 5.adim
            B(); // 6.adim
        } catch (Exception e) {
            str = str + "c";
        }
    }
    void B() throws Exception { // 7.adim

        try {
            str = str + "d";  // 8.adim ==>  abd
            C(); // 9.adim

        } catch (Exception e) {  // 12.adim
            str = str + "e"; // 13.adim  ==> abde

        } finally {  // 14.adim
            str = str + "f"; // 15.adim ==> abdef
        }
        str = str + "g"; // 16.adim  ==> abdefg
    }
    void C() throws Exception {  // 10
        System.out.println(12/0); // 11
    }
    void display() {
        System.out.println(str); // 18. adim str'i yazdiracak ==> abdefg
    }
    public static void main(String[] args) {  // 1.adim
        Test2 object = new Test2(); // 2.adim
        object.A(); // 3.adim
        object.display(); // 17.adim
    }
}
