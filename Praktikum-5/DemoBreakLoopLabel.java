public class DemoBreakLoopLabel{

    public static void main(String[] args){
        int a, b;
        Mulai:
        for(a=0;a<2;b++){
            for(b=0;b<3;b++) {
                if (b==1)
                    break
                        Mulai;
                System.out.println("a=" + a + " ; b=" + b);
            }
        }
    }
}