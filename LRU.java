/*********************************************************************************************************************
     **
     **  LRU Cache Algorithm
     **  Problem : https://leetcode.com/problems/lru-cache/
     **  Input is put operation(key,value)
     **  Output is get operation return value of key
     
     **  Written By:    Akash Vishwas Londhe
     **
*********************************************************************************************************************/

//import package
import java.util.*;

class LRUCache 
{
    static int capacity;

    LinkedHashMap<Integer,Integer>map=new LinkedHashMap<>();

    public LRUCache(int capacity) 
    {
        LRUCache.capacity=capacity; 
    }
    
    public int get(int key) 
    {
        if(map.containsKey(key))    
        {
            int value=map.get(key);
            map.remove(key);
            map.put(key,value);
            return value;
        }
        return -1;
    }
    
    public void put(int key, int value) 
    {
            if(map.containsKey(key))
            {
                map.remove(key);
                map.put(key,value);
            }
            else if(map.size()==capacity)
            {
                map.remove(map.keySet().iterator().next());
                map.put(key,value);   
            }
            else
            {
                map.put(key,value);
            }
    }

}

public class Main
{

	public static void main(String[] args)
	{
	    
	    LRUCache lru=new LRUCache(2);
	  
        lru.put(1,5);
        lru.put(2,6);
        int ans=lru.get(1);
        System.out.println("Answer for get(1) is: "+ans);
        lru.put(3,9);
        ans=lru.get(2);
        System.out.println("Answer for get(2) is: "+ans);
        lru.put(4,8);
        ans=lru.get(1);
        System.out.println("Answer for get(1) is: "+ans);
        ans=lru.get(3);
        System.out.println("Answer for get(3) is: "+ans);
        ans=lru.get(4);
        System.out.println("Answer for get(4) is: "+ans);
	}

}
