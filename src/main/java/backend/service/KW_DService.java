package backend.service;

import backend.model.KW_D;
import backend.model.Keyword;
import backend.repo.KW_DRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class KW_DService {

    private final KW_DRepo kw_dRepo;

    @Autowired
    public KW_DService(KW_DRepo kwD) {
        kw_dRepo = kwD;
    }

    public KW_D addKWD(KW_D kwd) {
        return kw_dRepo.save(kwd);
    }

    public List<KW_D> findALLKWD() {
        return kw_dRepo.findAll();
    }

    public KW_D updateKWD(KW_D kwd) {
        return kw_dRepo.save(kwd);
    }

    public KW_D findKWDById(Long id) {
        return kw_dRepo.findKW_DById(id).orElseThrow(() -> new NotFoundException("KwD by id " + id + " was nof found"));
    }

    public void deleteKWDById(Long id) {
        kw_dRepo.deleteById(id);
    }
}
