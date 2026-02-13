public class _6kyu_FruitMachine {
    public static void main() {

        String[] Reel1 = new String[]{"Bar", "Seven", "Cherry", "Jack", "Bell", "Shell", "Queen", "Wild", "King", "Star"};
        String[] Reel2 = {"Seven", "Bar", "Wild", "King", "Cherry", "Shell", "Bell", "Queen", "Star", "Jack"};
        String[] Reel3 = {"Shell", "Seven", "Queen", "Star", "Bar", "Bell", "King", "Wild", "Jack", "Cherry"};
        int[] test11 = new int[]{1, 6, 2};//0
        System.out.println(fruit(new String[][]{Reel1, Reel2, Reel3}, test11));//0
        String[] Reel11 = {"Seven", "Jack", "King", "Cherry", "Bar", "Star", "Bell", "Shell", "Queen", "Wild"};
        String[] Reel22 = {"Shell", "Seven", "Star", "Wild", "Jack", "Queen", "King", "Bar", "Cherry", "Bell"};
        String[] Reel33 = {"Queen", "Jack", "Wild", "Shell", "Bar", "Cherry", "Star", "King", "Seven", "Bell"};
        int[] test22 = new int[]{4, 4, 8};//0
        System.out.println(fruit(new String[][]{Reel11, Reel22, Reel33}, test22));//0
        String[] Reel111 = {"King", "Seven", "Cherry", "Bar", "Star", "Wild", "Shell", "Queen", "Bell", "Jack"};
        String[] Reel222 = {"Star", "Jack", "Queen", "Shell", "Cherry", "King", "Bell", "Wild", "Seven", "Bar"};
        String[] Reel333 = {"Jack", "Wild", "Bar", "Cherry", "King", "Star", "Bell", "Queen", "Seven", "Shell"};
        int[] test33 = new int[]{8, 8, 8};//0
        System.out.println(fruit(new String[][]{Reel111, Reel222, Reel333}, test33));//0
        String [] Reel1111 = {"Cherry", "Wild", "King", "Star", "Bar", "Bell", "Seven", "Queen", "Jack", "Shell"};
        String [] Reel2222 = {"Star", "King", "Cherry", "Bar", "Wild", "Queen", "Jack", "Bell", "Seven", "Shell"};
        String []  Reel3333 = {"Wild", "Cherry", "Shell", "Bell", "King", "Seven", "Bar", "Jack", "Queen", "Star"};
        int[] test4444 =new int[] {9, 6, 4};
        System.out.println(fruit(new String[][]{Reel1111,Reel2222,Reel3333},test4444));

        String [] Reel5A = {"Bar", "Shell", "Star", "Bell", "Wild", "Cherry", "Jack", "Queen", "Seven", "King"};
        String [] Reel5B = {"Shell", "Wild", "King", "Queen", "Bar", "Seven", "Bell", "Jack", "Star", "Cherry"};
        String [] Reel5C = {"Wild", "King", "Bell", "Star", "Jack", "Bar", "Shell", "Seven", "Cherry", "Queen"};
        int[] test5X = new int[] {1, 4, 5};
        System.out.println(fruit(new String[][] {Reel5A, Reel5B, Reel5C}, test5X));
        System.out.println(fruit(new String[][]{
                {"King", "Cherry", "Bar", "Jack", "Seven", "Queen", "Star", "Shell", "Bell", "Wild"},
                {"Bell", "Seven", "Jack", "Queen", "Bar", "Star", "Shell", "Wild", "Cherry", "King"},
                {"Wild", "King", "Queen", "Seven", "Star", "Bar", "Shell", "Cherry", "Jack", "Bell"}
        }, new int[]{5, 4, 3}));//0
        System.out.println(fruit(new String[][]{
                {"Wild", "Star", "Bell", "Shell", "Seven", "Cherry", "Bar", "King", "Queen", "Jack"},
                {"Wild", "Star", "Bell", "Shell", "Seven", "Cherry", "Bar", "King", "Queen", "Jack"},
                {"Wild", "Star", "Bell", "Shell", "Seven", "Cherry", "Bar", "King", "Queen", "Jack"}
        }, new int[]{5, 5, 5}));//50
        System.out.println(fruit(new String[][]{
                        {"King", "Jack", "Wild", "Bell", "Star", "Seven", "Queen", "Cherry", "Shell", "Bar"},
                        {"Star", "Bar", "Jack", "Seven", "Queen", "Wild", "King", "Bell", "Cherry", "Shell"},
                        {"King", "Bell", "Jack", "Shell", "Star", "Cherry", "Queen", "Bar", "Wild", "Seven"}
                },
                new int[]{0, 5, 0}));//
    }

    public static int fruit(final String[][] reels, final int[] spins) {
        String reel1 = reels[0][spins[0]];
        String reel2 = reels[1][spins[1]];
        String reel3 = reels[2][spins[2]];
        if (reel1.equals(reel2) && reel2.equals(reel3)) return solve(reel1) * 10;
        else if (reel1.equals(reel2) && reel3.equals("Wild") || reel2.equals(reel3) && reel1.equals("Wild") || reel1.equals(reel3) && reel2.equals("Wild")) {
        if (reel1.equals(reel2) || reel1.equals(reel3)) return solve(reel1) * 2;
        else return solve(reel2) * 2;

        } else if (reel1.equals(reel2) || reel2.equals(reel3) || reel1.equals(reel3)) {
            if (reel1.equals(reel2) || reel1.equals(reel3)) return solve(reel1);
            else return solve(reel2);
        }
        return 0;
    }

    public static int solve(String reel) {
        return switch (reel) {
            case "Jack" -> 1;
            case "Queen" -> 2;
            case "King" -> 3;
            case "Bar" -> 4;
            case "Cherry" -> 5;
            case "Seven" -> 6;
            case "Shell" -> 7;
            case "Bell" -> 8;
            case "Star" -> 9;
            case "Wild" -> 10;
            default -> 0;
        };
    }

}
