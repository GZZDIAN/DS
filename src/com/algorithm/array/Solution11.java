package com.algorithm.array;

/**
 * 给你一幅由 N × N 矩阵表示的图像，其中每个像素的大小为 4 字节。请你设计一种算法，将图像旋转 90 度。
 * <p>
 * 不占用额外内存空间能否做到？
 * <p>
 * 示例 1:
 * <p>
 * 给定 matrix =
 * [
 * [1,2,3],
 * [4,5,6],
 * [7,8,9]
 * ],
 * <p>
 * 原地旋转输入矩阵，使其变为:
 * [
 * [7,4,1],
 * [8,5,2],
 * [9,6,3]
 * ]
 *
 *
 * 题解：对于矩阵中第 i 行的第 j 个元素，在旋转后，它出现在倒数第 i 列的第 j 个位置。
 * 我们将其翻译成代码。由于矩阵中的行列从 00 开始计数，因此对于矩阵中的元素 matrix[row][col],
 * 在旋转后，它的新位置为 matrix[col][n−row−1]。
 *
 * 这样以来，我们使用一个与 matrix 大小相同的辅助数组 matrix_new,
 * 临时存储旋转后的结果。我们遍历 matrix 中的每一个元素，根据上述规则将该元素存放到 matrix_new中对应的位置。在遍历完成之后，再将matrix_new
 * 中的结果复制到原数组中即可。
 */
public class Solution11 {
    public void rotate(int[][] matrix) {
        int[][] matrix_new = new int[matrix.length][matrix[0].length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrix_new[j][matrix.length - 1 - i] = matrix[i][j];
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[i][j] = matrix_new[i][j];
            }
        }

    }
}
























