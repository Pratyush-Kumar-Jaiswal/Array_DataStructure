public class BinaryTree {
    public static void main(String[] args) {
        BinaryNode<Integer> root =new BinaryNode<>(15);
        BinaryNode<Integer> rleft =new BinaryNode<>(10);
        BinaryNode<Integer> rright =new BinaryNode<>(20);
        root.left=rleft;
        root.right=rright;
        print(root);
    }
    static void print(BinaryNode root){
        if(root==null)
            return;
        System.out.println(root.data);
        print(root.left);
        print(root.right);
    }
}
class BinaryNode<T>{
    T data;
    BinaryNode<T> left;
    BinaryNode<T> right;

    public BinaryNode(T data) {
        this.data = data;
    }
}
