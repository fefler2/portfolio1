
class A{
    int a;
    int b;

    public A(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    int c;
}

class B{
    int a, b, c;

    public B(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
}

public class Equa {


    public int largestSubArraySum(int[] a){

        int max = Integer.MIN_VALUE, temp = 0;
        for (int i = 0; i < a.length; i++) {
            temp  += a[i];
            if (max<temp) max = temp;
            if (temp<0) temp = 0;
        }
        return 1;
    }

    public static void main(String[] args) {
        A a = new A(2,3,4);
        B b = new B(2,3,4);
        System.out.println(a.equals(b));
        Equa equa = new Equa();
        int[] arr = {-5,-21,-2,-1};
        System.out.println(equa.largestSubArraySum(arr));

    }
}
