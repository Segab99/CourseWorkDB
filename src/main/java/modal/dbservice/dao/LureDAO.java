package modal.dbservice.dao;

import modal.entity.Lure;

import java.util.List;


public interface LureDAO {
    void addLure(Lure lure);

    void updateLure(Lure lure);

    Lure getLureById(Long lureId);

    List<Lure> getAllLures();

    void deleteLure(Lure lure);
}
