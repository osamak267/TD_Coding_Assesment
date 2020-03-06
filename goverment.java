public class goverment {
    public static void main(String args[]){
        //Test 1
        System.out.println("Expected output: " + "105-8 " + "Actual output: " + ThirtySecondsFormatter(105.25));
        //Test 2
        System.out.println("Expected output: " + "09-1 " + "Actual output: " + ThirtySecondsFormatter(9.3));

    }
    public static String ThirtySecondsFormatter(double price){
        //Declaration
        String format = "";
        String ans = "";
        String decimal = "";
        format = Double.toString(price);
        boolean check = false;
        for(int i = 0; i< format.length(); i++){
            if(format.charAt(i) == '.'){
                check = true;
                ans += '-';
            }
            else if(check == false){
                ans += format.charAt(i);
            }
            else{
                decimal += format.charAt(i);
            }
        }
        double dec = Integer.parseInt(decimal);
        ans += Integer.toString((int)Math.round(dec / 100.0 * 32.0));
        return ans;
    }
}
