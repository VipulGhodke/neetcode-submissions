class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>>map = new HashMap<>();
        for(int i=0;i<strs.length;i++){
            char[] chars = strs[i].toCharArray();
            Arrays.sort(chars);
            String sortedString = new String(chars);

            if(!map.containsKey(sortedString)){
                map.put(sortedString, new ArrayList<>());
            } 
            map.get(sortedString).add(strs[i]);
        }
        List<List<String>> list = new ArrayList<>(map.values());
        return list;
    }
}
