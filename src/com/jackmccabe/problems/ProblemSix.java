package com.jackmccabe.problems;

public class ProblemSix {

    public long getRoutes(int size)
    {
        int gridSize = size + 1; //Uses grid points as size, so the user will enter need to enter 3 for 2
        long[][] matrix = new long[gridSize + 1][gridSize + 1];
        matrix[gridSize - 1][gridSize - 1] = 1;
        for (int x = gridSize - 1; x >= 0; x--)
        {
            for (int y = gridSize - 1; y >= 0; y--)
            {
                if (x == gridSize - 1 && y == gridSize - 1)
                {
                    matrix[x][y] = 1;
                }
                else
                {
                    matrix[x][y] = matrix[x + 1][y] + matrix[x][y + 1];
                }
            }
        }
        return matrix[0][0];
    }
}
