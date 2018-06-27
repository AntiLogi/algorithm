package com.ayyovei.algorithm.workbreak;

import java.util.HashSet;
import java.util.Set;

/**
 * @description
 * Given a string s and a dictionary of words dict, determine if s can be segmented into a
 * space-separated sequence of one or more dictionary words.
 * For example, given s = "leetcode",
 * dict = ["leet", "code"].
 * Return true because "leetcode" can be segmented as "leet code".
 *
 * @author chenxiaobin
 * @description
 * @create 2018/6/27
 */
public class WorkBreak {

    public static boolean solution(String source,Set<String> dict){
        return solution(source,source.length()-1, dict);
    }

    public static boolean solution(String source,int index,Set<String> dict){
        if(index<0){
            return true;
        }
        boolean result = false;
        for (int i = index; i >=0; i--) {
            if(result){
                break;
            }
            String sub = source.substring(i);
            if (dict.contains(sub)){
                result = solution(source.substring(0,i),i-1,dict);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        String s = "leetcode";
        HashSet<String> dict = new HashSet<>();
        dict.add("le");
        dict.add("et");
        dict.add("code");
        dict.add("eetcode");
        boolean solution = solution(s, dict);
        System.out.println(solution);

    }

}
