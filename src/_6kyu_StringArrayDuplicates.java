import java.util.Arrays;
public class _6kyu_StringArrayDuplicates {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(dup(new String[] {"ccooddddddewwwaaaaarrrrsssss", "piccaninny", "hubbubbubboo"}))); //,['codewars','picaniny','hubububo']);
        System.out.println(Arrays.toString(dup(new String[] {"abracadabra", "allottee", "assessee"}))); //,{'abracadabra','alote','asese'});
        System.out.println(Arrays.toString(dup(new String[] {"kelless", "keenness"}))); //, {'keles','kenes'});
        System.out.println(Arrays.toString(dup(new String[] {"Woolloomooloo", "flooddoorroommoonlighters", "chuchchi"}))); //, {'Wolomolo','flodoromonlighters','chuchchi'});
        System.out.println(Arrays.toString(dup(new String[] {"adanac", "soonness", "toolless", "ppellee"}))); //, {'adanac','sones','toles','pele'});
        System.out.println(Arrays.toString(dup(new String[] {"callalloo", "feelless", "heelless"}))); //, {'calalo','feles','heles'});
        System.out.println(Arrays.toString(dup(new String[] {"putteellinen", "keenness"}))); //, {'putelinen','kenes'});
        System.out.println(Arrays.toString(dup(new String[] {"kelless", "voorraaddoosspullen", "achcha"}))); //, {'keles','voradospulen','achcha'});

    }
    public static String[] dup(String[] arr){
        String [] results = new String[arr.length];
      for(int i = 0; i < arr.length; i++){
          StringBuilder word = new StringBuilder();
          for(int j = 0; j < arr[i].length(); j++){
              if(j <arr[i].length()-1 && arr[i].charAt(j) == arr[i].charAt(j+1) ) continue;
              else  word.append(arr[i].charAt(j));
          }
        results[i] = word.toString();
      }
        return results;
    }
}
