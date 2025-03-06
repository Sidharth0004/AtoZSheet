package PriorityQueue;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class MergeKSorted {
     
    //Function to return the sorted array.
    ArrayList <Integer> nearlySorted(int arr[], int num, int k)
    {
        // your code here
        ArrayList<Integer> list = new ArrayList<>();
        PriorityQueue<Integer> q = new PriorityQueue<Integer>();
        for(int i = 0 ;i<arr.length;i++){
            q.offer(arr[i]);
            if(q.size()>k){
                list.add(q.poll());
            }
        }
        while(!q.isEmpty()){
            list.add(q.poll());
        }
        return list;
    }}
