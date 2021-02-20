package e006.bSTLevelOrderTraversal;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Solution{

    static void levelOrder(Node root){
        Queue<Node> order = new LinkedList<>();
        order.add(root);
                while(!order.isEmpty()){
                    Node current = order.remove();
                    System.out.print(current.data+" ");
                    if(current.left!=null)
                        order.add(current.left);
                    if(current.right!=null)
                        order.add(current.right);
                }


    }

    public static Node insert(Node root,int data){
        if(root==null){
            return new Node(data);
        }
        else{
            Node cur;
            if(data<=root.data){
                cur=insert(root.left,data);
                root.left=cur;
            }
            else{
                cur=insert(root.right,data);
                root.right=cur;
            }
            return root;
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        Node root=null;
        while(T-->0){
            int data=sc.nextInt();
            root=insert(root,data);
        }
        levelOrder(root);
    }
}
//https://www.hackerrank.com/challenges/30-binary-trees/problem