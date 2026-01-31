# 📅 Day 15 -- Dynamic Programming (DP) Basics

## 🔑 Key Learnings

### ✅ 1. DP = Avoid Recomputations

If recursion repeats the same work → convert to DP.

------------------------------------------------------------------------

### ✅ 2. Always Define the State

Ask: \> What does dp\[i\] represent?

Examples: - dp\[i\] = number of ways to reach step i\
- dp\[i\] = minimum cost to reach i\
- dp\[i\] = best result till index i

------------------------------------------------------------------------

### ✅ 3. Build Using Transitions

General form:

dp\[i\] = best(dp\[smaller states\]) + current effect

Examples:

Climbing Stairs: dp\[i\] = dp\[i-1\] + dp\[i-2\]

Min Cost Stairs: dp\[i\] = min(dp\[i-1\], dp\[i-2\]) + cost\[i\]

------------------------------------------------------------------------

### ✅ 4. Base Cases Matter

Incorrect base cases = wrong DP solution.\
Always initialize carefully.

------------------------------------------------------------------------

### ✅ 5. Space Optimization

If DP only depends on last few states: ➡ Use variables instead of
arrays.

------------------------------------------------------------------------

## 🧠 Universal DP Template

1.  Define state\
2.  Write transition\
3.  Set base cases\
4.  Iterate\
5.  Optimize space

------------------------------------------------------------------------

## 🚩 When to Think DP

Use DP when problem involves: - Counting ways\
- Minimum or maximum cost\
- Best profit\
- Reachability\
- Optimal substructure

------------------------------------------------------------------------

## 📌 Patterns Learned

  Problem           DP Pattern
  ----------------- ------------
  Fibonacci         Basic DP
  Climbing Stairs   Ways DP
  Min Cost Stairs   Min DP
  Stock Profit      Rolling DP

------------------------------------------------------------------------

✅ End of Day 15 Learning
