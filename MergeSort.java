public class MergeSort {
    static void merge(int arr[],int l,int m,int r){
        int temp[]=new int [r-l+1];
        int idx1=l;
        int idx2=m+1;
        int x=0;
        while(idx1<=m && idx2 <=r){
            if(arr[idx1]<=arr[idx2])

                temp[x++] = arr[idx1++];
            
            else

                temp[x++]=arr[idx2++];
            

        }
        while(idx1<=m){
            temp[x++] = arr[idx1++];
        }
        while(idx2 <=r){
            temp[x++]=arr[idx2++];
        }
        for(int i=0,j=l;i<temp.length;i++,j++)
        arr[j]=temp[i];


    }
    static void div(int arr[],int l,int r){
        if(l>=r) return;
        int m=l+(r-l)/2;
        div(arr,l,m);
        div(arr,m+1,r);
        merge(arr,l,m,r);
    }
    public static void main(String[] args) {
        int arr[]=new int[]{4,2,1,6,7};
        int n= arr.length;
        div(arr,0,n-1);
        for(int i=0;i<n;i++){
            System.out.print(arr[i] +" ");
        }
        System.out.println();

    }
}
