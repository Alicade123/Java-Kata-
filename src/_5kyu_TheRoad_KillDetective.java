import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _5kyu_TheRoad_KillDetective {
    public static void main(String[] args){
        System.out.println(roadKill("==========h===yyyyyy===eeee=n==a========"));//hyena
        System.out.println(roadKill("======pe====nnnnnn=======================n=n=ng====u==iiii=iii==nn========================n="));//penguin
        System.out.println(roadKill("=====r=rrr=rra=====eee======bb====b======="));//bear
        System.out.println(roadKill("========kk===k=r==ra===a==a==v==v==vd==dddrr==ra===a===a===a====="));//aardvark
        System.out.println(roadKill("===b=b==========a=a=a=a=a=a=a=boo======n====="));//baboon
        System.out.println(roadKill("====rraabbiitt=="));
        System.out.println(roadKill("===       ===snake========="));
    }

   public static String roadKill(final String photo) {
        List<String> ANIMALS = new ArrayList<>(Arrays.asList(
                "aardvark", "alligator", "armadillo", "antelope", "baboon",
                "bear", "bobcat", "butterfly", "cat", "camel", "cow", "chameleon", "dog", "dolphin", "duck",
                "dragonfly", "eagle", "elephant", "emu", "echidna", "fish", "frog", "flamingo", "fox", "goat",
                "giraffe", "gibbon", "gecko", "hyena", "hippopotamus", "horse", "hamster", "insect", "impala",
                "iguana", "ibis", "jackal", "jaguar", "jellyfish", "kangaroo", "kiwi", "koala", "killerwhale",
                "lemur", "leopard", "llama", "lion", "monkey", "mouse", "moose", "meercat", "numbat", "newt",
                "ostrich", "otter","octopus", "orangutan", "penguin", "panther", "parrot", "pig", "quail",
                "quokka", "quoll", "rat", "rhinoceros", "racoon", "reindeer", "rabbit", "snake", "squirrel",
                "sheep", "seal", "turtle", "tiger", "turkey", "tapir","unicorn","vampirebat", "vulture", "wombat",
                "walrus", "wildebeast", "wallaby", "yak", "zebra"));

        String cleanPhoto = photo.replace("=","");
        for(String animal:ANIMALS){
           if(isMatch(animal,cleanPhoto) || isMatch(new StringBuilder(animal).reverse().toString(), cleanPhoto)) return animal;
            }
        return "??";
        }
    public static boolean isMatch(String targetAnimal, String takenPhoto){
        for (char c : takenPhoto.toCharArray()) {
            if (targetAnimal.indexOf(c) == -1) {
                return false;
            }
        }
        int j=0;
        for(int i=0;i<takenPhoto.length() && j<targetAnimal.length();i++){
            if(targetAnimal.charAt(j)==takenPhoto.charAt(i)) j++;
        }
        return j==targetAnimal.length();
    }
}
