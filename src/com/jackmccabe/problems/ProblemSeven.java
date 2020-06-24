package com.jackmccabe.problems;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ProblemSeven {

    private static final int heightOfTree = 100;
    private final String fileName = "triangle.txt";
    private int[][] tree;

    public int maxValue() throws IOException {
        readTree();

        for (int i = ProblemSeven.heightOfTree - 2; i >= 0; i--)
            for (int j = 0; j <= i; j++)
                tree[i][j] += tree[i + 1][j] > tree[i + 1][j + 1] ? tree[i + 1][j] : tree[i + 1][j + 1];

        return tree[0][0];
    }

    private void readTree() throws IOException {
        tree = new int[ProblemSeven.heightOfTree][];

        BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName));
        for (int i = 0; i < ProblemSeven.heightOfTree; i++) {
            tree[i] = new int[i + 1];
            String[] values = bufferedReader.readLine().split(" ");
            for (int j = 0; j <= i; j++)
                tree[i][j] = Integer.parseInt(values[j]);
        }
    }
}
