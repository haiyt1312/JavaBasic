package conditional_statement;

public class q2 {
    public static void giaiPTBac2(int a, int b, int c){
        float x1, x2, delta = b*b - 4*a*c;
        if(a == 0){
            if(b == 0){
                System.out.println("Phương trình vô nghiệm!");
            }else {
                System.out.println("Phương trình có nghiệm x = " + (-c/b));
            }
        }else if(delta > 0){
            x1 = (float) ((-b + Math.sqrt(delta)) / (2*a));
            x2 = (float) ((-b - Math.sqrt(delta)) / (2*a));
            System.out.println("Phương trình có 2 nghiệm là: x1 = " + x1 + " và x2 = " + x2);
        } else if (delta == 0) {
            x1 = -b / (2*a);
            System.out.println("Phương trình có nghiệm kép: x1 = x2 = " + x1);
        }else {
            System.out.println("Phương trình vô nghiệm!");
        }
    }
    public static void main(String[] args) {
        int a = 1, b = 5, c = 1;
        giaiPTBac2(a, b, c);
    }
}
