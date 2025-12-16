public class Beta_RubiksCubeCommutators {
    public static void main(String[] args){
        System.out.println(createCommutator("R", "U")); //R U R' U'
        System.out.println(createCommutator("U2 F2", "R' D"));//U2 F2 R' D F2 U2 D' R
        System.out.println(createCommutator("F' R B", "D2 U2 L'")); //F' R B D2 U2 L' B' R' F L U2 D2

    }
    public static String createCommutator(String a, String b) {
        String ab = a+" "+b;
        StringBuilder result  = new StringBuilder(ab);
        String [] aArray = a.split(" ");
        StringBuilder aRR = new StringBuilder();
        for(String x : aArray){
            switch (x) {
                case "R" -> aRR.insert(0, "R' ");
                case "L" -> aRR.insert(0, "L' ");
                case "U" -> aRR.insert(0, "U' ");
                case "D" -> aRR.insert(0, "D' ");
                case "F" -> aRR.insert(0, "F' ");
                case "B" -> aRR.insert(0, "B' ");
                case "R'" -> aRR.insert(0, "R ");
                case "L'" -> aRR.insert(0, "L ");
                case "U'" -> aRR.insert(0, "U ");
                case "D'" -> aRR.insert(0, "D ");
                case "F'" -> aRR.insert(0, "F ");
                case "B'" -> aRR.insert(0, "B ");
                default -> aRR.insert(0, x+" ");
            }}

        String [] bArray = b.split(" ");
        StringBuilder bRR = new StringBuilder();
        for(String x : bArray){
            switch (x) {
                case "R" -> bRR.insert(0, "R' ");
                case "L" -> bRR.insert(0, "L' ");
                case "U" -> bRR.insert(0, "U' ");
                case "D" -> bRR.insert(0, "D' ");
                case "F" -> bRR.insert(0, "F' ");
                case "B" -> bRR.insert(0, "B' ");
                case "R'" -> bRR.insert(0, "R ");
                case "L'" -> bRR.insert(0, "L ");
                case "U'" -> bRR.insert(0, "U ");
                case "D'" -> bRR.insert(0, "D ");
                case "F'" -> bRR.insert(0, "F ");
                case "B'" -> bRR.insert(0, "B ");
                default -> bRR.insert(0, x+" ");
            }}
     return (result+" "+aRR+bRR).trim();

    }
}
