import java.util.ArrayList;

public class Sum {

    public static void main(String[] args) {
        
    }
    public static int sum(ArrayList<Integer> numbers){
        int sum = 0;
        for(int i = 0; i < numbers.size(); i++){
            
            sum = sum + numbers.get(i);
            
        }
        return sum;
    }
}
