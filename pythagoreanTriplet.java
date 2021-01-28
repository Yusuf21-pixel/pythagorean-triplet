import java.util.Scanner;
class pythagoreanTriplet {
  static Scanner kbd=new Scanner(System.in);
  public static void main(String[] args) {
    int cnt=0;
    System.out.print("Enter the size of an array : ");
    int size=kbd.nextInt();
    if(size>2) {
       int[] arr=new int[size];
       System.out.println("Enter array values : ");
       for(int i=0;i<size;i++) 
         arr[i]=kbd.nextInt();
       System.out.println("*************************************");
       pythagoreanTriplet(arr);
    }
    else
       System.out.println("Array Size should be greater than 2 cannot proceed");
  }
  public static void pythagoreanTriplet(int[] ar) {
    int cnt=0;
    for(int i=0;i<ar.length;i++) {
      for(int j=i+1;j<ar.length;j++) {
        for(int k=0;k<ar.length;k++) {
          if(k != i && k != j) {
             if((ar[i]*ar[i])+(ar[j]*ar[j])==(ar[k]*ar[k])) {
                cnt++;
                if(cnt==1) 
                   System.out.println("Pythagorean triplet Exist\n*************************************");
                System.out.print("( Triplet No : "+cnt+" )\nElement no : "+(i+1)+" value : "+ar[i]+"\nElement no : "+(j+1)+" value : "+ar[j]+"\nEquals => "+"Element no : "+(k+1)+" value : "+ar[k]+"\n*************************************\n");
             }
          }
        }
      }
    }
    if(cnt==0)
       System.out.println("No pythagorean triplet exist in this array");
    else
      System.out.println("Total No of triplets : "+cnt+"\n*************************************");
  }
}