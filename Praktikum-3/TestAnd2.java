public class TestAnd2 {

    public static void main(String[] x) {
        int i = 0;
        int j = 10;
        boolean test;
        //demonstrasi &&
        test = (i <= 10) && (j++ > 9);
        System.out.println(i);
        System.out.println(j);
        System.out.println(test);
    }
}
/*salah karena kurang nya public sehingga tidak bisa jalan
*/