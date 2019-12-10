package rocks.zipcode.quiz4.collections.culinary;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author leon on 27/12/2018.
 */
public class Food {
    List<Spice> spiceList;

    public Food(){
        spiceList = new ArrayList<>();
    }

    public List<Spice> getAllSpices() {
        return spiceList;
    }

    public <SpiceType extends Class<? extends Spice>> Map<SpiceType, Integer> getSpiceCount() {
        Map<SpiceType, Integer> spiceCountMap = new HashMap<>();
        for(Spice spice : this.spiceList){
            SpiceType toAdd = (SpiceType)spice.getClass();
            if(spiceCountMap.containsKey(toAdd)) {
                spiceCountMap.put(toAdd, spiceCountMap.get(toAdd)+1);
            } else {
                spiceCountMap.put(toAdd, 1);
            }
        }
        return spiceCountMap;
    }

    public void applySpice(Spice spice) {
        spiceList.add(spice);
    }

    public static <SpiceType extends Class<? extends Spice>> SpiceType parser(Object o, Class<SpiceType> clazz){
        try {
            return clazz.cast(o);
        } catch (ClassCastException e) {
            return null;
        }


    }
}
