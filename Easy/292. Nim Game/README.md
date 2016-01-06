# nimGame


Think about this question in math. when there are 1 stone-true; 2 stone-true; 3 stone-true; 4 stone-false; 5 stone-true; 6 stone-true; 7 stone-true; 8 stone-false; thus we can analyse stone can be divided by 4, then it is false. so we can have:

public class Solution { public boolean canWinNim(int n) { if(n%4==0) return false; return true; } }

