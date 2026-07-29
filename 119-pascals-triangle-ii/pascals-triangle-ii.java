class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> pascal = new ArrayList<>();
        for(int i = 0; i < rowIndex+1; i++){
            List<Integer> row = new ArrayList<>();
            for(int j = 0; j <= i; j++){
                if (j == 0 || j == i){
                    row.add(1);
                }
                else{
                    row.add(pascal.get(i-1).get(j) + pascal.get(i-1).get(j-1));
                }
            }
            pascal.add(row);
        }
        List<Integer> row = pascal.get(rowIndex);
        return row;   
    }
}