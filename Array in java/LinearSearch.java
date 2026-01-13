








public class LinearSearch {
public static int linearSearch(int number[],int key){
    for(int i=0;i<number.length;i++){
        if(number[i]==key){
        return i;
        }
    }
    return -1;

}
public static void main(String args[]){
    int number[]={2,4,6,8,10,12,14,16,18};
    int key = 16;
    int idx = linearSearch( number,key);
    if(idx==-1){
        System.out.println("key is not found");
    }else{
        System.out.println("key found at idx" + idx);
    }
}
    
}
