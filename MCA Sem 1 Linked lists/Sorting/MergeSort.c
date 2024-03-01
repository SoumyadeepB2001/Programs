#include<stdio.h>
void merge(int arr[],int si,int mid,int ei){
    int temp[ei-si+1];
    int size = sizeof(temp) / sizeof(temp[0]);
    int i=si;//iterator for left part
    int j=mid+1;//iterator for right part
    int k=0;
    while(i<=mid && j<=ei){//this while loop check that i follow the range form starting to mid 
    // and j from mid+1 to ei
        if(arr[i]>arr[j]){
            temp[k]=arr[j];
            j++;
        }else{
            temp[k]=arr[i];
            i++;
        }
        k++;
    }

    //for incomplete left part
    while(i<=mid){
        temp[k++]=arr[i++];
    }
    //for incomplete right part
    while(j<=ei){
        temp[k++]=arr[j++];
    }

    for(int k=0,i=si;k<size;k++,i++){
        arr[i]=temp[k];
    }
    
}
void mergeSort(int arr[],int si,int ei){
    //here si=> starting index
    //here ei=> ending index
    if(si>=ei){
        return;
    }
    int mid=si+(ei-si)/2;
    mergeSort(arr,si,mid);
    mergeSort(arr,mid+1,ei);
    merge(arr,si,mid,ei);
}

int main(){
    int arr[]={26,33,-9,53,2,8,-2};
    int size = sizeof(arr) / sizeof(arr[0]);
    for(int i=0;i<size;i++){
        printf("%d ",arr[i]);
    }
    mergeSort(arr,0,size-1);

    printf("\nAfter sorting: ");
    for(int i=0;i<size;i++){
        printf("%d ",arr[i]);
    }
    return 0;
}