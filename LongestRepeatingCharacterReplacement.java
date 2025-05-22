public class LongestRepeatingCharacterReplacement {

    public static void main(String[] args) {
        String s = "AABABCD";

        int[] count = new int[26];
        int maxCount = 0;
        int maxLength = 0;
        int left = 0;
        int k = 2;

        for (int right = 0; right < s.length(); right++) {
            count[s.charAt(right) - 'A']++;
            maxCount = Math.max(maxCount, count[s.charAt(right) - 'A']);

            if ((right - left + 1) - maxCount > k) {
                count[s.charAt(left) - 'A']--;
                left++;
            }

            maxLength = Math.max(maxLength, right - left + 1);
        }

        System.out.println(maxLength);
    }
}
