package businessObjects;

import java.util.List;

public interface InterfaceDao {
    void insert(Gast gast) throws GastAlreadyCheckedInException;
    List<Gast> FindAll();
    void update(Gast gast) throws GastAlreadyCheckedInException;
    Gast findById(int gastNr) throws GastNotCheckInException;
    void delete(Gast gast)throws GastNotCheckInException;

}
