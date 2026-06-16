class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> answer = new ArrayList<>();
        backtrack(new ArrayList<>(), 0, candidates, target, answer);
        return answer;

    }

    public void backtrack(List<Integer> current, int start, int[] candidates, int target, List<List<Integer>> answer) {
        if (target == 0) {
            answer.add(new ArrayList<>(current));
        }
        if (target < 0) {
            return;
        }
        for (int i = start; i < candidates.length; i++) {
            current.add(candidates[i]);
            backtrack(current, i, candidates, target - candidates[i], answer);
            current.remove(current.size() - 1);
        }
    }
}
