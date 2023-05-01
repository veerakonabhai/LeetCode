/**
 * @param {number[][]} image
 * @param {number} sr
 * @param {number} sc
 * @param {number} color
 * @return {number[][]}
 */
var floodFill = function(image, sr, sc, color) {
    //const to have original value
    const original = image[sr][sc];
    
    //function recursion to check all side
    function floodFill(image, sr, sc){
        //if out of bounds or not the original value to fill or already have color then just return
        if(sr < 0 || sr > image.length -1 || sc < 0 || sc > image[0].length -1 || image[sr][sc] !== original || image[sr][sc] === color){
            return image;
        }
        
        //color the image if nothing above happens
        image[sr][sc] = color;
        
        //now recursion call to all 4 directions
        floodFill(image, sr+1, sc);
        floodFill(image, sr-1, sc);
        floodFill(image, sr, sc+1);
        floodFill(image, sr, sc-1);
        
        return image;
    }
    
    return floodFill(image, sr, sc);
    
};