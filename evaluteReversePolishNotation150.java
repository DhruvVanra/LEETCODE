
import java.util.Stack;

class evaluteReversePolishNotation150{
    public static  int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<>();

        for(int i = 0;i<tokens.length;i++){
            String num = tokens[i];
            if("+".equals(num)){
                if(st.size()<2){
                    return -1;
                }else{
                    int num1 = st.pop();
                    int num2 = st.pop();
                    st.add(num1+num2);
                }
            }else if("-".equals(num)){
                if(st.size()<2){
                    return -1;
                }else{
                    int num1 = st.pop();
                    int num2 = st.pop();
                    st.add(num2-num1);
                }
            }else if("*".equals(num)){
                if(st.size()<2){
                    return -1;
                }else{
                    int num1 = st.pop();
                    int num2 = st.pop();
                    st.add(num1*num2);
                }
            }else if("/".equals(num)){
                if(st.size()<2){
                    return -1;
                }else{
                    int num1 = st.pop();
                    int num2 = st.pop();
                    st.add(num2/num1);
                }
            }else{
               int n = Integer.parseInt(num);
               st.add(n);
            }

        }
        return st.pop();
    }

    public static void main(String[] args) {
        String tokens[] ={"10","6","9","3","+","-11","*","/","*","17","+","5","+"};
        System.out.println(evalRPN(tokens));
    }
}