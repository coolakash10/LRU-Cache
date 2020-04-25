# LRU-Cache
Implementation of LRU Cache

LRU : Least recently used cache

The LRU caching scheme is to remove the least recently used frame when the cache is full and 
a new page is inserted which is not there in cache.

There are mainly two operations in LRU Cache algorithm

      1. get(key)       : return value of key if key present else return -1;
      2. put(key,value) : insert key and value in cache memory, 
                          if cache is full remove least recently used key, value pair and insert new pair.
                          
For two opeartions to perform in 0(1) time complexity we use following algorithm

      1. get operation  : hash table based algorithm
      2. put operation  : Double linked list based algorithm
      
In java we can implement above two algorithm using common algorithm
            
      LinkedHashMap : Linked list + Hash table
            
