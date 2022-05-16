class Solution {
    public int distanceBetweenBusStops(int[] distance, int start, int destination) {
        int x = 0, y = 0;
        int current = start;
        
        while(current!=destination) {
            x += distance[current];
            current++;
            if(current == distance.length) 
                current = 0;
        }
        
        current = start;
        
        while(current!=destination) {
            current--;
            if(current < 0)
                current = distance.length-1;
            y += distance[current];
        }
        
        return Math.min(x, y);
    }
}