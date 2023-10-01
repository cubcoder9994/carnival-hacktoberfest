import java.util.*;
class binarySearch{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int arr[] = new int[50];
    for(int i=0;i<50;i++) arr[i]=sc.nextInt();
    Arrays.sort(arr);
    int sv = sc.nextInt();
    int l=0,h=49;
    while(l<=h)
    {
        int mid=(l+h)/2;
        if(arr[mid]<sv) l=mid+1;
        else if(arr[mid]>sv) h=mid-1;
        else{
           System.out.println("Value found at index = "+mid);
           break;
        }
    }
    System.out.println("Not found");
  }
}
