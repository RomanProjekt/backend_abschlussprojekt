package backend.resources;

import backend.model.Diploma;
import backend.service.DiplomaService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/diploma")
public class DiplomaResource {

    private final DiplomaService diplomaService;

    public DiplomaResource(DiplomaService diplomaService) {
        this.diplomaService = diplomaService;
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/all")
    public ResponseEntity<List<Diploma>> getAllAuthor() {
        List<Diploma> diploma = diplomaService.findAllDiploma();
        return new ResponseEntity<List<Diploma>>(diploma, HttpStatus.OK);
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/find/{id}")
    public ResponseEntity<Diploma> getAuthorbyId(@PathVariable("id") Long id) {
        Diploma diploma = diplomaService.findDiplomaById(id);
        return new ResponseEntity<>(diploma, HttpStatus.OK);
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping("/add")
    public ResponseEntity<Diploma> addAuthor(@RequestBody Diploma diploma) {
        Diploma newDiploma = diplomaService.addDiploma(diploma);
        return new ResponseEntity<>(diploma, HttpStatus.CREATED);
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @PutMapping("/update")
    public ResponseEntity<Diploma> updateAuthor(@RequestBody Diploma diploma) {
        Diploma updateDiploma = diplomaService.updateDiploma(diploma);
        return new ResponseEntity<>(diploma, HttpStatus.OK);
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Diploma> deleteAuthor(@PathVariable("id") Long id) {
        System.out.println("Delte Methoden wird ausgeführt!");
        diplomaService.deleteDiplomaById(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
