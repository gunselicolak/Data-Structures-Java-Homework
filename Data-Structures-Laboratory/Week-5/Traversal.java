public class Traversal {
    public static<T> String inOrder(BTNode<T> node) {
        if(node==null)
        return "";
        String left=inOrder(node.left);
        String right=inOrder(node.right);
        return left+(left.equals("")?"":" ")+node.value+(right.equals("")?"":" ")+right;
    }

    public static<T> String preOrder(BTNode<T> node) {
        if(node==null)
        return "";
        String left=preOrder(node.left);
        String right=preOrder(node.right);
        return node.value+(left.equals("")?"":" ")+left+(right.equals("")?"":" ")+right;
    }

    public static<T> String postOrder(BTNode<T> node) {
        if(node==null)
        return "";
        String left=postOrder(node.left);
        String right=postOrder(node.right);
        return left+(left.equals("")?"":" ")+right+(right.equals("")?"":" ")+node.value;
    }
}
