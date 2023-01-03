class Solution {
    public int evalRPN(String[] tokens)  {
        Stack<Integer> stack = new Stack<>();
        int a,b;
        for(String s : tokens){
            if("+*/-".contains(s)){
                a = stack.pop();
                b = stack.pop();

                if("*".equals(s))
                    b *= a;
                else if("/".equals(s))
                    b /= a;
                else if("+".equals(s))
                    b += a;
                else 
                    b -= a;
                stack.push(b);
            }
            else{
                try{
                    stack.push(Integer.parseInt(s));
                }
                finally{
                    continue;
                }
            }
                
        }
        return stack.pop();
    }

}