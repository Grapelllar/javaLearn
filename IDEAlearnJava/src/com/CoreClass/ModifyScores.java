package com.CoreClass;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ModifyScores {
    public static void main(String[] args) {
//        int[] scores = new int[]{88,77,51,66}; 直接使用引用传值，会导致类中引用的参数被修改。
        int[] scores = new int[]{88, 77, 51, 66};
//        Score s = new Score(scores.clone());方法一
        Score s = new Score(scores);
        s.printScores();
        scores[2] = 100;
        s.printScores();
    }
}

class Score {
    private int[] scores;

    public Score(int[] scores) {
        this.scores = Arrays.copyOf(scores,scores.length);
        //copy 会新建数据对象
    }

    public void printScores() {
        System.out.println(Arrays.toString(scores));
    }
}
