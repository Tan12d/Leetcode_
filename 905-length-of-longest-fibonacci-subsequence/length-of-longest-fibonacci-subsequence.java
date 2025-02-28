class Solution {
    public int lenLongestFibSubseq(int[] arr) {
        HashSet<Integer> nums = new HashSet<>();
        int lis = 0;

        for (int num : arr) {
            nums.add(num);
        }

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int first = arr[i];
                int second = arr[j];
                int sum = first + second;

                if (!nums.contains(sum)) {
                    continue;
                }

                int count = 2;

                while (nums.contains(sum)) {
                    first = second;
                    second = sum;
                    sum = first + second;
                    count++;
                }

                lis = Math.max(count, lis);
            }
        }

        return lis;
    }
}