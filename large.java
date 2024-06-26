 class Test {  
    public static void main(String[] args) {  
  
        int arr[] = {18,2,4,9,6};    
        int max = arr[0];  
        for (int i = 0; i < arr.length; i++) {   
           if(arr[i] > max)  
               max = arr[i];  
        }  
        System.out.println("Largest element is: " + max);  
    }  
}  