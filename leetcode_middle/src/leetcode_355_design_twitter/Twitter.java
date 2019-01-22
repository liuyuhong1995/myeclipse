package leetcode_355_design_twitter;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

/*
 * 思路: 保存已有的推特： usr, id  按照顺序  List<T> []
 * 		保存用户的粉丝： 使用
 */
@SuppressWarnings("rawtypes")
class Twitter {
	
	List<TwitterNode> tList;
	Map<Integer, Set> usrInfo;
    /** Initialize your data structure here. */
    public Twitter() {
        this.tList = new LinkedList<TwitterNode>();
        this.usrInfo = new HashMap<Integer, Set>();
    }
    
    /** Compose a new tweet. */
    public void postTweet(int userId, int tweetId) {
        if(!this.usrInfo.containsKey(userId)){
        	Set<Integer> set = new HashSet<Integer>();
        	set.add(userId);
        	this.usrInfo.put(userId, set);
        }
        TwitterNode node = new TwitterNode(userId, tweetId);
        this.tList.add(0, node);
    }
    
    /** Retrieve the 10 most recent tweet ids in the user's news feed. Each item in the news feed must be posted by users who the user followed or by the user herself. Tweets must be ordered from most recent to least recent. */
    public List<Integer> getNewsFeed(int userId) {
        List<Integer> result = new LinkedList<Integer>();
        if(this.usrInfo.containsKey(userId)){
        	Set<Integer> follows = this.usrInfo.get(userId);
        	int count = 0;
        	for(TwitterNode node : this.tList){
        		if(count == 10)  break;
        		if(follows.contains(node.userId)){
        			result.add(node.twitterId);
        			count ++;
        		}
        	}
        }
    	return result;
    }
    
    /** Follower follows a followee. If the operation is invalid, it should be a no-op. */
    public void follow(int followerId, int followeeId) {
        Set<Integer> set;
        if(!usrInfo.containsKey(followeeId)){
        	set = new HashSet<Integer>();
        	set.add(followeeId);
        	this.usrInfo.put(followeeId, set);
        }
        if(!usrInfo.containsKey(followerId)){
        	set = new HashSet<Integer>();
        	set.add(followerId);
        	this.usrInfo.put(followerId, set);
        }
        this.usrInfo.get(followerId).add(followeeId);
    }
    
    /** Follower unfollows a followee. If the operation is invalid, it should be a no-op. */
    public void unfollow(int followerId, int followeeId) {
        if(followeeId != followerId && this.usrInfo.containsKey(followerId))
        	if(this.usrInfo.containsKey(followeeId))
        		this.usrInfo.get(followerId).remove(followeeId);     
    }
}

class TwitterNode{
    int userId;
    int twitterId;
    TwitterNode(int userId,int twitterId){
        this.userId = userId;
        this.twitterId = twitterId;
    }
}

