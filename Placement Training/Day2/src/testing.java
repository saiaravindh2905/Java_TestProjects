import java.util.Arrays;

public class testing
{
    public static void main(String[] args) {

        int []a = new int[4];
        int []b = {10,20};

        a=b;

        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));


    }


}
