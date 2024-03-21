public class OffByN {
    int n;
    public  OffByN(int N){
        n=N;
    }
    public boolean equalChars(char x, char y){
        return Math.abs(x-y)==n;
    }
}
