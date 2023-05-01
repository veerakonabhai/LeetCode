class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int original = image[sr][sc];
        
        return floodFillRecursion(image, sr, sc, original, color);
    }
    
    //recursino call to check for 4 directions
    public int[][] floodFillRecursion(int[][] image, int sr, int sc, int original, int color){
        //base cse of out of bounds or already colored or not the original to return image
        if(sr < 0 || sr > image.length -1 || sc < 0 || sc >image[0].length-1 || image[sr][sc] != original || image[sr][sc] == color){
            return image;
        }
        
        //color the block and check for all directions
        image[sr][sc] = color;
        floodFillRecursion(image, sr+1, sc, original, color);
        floodFillRecursion(image, sr-1, sc, original, color);
        floodFillRecursion(image, sr, sc+1, original, color);
        floodFillRecursion(image, sr, sc-1, original, color);
        return image;
    }
}