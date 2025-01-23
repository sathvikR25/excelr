class Solution {
    public int myAtoi(String s) {
        
        s = s.trim();
        if (s.isEmpty()) {
            return 0;
        }

        int sign = 1; 
        int index = 0; 

    
        if (s.charAt(index) == '+' || s.charAt(index) == '-') {
            sign = s.charAt(index) == '-' ? -1 : 1;
            index++;
        }

        long result = 0; 

        while (index < s.length() && Character.isDigit(s.charAt(index))) {
            result = result * 10 + (s.charAt(index) - '0');

            
            if (result * sign > Integer.MAX_VALUE) {
                return Integer.MAX_VALUE;
            }
            if (result * sign < Integer.MIN_VALUE) {
                return Integer.MIN_VALUE;
            }
            index++;
        }

        
        return (int) (result * sign);
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

      
        System.out.println(solution.myAtoi("42"));          
        System.out.println(solution.myAtoi("   -42"));      
        System.out.println(solution.myAtoi("4193 with words")); 
        System.out.println(solution.myAtoi("words and 987"));   
        System.out.println(solution.myAtoi("-91283472332"));     
        System.out.println(solution.myAtoi("91283472332"));     
    }
}