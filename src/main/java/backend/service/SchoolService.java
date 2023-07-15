package backend.service;

import backend.model.Keyword;
import backend.model.School;
import backend.repo.SchoolRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SchoolService {

    private final SchoolRepo schoolRepo;

    @Autowired
    public SchoolService(SchoolRepo schoolRepo) {
        this.schoolRepo = schoolRepo;
    }

    public School addSchool(School school) {
        return schoolRepo.save(school);
    }

    public List<School> findAllSchool() {
        return schoolRepo.findAll();
    }

    public School updateSchool(School school) {
        return schoolRepo.save(school);
    }

    public School findSchoolById(Long id) {
        return schoolRepo.findSchoolById(id).orElseThrow(() -> new NotFoundException("School by id " + id + " was nof found"));
    }

    public void deleteSchoolById(Long id) {
        schoolRepo.deleteById(id);
    }
}
