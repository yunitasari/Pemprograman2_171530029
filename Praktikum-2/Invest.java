public class Invest {
    public static void main(String[] arguments) {
        float total = 14000;
        System.out.println("Orginal investment: $" + total);
        //Inceases by 40 percent the first year
        total = total + (total * .4F);
        System.out.println("After one year: $" + total);
        //loses $1,500 the second year
        total = total - 1500F;
        System.out.println("After two years: $" + total);

        total = total + (total * .12F);
        System.out.println("After three years: $" + total);
    }
}