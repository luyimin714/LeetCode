package HashTable;

public class H_Index {
    public int hIndex(int[] citations) {
        if(citations.length == 0)
            return 0;
        int length = citations.length;
        int[] map = new int[length+1];
        for(int i = 0; i < length; i++){
            if(citations[i] > length)
                map[length] += 1;
            else
                map[citations[i]] += 1;
        }
        int times = 0;
        //int H_index = 0;
        for(int i = length; i >= 0; i--){
            times += map[i];
            if(times >= i)
                return i;
        }
        return 1;
    }
}
