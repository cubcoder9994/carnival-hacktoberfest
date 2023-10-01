import java.util.*;
class linearSearch{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int arr[] = new int[50];
    for(int i=0;i<50;i++) arr[i]=sc.nextInt();
    int sv = sc.nextInt();
    for(int i=0;i<50;i++){
      if(arr[i]==sv){
        System.out.println("Value found at index = "+i);
        break;
      }
    }
    System.out.println("Not found");
  }
}
