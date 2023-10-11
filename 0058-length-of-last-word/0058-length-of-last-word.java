class Solution {
    public int lengthOfLastWord(String s) {
        String[] words = s.split(" ");

        int lastIndex = words.length - 1;
        while (lastIndex >= 0 && words[lastIndex].isEmpty()) {
            lastIndex--;
        }

        return lastIndex >= 0 ? words[lastIndex].length() : 0;
    }
}