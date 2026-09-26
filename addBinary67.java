class addBinary67{
    public static  String addBinary(String a, String b) {
        String sum = "";
        int carry = 0;
        if(a.length()>b.length()){
            int extra = a.length()-b.length();
            while(extra > 0){
                b = 0+b;
                extra--;
            }
        }else if(a.length()<b.length()){
            int extra = b.length()-a.length();
            while(extra > 0){
                a = 0+a;
                extra--;
            }
        }

        System.out.println(a);
        System.out.println(b);
        for(int i = a.length()-1;i>=0;i--){
            if(a.charAt(i) == '1' && b.charAt(i) == '1' && carry == 1){
                sum = "1"+sum;
            }else if(a.charAt(i) == '1' && b.charAt(i) == '1' && carry == 0){
                sum = "0"+sum;
                carry = 1;
            }else if(a.charAt(i) == '1' && b.charAt(i) == '0' && carry == 0){
                sum = "1"+sum;
                carry = 0;
            }else if(a.charAt(i) == '1' && b.charAt(i) == '0' && carry == 1){
                sum = "0"+sum;
                carry = 1;
            }else if(a.charAt(i) == '0' && b.charAt(i) == '1' && carry == 0){
                sum = "1"+sum;
                carry = 0;
            }else if(a.charAt(i) == '0' && b.charAt(i) == '1' && carry == 1){
                sum = "0"+sum;
                carry = 1;
            }else if(a.charAt(i) == '0' && b.charAt(i) == '0' && carry == 0){
                sum = "0"+sum;
                carry = 0;
            }else if(a.charAt(i) == '0' && b.charAt(i) == '0' && carry == 1){
                sum = "1"+sum;
                carry = 0;
            }
            
        }
        if(carry == 1){
            sum = "1"+sum;
        }
        return sum;
    }

    public static void main(String[] args) {
        String a = "11";
        String b = "1";
        System.out.println(addBinary(a, b));

    }
}