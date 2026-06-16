class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(candidates);
        backtrack(new ArrayList<>(), 0, candidates, target, result);
        return result;
    }

    public void backtrack(List<Integer> current, int start, int[] candidates, int target, List<List<Integer>> result) {
        if (target < 0) {
            return;
        }
        if (target == 0) {
            result.add(new ArrayList<>(current));
        }
        for (int i = start; i < candidates.length; i++) {
            if(i > start && candidates[i] == candidates[i-1]) {
                continue;
            }
            current.add(candidates[i]);
            backtrack(current, i + 1, candidates, target - candidates[i], result);
            current.remove(current.size() - 1);
        }
    }
}
