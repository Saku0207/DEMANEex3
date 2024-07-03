import  java.util.Random;

public class HeadsOrTails{
    public static void main(String[] args) {
        System.err.println("Tossing a coin...");

        Random random = new Random();
        int head = 0;
        int tail = 0;

        for(int i = 1; i<= 3;i++){
           boolean Heads = random.nextBoolean();
           if(Heads){
            System.err.println("Round " + i+ ": Heads");
            head++;
           }else{
            System.err.println("Round "+i+ ": Tails");
            tail++;
           }
         }
         System.err.println("Heads: " + head+ ", Tails: " + tail);
        
         if(head > tail){
            System.err.println("You won!!!!!!");
         }else{
            System.err.println(" You lost....");
         }
        }
    }
