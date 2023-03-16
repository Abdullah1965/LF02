package businessObjects;

import java.util.List;

public class iDao implements InterfaceDao {
    @Override
    public void insert(Gast gast) throws GastAlreadyCheckedInException {
        System.out.println("Neu");
    }

    @Override
    public List<Gast> FindAll() {
        return null;
    }

    @Override
    public void update(Gast gast) throws GastAlreadyCheckedInException {
        System.out.println("Update");
    }

    @Override
    public Gast findById(int gastNr) throws GastNotCheckInException {
        return null;
    }

    @Override
    public void delete(Gast gast) throws GastNotCheckInException {
        System.out.println("Delete");
    }
}
