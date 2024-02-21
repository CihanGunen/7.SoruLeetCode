public class Main {
    public static void main(String[] args) {
        String s1 = "anagram";
        String t1 = "nagaram";
        String s2 = "rat";
        String t2 = "car";

        Solution solution = new Solution();

        boolean result1 = solution.isAnagram(s1, t1);
        boolean result2 = solution.isAnagram(s2, t2);

        System.out.println("Result 1: " + result1); // Output: true
        System.out.println("Result 2: " + result2); // Output: false
    }
}
