package com.example.combinationsumll;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Given a set of candidate numbers (candidates) (without duplicates) and a target number (target), find all unique
// combinations in candidates where the candidate numbers sums to target.
public class Combinationsumll {

    public static List<List<Integer>> findcombinations(int arr[], int target){
        List<List<Integer>> result=new ArrayList<>();
        Arrays.sort(arr);
        combinations( arr,0, target,new ArrayList<>(), result);

        return result;
    }


    public static void combinations(int arr[], int start, int target, List<Integer> current,List<List<Integer>> result){

        if (target==0){
        result.add(new ArrayList<>(current));
        return;
        }


            for(int i=start;i<arr.length;i++){
                if(i!=start && arr[i]==arr[i-1]){
                    continue;

                }
                if (arr[i]>target)
                {
                    break;
                }

                    current.add(arr[i]);
                    combinations( arr,i+1, target-arr[i], current, result);
                    current.remove(    current.size()-1);


            }


    }



}
