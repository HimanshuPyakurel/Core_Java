package methods;

public class Practice1 {


    // no return type and no argument

    static void sum(){
        int a = 5;
        int b= 3;
        int x = 5+3;
        System.out.println("I am sum:" +x);
    }

    // no return type yes argument

    static void addsum(int a, int b){
        int c= a + b ;
        System.out.println(c);
    }

    // yes return type but no argument

    static int sub(){
        int a = 9;
        int b =10;
        int sub = b-a;
        return sub;
    }

    // yes return type and yes argument

    static int minusSub(int x, int y){
        int k = x - y;
        return k;
    }

public static void main(String[] args) {
    sum();
    addsum(3, 4);
    int z = sub();
    System.out.println(z);
    int l = minusSub(2, 3);
    System.out.println(l);

}
}
