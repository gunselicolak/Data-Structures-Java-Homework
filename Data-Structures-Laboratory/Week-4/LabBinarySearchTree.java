public class LabBinarySearchTree<T extends Comparable<T>> extends BinarySearchTree<T> {
    public LabBinarySearchTree(){
        //Bu metodu de�i�tirmeyin
    }
    public LabBinarySearchTree(BTNode<T> root) {
        //Bu metodu de�i�tirmeyin
        super(root);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return null;
    }
    //  a�a�taki verilen de�erden b�y�k, en k���k de�eri d�nd�rmelidir
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
