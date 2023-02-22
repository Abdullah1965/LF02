import java.util.HashMap;
import java.util.List;
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

    public Zuschauer findbyid(int zuschauerAusweisNr) throws ZuschauerIstNichtDa{
        if (!zuschauerMap.containsKey(zuschauerAusweisNr)){
            throw new ZuschauerIstNichtDa(zuschauerMap.get(zuschauerAusweisNr));
        } return zuschauerMap.get(zuschauerAusweisNr);
    }

    public List<Zuschauer> Findall(){
        return zuschauerMap.values().stream().toList();
    }

    public void update(Zuschauer zuschauer) throws ZuschauerIstNichtDa{
        if (!zuschauerMap.containsKey(zuschauer.getAusweisNr())){
            throw new ZuschauerIstNichtDa(zuschauer);
        } else {
            zuschauerMap.replace(zuschauer.getAusweisNr(),zuschauer);
        }
    }
    public void delete(Zuschauer zuschauer) throws ZuschauerIstNichtDa{
        if (!zuschauerMap.containsKey(zuschauer.getAusweisNr())){
            throw new ZuschauerIstNichtDa(zuschauer);
        }else {
            zuschauerMap.remove(zuschauer.getAusweisNr());
        }
    }


}
