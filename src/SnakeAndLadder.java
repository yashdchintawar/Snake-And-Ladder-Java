public class SnakeAndLadder {
    public static void main(String[] args) {
        System.out.println("Snake And Ladder Game Is started");
        int min=1;
        int max=6;
        int user1 = 0;
        int count =0;

        System.out.println("Player Position Is: "+user1);

        int dice = (int) Math.floor(Math.random() * (max - min + 1) + min);
        System.out.println("Player Dice Number Is: "+dice);

        while(user1 <= 100) {

            dice = (int) Math.floor(Math.random() * (max - min + 1) + min);
            System.out.println("Player Dice Number Is: " + dice);

            int predict = (int) Math.floor(Math.random() * 3);

            if (predict == 1) {
                System.out.println("You Got Ladder");
                user1 = user1 + dice;
            }
            else if (predict == 2) {
                System.out.println("You Got Snake");
                user1 = user1 - dice;
            }
            else {
                System.out.println("You Got No Play");
            }

            count++;

        }

        System.out.println("User Won In: "+count);
    }
}
