package backend.resources;


import backend.model.Keyword;
import backend.model.School;
import backend.service.SchoolService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/school")
public class SchoolResource {

    private final SchoolService schoolService;

    public SchoolResource(SchoolService schoolService) {
        this.schoolService = schoolService;
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/all")
    public ResponseEntity<List<School>> getAllKeywords() {
        List<School> keywords = schoolService.findAllSchool();
        return new ResponseEntity<List<School>>(keywords, HttpStatus.OK);
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/find/{id}")
    public ResponseEntity<School> getSchoolbyId(@PathVariable("id") Long id) {
        School school = schoolService.findSchoolById(id);
        return new ResponseEntity<>(school, HttpStatus.OK);
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping("/add")
    public ResponseEntity<School> addSchool(@RequestBody School school) {
        School Newschool = schoolService.addSchool(school);
        return new ResponseEntity<>(school, HttpStatus.CREATED);
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @PutMapping("/update")
    public ResponseEntity<School> updateSchool(@RequestBody School school) {
        School updateSchool = schoolService.updateSchool(school);
        return new ResponseEntity<>(school, HttpStatus.OK);
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<School> deleteSchool(@PathVariable("id") Long id) {
        System.out.println("Delte Methoden wird ausgeführt!");
        schoolService.deleteSchoolById(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
