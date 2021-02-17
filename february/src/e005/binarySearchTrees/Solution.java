package e005.binarySearchTrees;

import java.util.Scanner;

class Solution{

    public static int getHeight(Node root){
        int HeightLeft = 0;
        int HeightRight = 0;
        if(root.left != null)
            HeightLeft = getHeight(root.left) + 1;
        if (root.right != null)
            HeightRight = getHeight(root.right) +1;
        return (HeightLeft > HeightRight ? HeightLeft : HeightRight);

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
        int height=getHeight(root);
        System.out.println(height);
    }
}

//https://www.hackerrank.com/challenges/30-binary-search-trees/problem