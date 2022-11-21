/* 
package labs;
import java.util.Stack;

public class lab5 {
    public boolean isValid(String s){

//        String input_ = "(){}[]";
//        for( char x : input_.toCharArray()){
//            System.out.println(x);

        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(c == '(' || c == '[' || c == '{') stack.push(c);
            else if(stack.empty()) return false;
            else if(c == ')' && stack.pop() != '(') return false;
            else if(c == ']' && stack.pop() != ']') return false;
            else if(c == '}' && stack.pop() != '}') return false;
        }
        return stack.empty();
        }

    }

    */

