public class LabBinarySearchTree<T extends Comparable<T>> extends BinarySearchTree<T> {
    public LabBinarySearchTree(){
        //Bu metodu deðiþtirmeyin
    }
    public LabBinarySearchTree(BTNode<T> root) {
        //Bu metodu deðiþtirmeyin
        super(root);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return null;
    }
    //  aðaçtaki verilen deðerden büyük, en küçük deðeri döndürmelidir
    @Override
    public BTNode<T> successor(T value) {
        BTNode<T> node = find(getRoot(),value);
        
        if(node == null || node.right == null)
        {
            return null;
        }
        node = node.right;
        
        while(node.left != null)
        {
            node = node.left;
        }
        return node;
    }

    @Override
    public BTNode<T> predecessor(T value) {
        BTNode<T> node = find(getRoot(),value);
        
        if(node == null || node.right == null)
        {
            return null;
        }
        node = node.left;
        
        while(node.right != null)
        {
            node = node.right;
        }
        return node;
    }

    @Override
    public BTNode<T> findParent(BTNode<T> node) {
        return null;
    }


}
