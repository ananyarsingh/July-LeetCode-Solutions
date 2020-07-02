public List<List<Integer>> levelOrderBottom(TreeNode root) {
        if(root == null)
            return new ArrayList<List<Integer>>();
        Queue<TreeNode> queue = new LinkedList<TreeNode>(); 
        queue.add(root);
        int ele = 1;
        List<List<Integer>> resList = new ArrayList<List<Integer>>();
        while(!queue.isEmpty()) {
            List<Integer> list = new ArrayList<Integer>(); 
            int count = 0;
            while(ele-- > 0) {
                TreeNode node = queue.poll();
                list.add(node.val);
                if(node.left != null) {
                    queue.add(node.left);
                    count++;
                }
                if(node.right != null) {
                    queue.add(node.right);
                    count++;
                }
            }
            resList.add(0,list); // adding at 0th index everytime reduces the running time(by eliminating reversing the original level order traversal)
            ele = count;
        }
        return resList;
    }
