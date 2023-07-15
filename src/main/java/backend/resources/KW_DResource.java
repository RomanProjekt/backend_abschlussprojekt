package backend.resources;

import backend.model.KW_D;
import backend.service.KW_DService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/kwd")
public class KW_DResource {

    private final KW_DService kwDService;

    public KW_DResource(KW_DService kwDService) {
        this.kwDService = kwDService;
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/all")
    public ResponseEntity<List<KW_D>> getAllKWD() {
        List<KW_D> kwds = kwDService.findALLKWD();
        return new ResponseEntity<List<KW_D>>(kwds, HttpStatus.OK);
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/find/{id}")
    public ResponseEntity<KW_D> getKWDbyId(@PathVariable("id") Long id) {
        KW_D keyword = kwDService.findKWDById(id);
        return new ResponseEntity<>(keyword, HttpStatus.OK);
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping("/add")
    public ResponseEntity<KW_D> addKWD(@RequestBody KW_D kwd) {
        KW_D Newkwd = kwDService.addKWD(kwd);
        return new ResponseEntity<>(kwd, HttpStatus.CREATED);
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @PutMapping("/update")
    public ResponseEntity<KW_D> updateKWD(@RequestBody KW_D kwd) {
        KW_D updateKWD = kwDService.updateKWD(kwd);
        return new ResponseEntity<>(kwd, HttpStatus.OK);
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<KW_D> deleteKeyword(@PathVariable("id") Long id) {
        System.out.println("Delte Methoden wird ausgeführt!");
        kwDService.deleteKWDById(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
