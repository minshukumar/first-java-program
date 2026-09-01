
class CountEvenNumber {
        public static void main(String argus[]){
            int numbers[] = {10,15,20,25,30};
            int count = 0;

            for(int i = 0;i<numbers.length;i++){
                if(numbers[i]%2==0){
                    count++;
                }

            }
            System.out.println("NO OF EVEN NO IN THIS ARRAY IS:" + count);
        }
    
}
