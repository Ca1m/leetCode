package single.range_700;

import bean.TreeNode;

/**
 * 700. 二叉搜索树中的搜索
 * @Description:  (补充描述)
 * @Author:   江岩
 * @Date:     2020/11/29 12:42
 * @Version:  1.0
 */
public class Single_0700 {

	public static void main(String[] args) {
		
	}
	/**
	 *  recursive
	 */
	public TreeNode searchBST(TreeNode root, int val) {
		if (root != null && root.val != val) {
			return root.val > val ? searchBST(root.left, val) : searchBST(root.right, val); 
		}
		return root;
    }
	/**
	 *  loop
	 */
	public TreeNode searchBST_(TreeNode root, int val) {
		while (root != null && root.val != val) {
			root = root.val > val ? root.left : root.right;
		}
		return root;
    }
}
