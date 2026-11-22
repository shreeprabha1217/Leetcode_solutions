
class Solution {
    public int maximumPoints(int mat[][]) {
        int n = mat.length;

        int[] prev = new int[4];
        prev[0]=Math.max(mat[0][1],mat[0][2]);
        prev[1]=Math.max(mat[0][0],mat[0][2]);
        prev[2]=Math.max(mat[0][1],mat[0][0]);
        prev[3]=Math.max(mat[0][1],Math.max(mat[0][2],mat[0][1]));
        for(int day=1;day<n;day++){
              int[] temp=new int[4];
            for(int last=0;last<4;last++){
               temp[last]=0;
                int maxi=0;
                for (int task = 0; task < 3; task++) {
                    if (task != last) {

                       temp[last] = Math.max(temp[last], mat[day][task]
                            + prev[task]);
                    }
                 }
                
            }
            prev=temp;
        }
        return prev[3];
    }
}
