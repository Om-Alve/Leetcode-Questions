class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
    int n = names.length;
    String[] ans = new String[n];
    Map<Integer, String> heightsAndNames = new TreeMap<>(Collections.reverseOrder());
    for (int i = 0; i < n; i++) {
        heightsAndNames.put(heights[i], names[i]);
    }
    int index = 0;
    for (String name : heightsAndNames.values()) {
        ans[index++] = name;
    }
    return ans;

}
}
