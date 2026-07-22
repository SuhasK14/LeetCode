class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        // get val and call dfs
        return dfs(image, sr, sc, color, image[sr][sc]);
    }
    private int[][] dfs(int[][] image, int sr, int sc, int color, int val) {
        // check bounds of image
        if (sr < 0 || sr >= image.length || sc < 0 || sc >= image[0].length) {
            return image;
        }
        // check if different color present or if value has already been filled by new color
        if (image[sr][sc] != val || image[sr][sc] == color) {
            return image;
        }
        // set to new color
        image[sr][sc] = color;
        // call dfs on all adjacent areas
        image = dfs(image, sr + 1, sc, color, val);
        image = dfs(image, sr - 1, sc, color, val);
        image = dfs(image, sr, sc + 1, color, val);
        image = dfs(image, sr, sc - 1, color, val);
        return image;
    }
}
