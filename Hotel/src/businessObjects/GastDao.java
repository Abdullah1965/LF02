package businessObjects;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GastDao {
    private Map<Integer,Gast> gastMap = new HashMap<>();

    public void insert(Gast gast) throws GastAlreadyCheckedInException{
        if (gastMap.containsKey(gast.getNr())){
            throw new GastAlreadyCheckedInException(gast);
        } else {
            gastMap.put(gast.getNr(),gast);
        }
    }

    public Gast findById(int gastNr) throws GastNotCheckInException {
        if (!gastMap.containsKey(gastNr)) {
            throw new GastNotCheckInException(gastMap.get(gastNr));
        }
        return gastMap.get(gastNr);
    }

    public List<Gast> FindAll(){
        return gastMap.values().stream().toList();
    }

    public void update(Gast gast) throws GastAlreadyCheckedInException{
        if (!gastMap.containsKey(gast.getNr())){
            throw new GastAlreadyCheckedInException(gast);
        } else {
            gastMap.replace(gast.getNr(),gast);
        }
    }

    public void delete(Gast gast)throws GastNotCheckInException {
        if (!gastMap.containsKey(gast.getNr())){
            throw new GastNotCheckInException(gast);
        } else {
            gastMap.remove(gast.getNr());
        }
    }
}
