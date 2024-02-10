class Solution
{
    public String decodeString(String s)
    {
        // nums stack to keep all number values
        Stack<Integer> nums = new Stack<>();
        // strs stack to keep all string values
        Stack<String> strs = new Stack<>();
        // current/output string
        String str = "";
        // current index
        int index = 0;
        // loop through input string s
        while (index < s.length())
        {
            // check if character is a digit
            if (Character.isDigit(s.charAt(index)))
            {
                // get number value using for loop in case number is more than one digit long
                String num = "";
                while (Character.isDigit(s.charAt(index)))
                {
                    num += s.charAt(index) + "";
                    index++;
                }
                nums.push(Integer.parseInt(num));
            }
            // check if character is a [
            else if (s.charAt(index) == '[')
            {
                // [ signals the start of a new string so push old string and set str to empty
                strs.push(str);
                str = "";
                index++;
            }
            // check if character is a ]
            else if (s.charAt(index) == ']')
            {
                // ] signals end of string so pop old string
                int count = nums.pop();
                String temp = strs.pop();
                // append current string count number of times to old string
                for (int i = 0; i < count; i++)
                {
                    temp += str;
                }
                // set temp to str and continue
                str = temp;
                index++;
            }
            // else append character to current string str
            else
            {
                // if no matches, then append character to str and continue
                str += s.charAt(index);
                index++;
            }
        }
        // return string str
        return str;
    }
}
