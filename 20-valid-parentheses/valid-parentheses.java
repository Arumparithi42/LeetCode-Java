class Solution {
    public boolean isValid(String s) {
        HashMap<Character,Character> map = new HashMap<>();
        map.put('(',')');
        map.put('[',']');
        map.put('{','}');
        
        Stack<Character> stack = new Stack<>();
        for (char ch : s.toCharArray()){
            if(map.containsKey(ch)){
                stack.push(map.get(ch));
            }
            else{
                if (stack.isEmpty() || stack.pop() != ch)
                    return false;
            }
        }
        return (stack.isEmpty());
    }
}