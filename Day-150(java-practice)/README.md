Map Interface: HashMap, LinkedHashMap, TreeMap, Hashtable


    📚 Concepts Covered

Map stores key–value pairs

All keys are unique

Values may duplicate

Common Implementations: HashMap, LinkedHashMap, TreeMap, Hashtable


    Use Cases

HashMap → general-purpose lookups

LinkedHashMap → ordered caching (e.g., LRU Cache)

TreeMap → sorted data views

Hashtable → thread-safe legacy code


    Comparison Table

Map Type	Order Maintained	Allows Null	    Thread Safe	    Internal Structure

HashMap	        ❌ No	            ✅ Yes	    ❌ No	    Hash Table

LinkedHashMap	✅ Insertion	        ✅ Yes	    ❌ No	    Linked + Hash Table

TreeMap	        ✅ Sorted (by Key)	❌ No	    ❌ No	    Red-Black Tree

Hashtable	    ❌ No	            ❌ No	    ✅ Yes	    Hash Table