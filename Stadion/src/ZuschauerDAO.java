import java.util.HashMap;
import java.util.Map;

public class ZuschauerDAO {

    public Map<String,Zuschauer> zuschauerMap = new HashMap<>();

    public void insert(Zuschauer zuschauer) throws ZuschauerIstDa{
        if (zuschauerMap.containsKey(zuschauer.getAusweisNr())){
            throw new ZuschauerIstDa(zuschauer);
        } else {
            zuschauerMap.put(zuschauer.getAusweisNr(),zuschauer);
        }
    }



}
