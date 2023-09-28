import java.util.Map;
import java.util.TreeMap;

class SolutionJava {
    public Map<Integer, Integer> getMapFromArray(int[] nums) { //использовала массив, но работа со списком анологичная
        Map<Integer, Integer> map = new TreeMap<>();// выдает отсортированными значения по возрастанию
        //Map<Integer,Integer> map = new HashMap<>();// исп., когда порядок не важен
        for (int num : nums) {
            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 1);
            }
        }
        return map;
    }
}