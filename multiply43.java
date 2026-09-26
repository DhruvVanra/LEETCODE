class multiply43{
    public static void multiply(String num1, String num2) {
       int[] result = new int[num1.length() + num2.length()];
       int j =0;
        for(int i = num2.length()-1;i>=0;i--){
            String str = ""+num2.charAt(i);
            result[j] = Integer.parseInt(str) * Integer.parseInt(num1);
            j++; 
        }
        for(int i: result){
            System.out.println(i);
        }

    }

    public static void main(String[] args) {
        String num1 = "123";
        String num2 = "45";
        multiply(num1, num2);
    }
}