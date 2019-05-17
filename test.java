public class test{
  import java.util.Scanner;
public class tools {
    /**print a line on the scree 
     * @param num how many times print charactor str
     * @param str the charactor for print
    */
    /**!!!pass by value
     * but this method don,t work as intended
     * because java pass parameter by value
     */
    public static void printjerry(int num,String str){
        for(int i = 0; i < num; i++){
            System.out.print(str);
        }
        System.out.println();
    }
    public static void printSquare(int num,String str){
        for(int i = 0; i < num; i++ ){
            printjerry(num, str); 
        }
    }
    public static void printRectangle(int num,String str){
        for(int i = 0; i < num; i++ ){   
            printSquare(num, str);   
        }
    }
    public static void main(String[] args) {
        printRectangle(2, "A");
        System.out.println();
    }
    //get a n integer from user input
    //import java.util.Scanner
    public static int getInt(){
        System.out.println("Enter an Integer:");
        Scanner in = new Scanner(System.in);
        int num = 0;
        return num;
    }
    public static int getInt(String str){
        System.out.println(str);
        Scanner in = new Scanner(System.in);
        int num = 0;
        return num;        
    }
    //get a String  
    public static String getStr(){
        System.out.println("");
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();        
        return s;
    }
    public static int modify(int a,int b){
        return a - b;
    }    
    public String numTran(int n){
        String tmp = "";//"" empty空串
        for(int i = 0;i < 5; i++){
            for(int j = 0;j < 5; j++){
                tmp += 1;
            }
            tmp +=1;
        }
        tmp += "\n";
    
    return tmp;
    }
}










}
