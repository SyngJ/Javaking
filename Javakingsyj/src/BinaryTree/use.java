package BinaryTree;

import BinaryTree.Tree;

import static java.lang.Math.log;
import static java.lang.Math.max;

public class use {
    public static void main(String[] args) {
        char[] zu={'A','B','C','D','E','F','G'};
        Tree tree0 = Tree.create(zu);
        Tree.qianxu(tree0);
        System.out.println(" ");
        Tree.zhongxu(tree0);
        System.out.println(" ");
        Tree.houxu(tree0);
        System.out.println(" ");
        int geshu = Tree.kuandu(tree0, zu.length);
        System.out.println(" ");
        double cengshu=log(geshu+1)/log(2);
        System.out.println(Math.pow(2,cengshu-1));
    }
}