class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        int n = heights.length;  
        int temp = 0;
        String tmp = "";
         for(int i=0; i < n; i++){  
                 for(int j=1; j < (n-i); j++){  
                          if(heights[j-1] < heights[j]){  
                                 //swap elements  
                                 tmp = names[j-1];  
                                 names[j-1] = names[j];  
                                 names[j] = tmp; 
                                 temp = heights[j-1];  
                                 heights[j-1] = heights[j];  
                                 heights[j] = temp; 
                              
                         }  
                          
                 }  
    }
        return names;
}
}
