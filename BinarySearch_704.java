import java.util.Arrays;
import java.util.HashMap;

public class BinarySearch_704 {

//    public int firstBadVersion(int n) {
//        HashMap<Integer, Boolean> map = new HashMap<>();
////        return LiorSpliterator(1, n, map);
//    }

//    private int LiorSpliterator(int start, int end, HashMap<Integer, Boolean> map) {
//
//        int middle = start + (end - start) / 2;
//        boolean middleBoolean, middleBoolean2;
//        if (map.containsKey(middle))
//            middleBoolean = map.get(middle);
//        else {
//            middleBoolean = isBadVersion(middle);
//            map.put(middle, middleBoolean);
//        }
//        if (map.containsKey(middle-1))
//            middleBoolean2 = map.get(middle-1);
//        else {
//            middleBoolean2 = isBadVersion(middle-1);
//            map.put(middle-1, middleBoolean2);
//        }
//
//
//
//        if (middleBoolean && !middleBoolean2)
//            return middle;
//
//        if (middleBoolean)
//            return LiorSpliterator(start, middle-1, map);
//
//        else
//            return LiorSpliterator(middle+1, end, map);
//    }
}
