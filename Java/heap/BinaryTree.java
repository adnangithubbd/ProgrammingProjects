package heap;

class Node{
    int data;
    Node left,right;
    Node(int item){
        data=item;
        left=right=null;
    }
}
public class BinaryTree {
    Node root;
    BinaryTree(){
        root=null;
    }
    void inorder(Node node){
        if(node!=null){
            inorder(node.left);
            System.out.println(node.data+" ");
            inorder(node.right);
        }
    }

    void preorder(Node node){
        if(node!=null){
            System.out.println(node.data+" ");
            preorder(node.left);
            preorder(node.right);
        }
    }
    void postorder(Node node){
        if(node!=null){
            postorder(node.left);
            postorder(node.right);
            System.out.println(node.data +" ");
        }
    }
    public static void main(String[] args) {
        BinaryTree binaryTree=new BinaryTree();
        binaryTree.root=new Node(1);
        binaryTree.root.left=new Node(2);
        binaryTree.root.right=new Node(3);
        binaryTree.root.left.left=new Node(4);
        binaryTree.root.left.right=new Node(5);
        System.out.println("Inorder traversal");
        binaryTree.inorder(binaryTree.root);
        System.out.println("Preorder traversal");
        binaryTree.postorder(binaryTree.root);
    }
}
