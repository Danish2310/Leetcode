class Solution {
    public int matchPlayersAndTrainers(int[] players, int[] trainers) {
        int m=players.length;
        int n=trainers.length;
        int i=0;
        Arrays.sort(players);
        Arrays.sort(trainers);
        int count=0;
        for(int j=0;i<m&&j<n;j++){
            if(players[i]<=trainers[j]){
                count++;
                i++;
            }
        }
        return count;

        
    }
}