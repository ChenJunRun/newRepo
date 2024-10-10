package com.deepblue;

import java.util.Date;

public class Test {

                 public static void main(String[] args) {
                     int arr[]={3,5,1,2};
                     fastSort(arr, 0, arr.length-1);

                    /* for(int i:arr){
                         System.out.println(i);
                     }*/
                     System.out.println(new Date().getTime());
                     System.out.println(Long.MAX_VALUE);
                 	}

          public static   void fastSort(int[] arr,int l,int r){
                if(l>=r || arr==null){
                    return;
                }

                int i=l;
                int j=r;
                int key=arr[i];

                while (i<j){
                    while (i<j && key<=arr[j]){
                        j--;
                    }

                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;

                    while (i<j && arr[i]<=key){
                        i++;
                    }


                    int temp2=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp2;
                }

              fastSort(arr,l,i-1);
              fastSort(arr,i+1,r);
          }




}
