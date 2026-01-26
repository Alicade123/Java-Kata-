import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;

public class _5kyu_PeteBaker {
    public static void main(String[] args){
        System.out.println(cakes(Map.of("flour", 500,"sugar", 200,"eggs", 1, "cinnamon", 300),
                                Map.of("flour", 1200, "sugar", 1200,"eggs", 5,"milk", 200)));//0
        System.out.println(cakes(Map.of("flour", 500,"sugar", 200,"eggs", 1),
                                Map.of("flour", 1200,"sugar", 1200,"eggs", 5,"milk", 200)));//2
    }
    public static int cakes(Map<String, Integer> recipe, Map<String, Integer> available) {
        Map<String, Integer> counterMap = new LinkedHashMap<>();
        for(Map.Entry<String, Integer> entity : recipe.entrySet()){
            String ent = entity.getKey();
            if(available.containsKey(ent) && available.get(ent)>=recipe.get(ent))
                counterMap.put(ent,available.get(ent)/recipe.get(ent));
            else return 0;
        }
        Optional<Integer> minValueOptional = counterMap.values().stream().min(Integer::compare);
        Integer minValue = minValueOptional.orElse(null);
       return  minValue;
    }
}
