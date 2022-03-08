public class SnakeAndLadder {
    public static void main(String[] args) {
        System.out.println("Snake And Ladder Game Is started");
        int min=1;
        int max=6;
        int user1 = 0;
        int user2 = 0;
        int user1Count =0;
        int user2Count =0;
        int rem = 0;

        while(user1 < 100 && user2 < 100) {

            int dice = (int) Math.floor(Math.random() * (max - min + 1) + min);
            System.out.println("user1 Player Dice Number Is: " + dice);
            System.out.println("user1 Player At The Position Number: " + user1);

            int predictUser1 = (int) Math.floor(Math.random() * 3);
            if (predictUser1 == 1) {
                System.out.println("user1 You Got Ladder");
                if (user1 <= 94) {
                    user1 = user1 + dice;
                    rem = user1 - 100;
                    user1Count++;
                }
                else if (rem < 6){
                    user1 = user1 - dice;
                    user1Count++;
                }
            }
            else if (predictUser1 == 2) {
                System.out.println("user1 You Got Snake");
                user1 = user1 - dice;
                user1Count++;
            }
            else {
                System.out.println("user1 You Got No Play");
                user1Count++;
            }

            int dice1 = (int) Math.floor(Math.random() * (max - min + 1) + min);
            System.out.println("user2 Player Dice Number Is: " + dice1);
            System.out.println("user2 Player At The Position Number: " + user2);

            int predictUser2 = (int) Math.floor(Math.random() * 3);
            if (predictUser2 == 1) {
                System.out.println("user2 You Got Ladder");
                if (user2 <= 94) {
                    user2 = user2 + dice;
                    rem = user2 - 100;
                    user2Count++;
                }
                else if (rem < 6){
                    user2 = user2 - dice;
                    user2Count++;
                }
            }
            else if (predictUser2 == 2) {
                System.out.println("user2 You Got Snake");
                user2 = user2 - dice;
                user2Count++;
            }
            else {
                System.out.println("user2 You Got No Play");
                user2Count++;
            }

        }
        if (user1 == 100){
            System.out.println("User 01 Won In: "+user1Count);
            System.out.println("User 01 At Position: "+user1);
        }
        else {
            System.out.println("User 02 Won In: "+user2Count);
            System.out.println("User 02 At Position: "+user2);
        }

    }
}
