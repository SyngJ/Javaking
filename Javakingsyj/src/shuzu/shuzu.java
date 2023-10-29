package shuzu;

public class shuzu {
    public static void main(String[] args) {
        int[][] a=new int[4][2];
        a[0][0]=1;
        a[0][1]=3;
        a[1][0]=2;
        a[1][1]=6;
        a[2][0]=8;
        a[2][1]=10;
        a[3][0]=15;
        a[3][1]=18;
        for (int i = 0; i <a.length-1 ; i++) {
            int min = i;
            for (int j = i+1; j < a.length; j++) {
                if (a[j][0]<a[min][0]){
                    min=j;
                }
            }
            if (i!=min) {
                for (int j = 0; j <2; j++) {
                    int t = a[i][j];
                    a[i][j] = a[min][j];
                    a[min][j]=t;
                }
            }
        }
        int length=a.length;
        for (int i = 0; i < a.length-1; i++) {
            for (int j = 1; j < length-i; j++) {
                if (a[i][1]>=a[i+j][0]){
                    if (a[i][1]<=a[i+j][1]){
                        a[i][1]=a[i+j][1];

                    }else {
                    }
                    a[i+j][0]=-1;
                    length--;
                }
            }
        }
        for (int i = 0; i < a.length; i++) {
            if (a[i][0]!=-1){
                System.out.print("["+a[i][0]+","+a[i][1]+"]");
            }
        }
    }
}
