package easy;

public class ArmStrongNumber {
    public static void main(String[] args) {
        System.out.println(new ArmStrongNumber().isArmstrong(123));
        
    }

    public boolean isArmstrong(int n){
        int len = String.valueOf(n).length();
        long sum = 0;
        int N = n;
        while(n>0){
            int a = n%10;
            sum+=pow(a,len);
            n = n/10;
            System.out.println(a + " "+ sum + " "+ n);
        }

        return sum == N;
    }

    public long pow(int s, int p){
        long ans = 1L;
        for(int i = 0;i<p;i++){
            ans*=s;
        }
        return ans;
    }


    
}