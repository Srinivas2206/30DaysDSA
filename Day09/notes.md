## Key Learnings from Group Anagrams Problem

- Stop comparing things pair-by-pair. It leads to O(n²)
- Instead, use hashing to avoid comparisons
- Turn "similar objects" into a unique signature  
  (Anagrams → same frequency of characters)

- This idea appears everywhere:

| Problem            | Signature       |
|--------------------|-----------------|
| Anagrams           | char frequency  |
| Subarrays          | prefix sum      |
| Sliding window     | freq map        |
| Isomorphic strings | pattern map     |

- HashMap is a grouping machine  
  (whenever there is "group", "cluster", "same type", "same pattern")

- I picked up:
  - putIfAbsent() / computeIfAbsent()
  - frequency arrays
  - signature building
  - clean HashMap usage
