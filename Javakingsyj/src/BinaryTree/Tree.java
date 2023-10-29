package BinaryTree;

public class Tree {Tree(char key){
    this.key=key;
}
    char key;
    public Tree left;
    public Tree right;

    public static Tree create(char[] zu){
        Tree[] tree=new Tree[zu.length];
        for (int i = 0; i < zu.length; i++) {
            tree[i]= new Tree(zu[i]);
        }
        for (int i = 0; i < zu.length / 2; i++) {
            tree[i].left=tree[i*2+1];
            tree[i].right=tree[i*2+2];
        }
        return tree[0];
    }

    public static void qianxu(Tree a){
        if (a==null){
            return;
        }
        System.out.print(a.key+" ");
        qianxu(a.left);
        qianxu(a.right);
    }
    public static void zhongxu(Tree a){
        if (a==null){
            return;
        }
        zhongxu(a.left);
        System.out.print(a.key+" ");
        zhongxu(a.right);
    }
    public static void houxu(Tree a){
        if (a==null){
            return;
        }
        houxu(a.left);
        houxu(a.right);
        System.out.print(a.key+" ");
    }
    public static int kuandu(Tree a,int length) {
        Tree[] tree = new Tree[length];
        tree[0] = a;
        int i = 0;
        Tree parent = tree[0];
        System.out.print(tree[0].key + " ");
        int geshu = 1;
        while (i < length / 2) {
            if (parent.left != null) {
                System.out.print(parent.left.key + " ");
                geshu++;
                tree[i * 2 + 1] = parent.left;
            }
            if (parent.right != null) {
                System.out.print(parent.right.key + " ");
                geshu++;
                tree[i * 2 + 2] = parent.right;
            }
            i++;
            parent = tree[i];
        }
        return geshu;
    }
}
