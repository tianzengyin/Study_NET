package cn.edu.tju.rico.BinarySearchTree;

public class BinarySearchTree {

	private TreeNode root;

	/**
	 * @description ������֪���й�������������
	 * @author rico
	 * @created 2017��6��3�� ����6:15:54
	 * @param input
	 */
	public BinarySearchTree(int[] input) {
		createBinarySearchTree(input);
	}

	/**
	 * @description ������֪���й�������������
	 * @author rico
	 * @created 2017��6��3�� ����6:15:06
	 * @param input
	 */
	public void createBinarySearchTree(int[] input) {
		if (input != null) {
			for (int i = 0; i < input.length; i++) {
				root = insert(input[i], root);
			}
		}
	}

	/**
	 * @description �����������������㷨���ݹ��㷨
	 * @author rico
	 * @created 2017��6��3�� ����3:27:43
	 * @param target
	 *            Ŀ��ֵ
	 * @param root
	 *            �����������ĸ����
	 * @return
	 */
	public TreeNode search(int target, TreeNode root) {
		TreeNode result = null;
		if (root != null) { // �ݹ���ֹ����
			if (target == root.data) { // �ݹ���ֹ����
				result = root;
				return result;
			} else if (target < root.data) { // Ŀ��ֵС�ڸ����ֵ��������������
				result = search(target, root.left);
			} else { // Ŀ��ֵ���ڸ����ֵ��������������
				result = search(target, root.right);
			}
		}
		return result;
	}

	/**
	 * @description �����������Ĳ������
	 * @author rico
	 * @created 2017��6��3�� ����5:55:05
	 * @param target
	 * @param node
	 * @return
	 */
	public TreeNode insert(int target, TreeNode node) {
		if (search(target, node) == null) {
			if (node == null) {
				return new TreeNode(target);
			} else {
				if (target < node.data) {
					node.left = insert(target, node.left);
				} else {
					node.right = insert(target, node.right);
				}
			}
		}
		return node;
	}

	/**
	 * @description ɾ���������������ƶ����
	 * @author rico
	 * @created 2017��6��3�� ����8:43:29
	 * @param target
	 * @param node
	 * @return
	 */
	public TreeNode remove(int target, TreeNode node) {
		TreeNode tmp = null;
		if (node != null) {
			if (target < node.data) { // ��������ɾ��
				node.left = remove(target, node.left);
			} else if (target > node.data) { // ��������ɾ��
				node.right = remove(target, node.right);
			} else if (node.left != null && node.right != null) { // �ҵ���ɾ����㣬��������������Ϊ��
				// �ҵ��Դ�ɾ����������������������һ�����(��С���)
				tmp = node.right;
				while (tmp.left != null) {
					tmp = tmp.left;
				}

				// ����С��㲹λ��ɾ�����
				node.data = tmp.data;

				// ɾ����ɾ������������ϲ�λ���
				node.right = remove(node.data, node.right);
			} else {
				if (node.left == null) {
					node = node.right;
				} else {
					node = node.left;
				}
			}
		}
		return node;
	}

	/**
	 * @description ��������������������ݹ��㷨����������
	 * @author rico
	 * @created 2017��6��3�� ����3:52:54
	 * @param root
	 */
	public void inOrder(TreeNode node) {
		if (node != null) {
			inOrder(node.left);
			System.out.print(root.data + " ");
			inOrder(node.right);
		}
	}

	/**
	 * @description ��ӡ����������
	 * @author rico
	 * @created 2017��6��3�� ����6:08:42
	 * @param node
	 */
	public void printTree(TreeNode node) {
		if (node != null) {
			System.out.print(node.data);
			if (node.left != null || node.right != null) {
				System.out.print("(");
				printTree(node.left);
				System.out.print(",");
				printTree(node.right);
				System.out.print(")");
			}
		}
	}

	/**
	 * @description ���ʶ����������ĸ����
	 * @author rico
	 * @created 2017��6��3�� ����3:54:49
	 * @return
	 */
	public TreeNode getRoot() {
		return root;
	}
}
