








public class LargestNumber {
    public static int getLargestNum(int number[]){
    int largest= Integer.MIN_VALUE;
    for(int i=0;i<number.length;i++){
        if(number[i]>largest){
            largest=number[i];
        }
    }
    return largest;

    }
    public static void main(String args[]){
    int number[]={1,2,5,7,9};
    // Print largest
    int ans = getLargestNum( number);
    System.out.println("Largest number is" + ans);
    }
    
    
}
