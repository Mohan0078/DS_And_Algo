class Boat_With_People {
    public int numRescueBoats(int[] people, int limit) {
        // using the two pointer technique for solving this 
        // left pointer
        int i = 0;
        // right pointer
        int j = people.length;
        j--;
        // for storing the answer
        int cnt = 0;
        // sorting the array
        Arrays.sort(people);
        
        // running the two pointer
        while(i<=j)
        {
            // adding the both persong with
            // the lowest and highest weight
            // to the boat
            if(people[i]+people[j]<=limit)
            {
                cnt++;
                i++;
                j--;
            }
            else
            {
                // adding the the person to the boat 
                // with highest weight
                cnt++;
                j--;
            }
        }
        
        // returning the answer
        return cnt;
    }
}