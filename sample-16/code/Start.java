class Start{
    public static void main(String [] data){
    int[] score = { 8, 5, 4, 2, 7, 1, 9, 3 };
        for(int i = 0; i < data.length; i++){
            System.out.println(data[i]);
        }
        Book b = new Book();
        System.out.println("Max : " + b.findMax(score));
        System.out.println("Min : " + b.findMin(score));
        System.out.println("Sum : " + b.findSum(score));
        System.out.println("Count : " + b.findCount(score));
        System.out.println("Duplicate : " + b.findDuplicate(score));
        System.out.println("Average : " + b.findAverage(score));

    }
}
class Book{
    int findMax(int[] data){
       int max = 0;
       for (int i = 0; i < data.length; i++){
           if(max < data[i]) max = data[i];
       }
       return max;
   }
   static int findMin(int[] data){
       int min = 0;
       for (int i = 0; i < data.length; i++){
           if(min > data[i]) min = data[i];
       }
       return min;
   }
   static int findCount(int[] data){
       int count = 0;
       for(int i = 0; i < data.length; i++){
           count = data.length;
       }
       return count;
   }
   static boolean findDuplicate(int[] data){
       boolean flag = false;
       for(int i = 0; i < data.length; i++){
           for (int j = 0; j < data.length; j++){
               if(data[i] == data[j]) flag = true;
           }
       }
       return flag;
   }
   static int findSum(int[] data){
       int sum = 0;
       for(int i = 0; i < data.length; i++){
           sum += data[i];
       }
       return sum;
   }
   static double findAverage(int[] data){
       double result = 0;
       double avg = 0;
       for(int i = 0; i < data.length; i++){
           result += data[i];
           avg = result / data.length;
       }
       return avg;
   }
}