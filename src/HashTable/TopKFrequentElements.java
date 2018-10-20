package HashTable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TopKFrequentElements {
    public List<Integer> topKFrequent(int[] nums, int k) {
        List<Integer>[] bucket = new List[nums.length+1];
        Map<Integer, Integer> map = new HashMap<>();
        for(int num : nums){
            //Map的新方法getOrDefault(Object,V)
            //允许调用者在代码语句中规定获得在map中符合提供的键的值，
            //否则在没有找到提供的键的匹配项的时候返回一个“默认值”。
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        for(int key : map.keySet()){
            int frequency = map.get(key);
            if(bucket[frequency] == null)
                bucket[frequency] = new ArrayList<>();
            bucket[frequency].add(key);
        }
        List<Integer> ans = new ArrayList<>();
        for(int i = bucket.length - 1; i >= 0 && ans.size() < k; i--){
            if(bucket[i] != null)
                ans.addAll(bucket[i]);
        }
        return ans;
    }
}
