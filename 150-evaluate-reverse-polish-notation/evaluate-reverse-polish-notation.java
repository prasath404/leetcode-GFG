class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> eval = new Stack<>();
        for(String token : tokens){
            if(token.equals("+")||token.equals("-")||token.equals("/")||token.equals("*")){
                int b = eval.pop();
                int a = eval.pop();
                if (token.equals("+")) {
                    eval.push(a + b);
                } 
                else if (token.equals("-")) {
                    eval.push(a - b);
                } 
                else if (token.equals("*")) {
                    eval.push(a * b);
                } 
                else {
                    eval.push(a / b);
                }
            }
            else{
                eval.push(Integer.parseInt(token));
            }
        }
        return eval.peek();
    }
}