class Solution {
    public boolean checkStraightLine(int[][] coordinates) {
       if(coordinates.length<=2){   return true;    } // 2 points - a straight line
       int x1 = coordinates[0][0] , y1 = coordinates[0][1] , x2 = coordinates[1][0] , y2 =coordinates[1][1];
       int dx = x2-x1, dy = y2-y1;
       for(int i=2;i<coordinates.length;i++){
        int x = coordinates[i][0],y = coordinates[i][1];
        if((x-x1)*dy != (y-y1)*dx){     return false;   } // dy/dx = y-y1/x-x1(for stright line) not equals == not straight line - returns false 
       }
       return true;
    }
}
