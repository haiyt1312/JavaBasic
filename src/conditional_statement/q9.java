package conditional_statement;

public class q9 {
    public static boolean checkNamNhuan(int year){
        if(year % 4 == 0){
            if(year % 100 == 0){
                if(year % 400 == 0){
                    return true;
                }else {
                    return false;
                }
            }else {
                return true;
            }
        }else {
            return false;
        }
    }

    public static void main(String[] args) {
        int year = 2016;
        if(checkNamNhuan(year) == true){
            System.out.println(year + " là năm nhuận");
        }else {
            System.out.println(year + " không là năm nhuận");
        }
    }
}
