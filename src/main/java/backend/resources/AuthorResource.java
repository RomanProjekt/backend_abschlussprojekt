package backend.resources;

import backend.model.Author;
import backend.service.AuthorService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/author")
public class AuthorResource {

    private final AuthorService authorService;

    public AuthorResource(AuthorService authorService) {
        this.authorService = authorService;
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/all")
    public ResponseEntity<List<Author>> getAllAuthor() {
        List<Author> author = authorService.findAllAuthor();
        return new ResponseEntity<List<Author>>(author, HttpStatus.OK);
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/find/{id}")
    public ResponseEntity<Author> getAuthorbyId(@PathVariable("id") Long id) {
        Author author = authorService.findAuthorById(id);
        return new ResponseEntity<>(author, HttpStatus.OK);
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping("/add")
    public ResponseEntity<Author> addAuthor(@RequestBody Author author) {
        Author newAuthor = authorService.addAuthor(author);
        return new ResponseEntity<>(author, HttpStatus.CREATED);
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @PutMapping("/update")
    public ResponseEntity<Author> updateAuthor(@RequestBody Author author) {
        Author updateAuthor = authorService.updateAuthor(author);
        return new ResponseEntity<>(author, HttpStatus.OK);
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Author> deleteAuthor(@PathVariable("id") Long id) {
        System.out.println("Delte Methoden wird ausgeführt!");
        authorService.deleteAuthorById(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
