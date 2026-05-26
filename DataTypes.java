class Datatypes{
    public void main(String args[]){
        int age=20;
        float h=5.7f;
        double a=68.2;
        char letter ='a';
        String name="abi";
        boolean right=true;

        System.out.println(age);
        System.out.println(h);
        System.out.println(a);
        System.out.println(letter);
        System.out.println(name);
        System.out.println(right);
    }
}

class Solution {
    public int numberOfSpecialChars(String word) {
        boolean[] s = new boolean['z' + 1];
        for (int i = 0; i < word.length(); ++i) {
            s[word.charAt(i)] = true;
        }
        int ans = 0;
        for (int i = 0; i < 26; ++i) {
            if (s['a' + i] && s['A' + i]) {
                ++ans;
            }
        }
        return ans;
    }
}