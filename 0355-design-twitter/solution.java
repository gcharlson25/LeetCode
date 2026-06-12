class Twitter {

    private HashMap<Integer, ArrayList<int[]>> tweets;
    private HashMap<Integer, HashSet<Integer>> following;
    private int timestamp;

    public Twitter() {
        tweets = new HashMap<>();
        following = new HashMap<>();
        timestamp = 0;
    }
    
    public void postTweet(int userId, int tweetId) {
        int[] tweet = new int[2];
        if(tweets.get(userId) == null) {
            ArrayList<int[]> list = new ArrayList<>();
            tweet[0] = tweetId;
            tweet[1] = timestamp;
            list.add(tweet);
            tweets.put(userId, list);
        }
        else {
            tweet[0] = tweetId;
            tweet[1] = timestamp;
            tweets.get(userId).add(tweet);
        }
        timestamp++;
    }
    
    public List<Integer> getNewsFeed(int userId) {
        PriorityQueue<int[]> heap = new PriorityQueue<>((a, b) -> b[1] - a[1]);
        if (following.get(userId) != null) {
            for(int followeeId : following.get(userId)) {
                if(tweets.get(followeeId) != null) {
                    for(int[] tweet : tweets.get(followeeId)) {
                        heap.add(tweet);
                    }
                }    
            }
        }
        if(tweets.get(userId) != null) {
            for(int[] tweet : tweets.get(userId)) {
                heap.add(tweet);
            }
        }
        ArrayList<Integer> recent = new ArrayList<>();
        for(int i = 0; i < 10 && !heap.isEmpty(); i++) {
            recent.add(heap.poll()[0]);
        }
        return recent;
    }
    
    public void follow(int followerId, int followeeId) {
        if(following.get(followerId) == null) {
            HashSet<Integer> set = new HashSet<>();
            set.add(followeeId);
            following.put(followerId, set);
        }
        else{
            following.get(followerId).add(followeeId);
        }
    }
    
    public void unfollow(int followerId, int followeeId) {
        if(following.get(followerId) != null) {
            following.get(followerId).remove(followeeId);
        }
    }
}

/**
 * Your Twitter object will be instantiated and called as such:
 * Twitter obj = new Twitter();
 * obj.postTweet(userId,tweetId);
 * List<Integer> param_2 = obj.getNewsFeed(userId);
 * obj.follow(followerId,followeeId);
 * obj.unfollow(followerId,followeeId);
 */
