package e002.interfaces;

class Calculator implements AdvancedArithmetic {
    public int divisorSum(int n) {
        int s = 0;
        for(int i = 1; i <= n ; i++){
            if(n%i==0){
                s=s+i;
            }
        }
        return s;
    }
}