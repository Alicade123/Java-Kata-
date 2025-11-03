public class Kata7 {
public static void main(String[] args) {
//    System.out.println(isValid(new char[] {'H', 'e', 'l', 'l', 'o', 'W', 'o', 'r','l', 'd'}));//false
//    System.out.println(isValid(new char[] {'n','s','n','s','n','s','n','s','n','s','n','s'}));//false
//    System.out.println(isValid(new char[] {'n','s','e','w','n','s','e','w','n','s','e','w','n','s','e','w'}));//false
//    System.out.println(isValid(new char[] {'n','s','e','w','n','s','e','w','n','s','e','w','n','s','e','w','n','s','e','w'}));//false
//    System.out.println(isValid(new char[] {'n','s','n','s','n','s','n','s','n','s'}));// true
//    System.out.println(isValid(new char[] {'e','w','e','w','n','s','n','s','e','w'}));//true
//    System.out.println(isValid(new char[] {'n','s','e','w','n','s','e','w','n','s'}));//true
//    System.out.println(isValid(new char[] {'n','s','n','s','n','s','n','s','n','n'}));//false
//    System.out.println(isValid(new char[] {'e','e','e','w','n','s','n','s','e','w'}));//false
//    System.out.println(isValid(new char[] {'n','e','n','e','n','e','n','e','n','e'}));//false
//    System.out.println(isValid(new char[] {'n','w','n','w','n','w','n','w','n','w'}));//false
//    System.out.println(isValid(new char[] {'s','e','s','e','s','e','s','e','s','e'}));//false
//    System.out.println(isValid(new char[] {'s','w','s','w','s','w','s','w','s','w'}));//false
    int stepCount = 0;
    String[][] matrix = {{"[0][0]", "[0][1]", "[0][2]"},
            {"[1][0]", "[1][1]", "[1][2]"},
            {"[2][0]", "[2][1]", "[2][2]"},
            {"[3][0]", "[3][1]", "[3][2]"}};

    for(int a = 0; a < matrix[0].length; a++) {
        for(int b = 0; b < matrix.length; b++) {
            System.out.print("Step: " + stepCount);
            System.out.print(", Element: " + matrix[b][a]);
            System.out.println();
            stepCount++;
        }
    }

}
        public static boolean isValid(char[] walk) {
            // Insert brilliant code here
            int n=0;
            int s=0;
            int e=0;
            int w=0;
          if(walk.length==10 ){
              for(int i=0;i<walk.length;i++){
                  char c=walk[i];
                  if (c != 'n' && c != 's' && c != 'e' && c != 'w') {
                      return false;
                  }
                  if(walk[i]=='n') n++;
                  else if(walk[i]=='s') s++;
                  else if(walk[i]=='e') e++;
                  else if(walk[i]=='w') w++;

              }
              if(n==s && e==w)  return true;
          }
          return false;

    }
}
