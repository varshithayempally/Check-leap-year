public class Leapyearchecker {
    public static boolean isLeapyear(int year) {
        if((year%4==0 && year%100!=0)||(year%400==0)){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        int year=2026;
        
        System.out.println(year+"is a Leapyear?"+ isLeapyear(year));
    }
    
}
