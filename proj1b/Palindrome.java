public class Palindrome {
    public Deque<Character> wordToDeque(String word){
        Deque<Character> dq = new ArrayDeque<>();
        int len = word.length();
        for (int i = 0; i < len; i++) {
            dq.addLast(word.charAt(i));
        }
        return dq;
    }
    public boolean isPalindrome(String word) {
        if (word == null) {
            return true;
        }
        return isPalindromeHelper(word, 0, word.length() - 1);
    }

    private boolean isPalindromeHelper(String word, int left, int right) {
        // 如果左右索引相遇或者交叉，那么检查完成，是回文
        if (left >= right) {
            return true;
        }
        // 检查当前索引处的字符是否相同
        if (word.charAt(left) != word.charAt(right)) {
            return false;
        }
        // 递归检查内部子串
        return isPalindromeHelper(word, left + 1, right - 1);
    }
    public boolean isPalindrome(String word, CharacterComparator cc){
        if (word == null || word.length() <= 1) {
            return true;
        }
        int len = word.length();
        for (int i = 0; i < len / 2; i++) {
            if (!cc.equalChars(word.charAt(i), word.charAt(len - i - 1))) {
                return false;
            }
        }
        return true;
    }

}
