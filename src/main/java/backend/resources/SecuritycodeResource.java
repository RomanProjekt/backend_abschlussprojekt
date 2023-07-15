package backend.resources;

import backend.model.Securitycode;
import backend.service.SecuritycodeService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/securitycode")
public class SecuritycodeResource {

    private final SecuritycodeService securitycodeService;

    public SecuritycodeResource(SecuritycodeService securitycodeService) {
        this.securitycodeService = securitycodeService;
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/all")
    public ResponseEntity<List<Securitycode>> getAllSecuritycode() {
        List<Securitycode> keywords = securitycodeService.findAllSecuritycode();
        return new ResponseEntity<List<Securitycode>>(keywords, HttpStatus.OK);
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/find/{id}")
    public ResponseEntity<Securitycode> getSecuritycodebyId(@PathVariable("id") Long id) {
        Securitycode securitycode = securitycodeService.findSecuritycodeById(id);
        return new ResponseEntity<>(securitycode, HttpStatus.OK);
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping("/add")
    public ResponseEntity<Securitycode> addSecuritycode(@RequestBody Securitycode securitycode) {
        Securitycode Newsecuritycode = securitycodeService.addSecuritycode(securitycode);
        return new ResponseEntity<>(securitycode, HttpStatus.CREATED);
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @PutMapping("/update")
    public ResponseEntity<Securitycode> updateSecuritycode(@RequestBody Securitycode securitycode) {
        Securitycode Newsecuritycode = securitycodeService.updateSecuritycode(securitycode);
        return new ResponseEntity<>(securitycode, HttpStatus.OK);
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Securitycode> deleteSecuritycode(@PathVariable("id") Long id) {
        System.out.println("Delte Methoden wird ausgeführt!");
        securitycodeService.deletSecuritycodeById(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
