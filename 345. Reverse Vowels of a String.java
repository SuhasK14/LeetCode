class Solution {
    public String reverseVowels(String s) {
        char[] vowels = new char[s.length()];
        int counter = 0;
        for (int i = 0; i < s.length(); i++)
        {
            if (isVowel(s.charAt(i)))
            {
                vowels[counter++] = s.charAt(i);
            }
        }
        String reverse = "";
        counter--;
        for (int i = 0; i < s.length(); i++)
        {
            if (isVowel(s.charAt(i)))
            {
                reverse += vowels[counter--];
            }
            else
            {
                reverse += s.charAt(i);
            }
        }
        return reverse;
    }
    // check if character is a vowel 
    public boolean isVowel(char c)
    {
        return (c=='a' || c=='e' || c=='i' || c=='o' || c=='u' || c =='A' || c=='E' || c=='I'|| c=='O'|| c == 'U');
    }
}
