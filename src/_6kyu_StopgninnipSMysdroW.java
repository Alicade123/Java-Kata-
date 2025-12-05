public class _6kyu_StopgninnipSMysdroW {
    public  void main(String[] args){
        System.out.println(spinWords("This is a test")); //This is a test"
        System.out.println(spinWords("This is another test")); //This is rehtona test"
        System.out.println(spinWords("Welcome")); // emocleW
        System.out.println(spinWords("Hey fellow Warriors")); //Hey wollef sroirraw
    }

    public String spinWords(String sentence) {
        //TODO: Code stuff here
        StringBuilder result = new StringBuilder();
        String[] words  = sentence.split(" ");
        int counter = 0;
        for(String word : words){
            counter++;
            if(word.length()>4) {
                if(counter == words.length ) result.append(new StringBuilder(word).reverse());
                else result.append(new StringBuilder(word).reverse()).append(" ");
            }

            else {
                if(counter == words.length ) result.append(word);
                else result.append(word).append(" ");
            }
        }
        return result.toString();
    }
}
