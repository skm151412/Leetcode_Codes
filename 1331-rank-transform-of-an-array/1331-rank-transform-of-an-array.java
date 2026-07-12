class Solution {
    public int[] arrayRankTransform(int[] arr) {
                TreeMap<Integer, Integer> map = new TreeMap<>();

        for (int x : arr)
            map.put(x, 0);

        int rank = 1;
        for (int key : map.keySet())
            map.put(key, rank++);

        for (int i = 0; i < arr.length; i++)
            arr[i] = map.get(arr[i]);

        return arr;

    }
}