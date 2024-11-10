class Solution {
        public int minimumSubarrayLength(int[] nums, int k) {

            Node queryTree = Node.build(nums, 0, nums.length-1);

            int start = 0;
            int min = Integer.MAX_VALUE;
            for (int end = 0; end < nums.length; end++) {
                while(queryTree.query(start, end) >= k && start <= end){
                    min = Math.min(min, end - start + 1);
                    start++;
                }
            }


            return min == Integer.MAX_VALUE ? -1 : min;
        }

        private static class Node{
            private Node left, right;
            private int l, h;
            private int or;

            public Node(Node left, Node right, int l, int h, int or) {
                this.left = left;
                this.right = right;
                this.l = l;
                this.h = h;
                this.or = or;
            }

            public int query(int start, int end){
                if(end < l || start > h) return 0;
                if(start <= l && end >= h) return or;
                int or = 0;
                if(left != null) or |= left.query(start, end);
                if(right != null) or |= right.query(start, end);
                return or;
            }



        public static Node build(int[] nums, int l, int h){
            if(l > h) return null;

            int mid = (l+h)/2;

            if(h > l) {
                Node left = build(nums, l, mid);
                Node right = build(nums, mid + 1, h);
                int xor = or(left) | or(right);
                return new Node(left, right, l, h, xor);
            } else {
                return new Node(null, null, l, h, nums[l]);
            }
        }

        private static int or(Node node){
            return node == null ? 0 : node.or;
        }

    }
}