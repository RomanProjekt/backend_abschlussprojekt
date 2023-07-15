package backend.service;

import backend.model.Diploma;
import backend.model.Favorite;
import backend.repo.DiplomaRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DiplomaService {

    private final DiplomaRepo diplomaRepo;

    @Autowired
    public DiplomaService(DiplomaRepo diplomaRepo) {
        this.diplomaRepo = diplomaRepo;
    }

    public Diploma addDiploma(Diploma diploma) {
        return diplomaRepo.save(diploma);
    }

    public List<Diploma> findAllDiploma() {
        return diplomaRepo.findAll();
    }

    public Diploma updateDiploma(Diploma favorite) {
        return diplomaRepo.save(favorite);
    }

    public Diploma findDiplomaById(Long id) {
        return diplomaRepo.findDiplomaById(id).orElseThrow(() -> new NotFoundException("Diploma by id " + id + " was nof found"));
    }

    public void deleteDiplomaById(Long id) {
        diplomaRepo.deleteById(id);
    }

}
