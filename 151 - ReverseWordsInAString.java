class Solution {
    public String reverseWords(String s) {
        // split input string by space and store in string array words
        String[] words = s.split(" ");
        // output string
        String output = "";
        // loop to add to ouput string in reverse
        for (int i = words.length - 1; i >= 0; i--)
        {
            if (!words[i].isEmpty())
            {
                output += words[i] + " ";
            }
        }
        // return output with last space cut off
        return output.substring(0, output.length() - 1);
    }
}
