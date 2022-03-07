public class SnakeAndLadder {
    public static void main(String[] args) {
        System.out.println("Snake And Ladder Game Is started");
        int min=1;
        int max=6;
        int user1 = 0;

        System.out.println("Player Position Is: "+user1);

        int dice = (int) Math.floor(Math.random() * (max - min + 1) + min);
        System.out.println("Player Dice Number Is: "+dice);
    }
}
