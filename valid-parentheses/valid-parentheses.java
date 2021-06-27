class Solution {
    public boolean isValid(String s) {
        if (s.length() % 2 != 0) {
            return false;
        }

        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); ++i) {
            char at = s.charAt(i);
            if (at == '(' || at == '[' || at == '{') {
                stack.push(at);
                continue;
            }

            if (stack.empty()) {
                return false;
            }

            char top = stack.peek();
            stack.pop();

            if ((at == ')' && top == '(')
                || (at == '}' && top == '{')
                || (at == ']' && top == '[')) {
                continue;
            }

            return false;
        }

        return stack.empty();
    }
}