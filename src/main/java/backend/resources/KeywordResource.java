package backend.resources;

import backend.model.Favorite;
import backend.model.Keyword;
import backend.service.KeywordService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public class KeywordResource {

    private final KeywordService keywordService;

    public KeywordResource(KeywordService keywordService) {
        this.keywordService = keywordService;
    }


    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/all")
    public ResponseEntity<List<Keyword>> getAllKeywords() {
        List<Keyword> keywords = keywordService.findAllKeyword();
        return new ResponseEntity<List<Keyword>>(keywords, HttpStatus.OK);
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/find/{id}")
    public ResponseEntity<Keyword> getKeywordbyId(@PathVariable("id") Long id) {
        Keyword keyword = keywordService.findKeywordById(id);
        return new ResponseEntity<>(keyword, HttpStatus.OK);
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping("/add")
    public ResponseEntity<Keyword> addKeyword(@RequestBody Keyword keyword) {
        Keyword Newkeyword = keywordService.addKeyword(keyword);
        return new ResponseEntity<>(keyword, HttpStatus.CREATED);
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @PutMapping("/update")
    public ResponseEntity<Keyword> updateKeyword(@RequestBody Keyword keyword) {
        Keyword updateFavorite = keywordService.updateKeyword(keyword);
        return new ResponseEntity<>(keyword, HttpStatus.OK);
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Keyword> deleteKeyword(@PathVariable("id") Long id) {
        System.out.println("Delte Methoden wird ausgeführt!");
        keywordService.deletKeywordById(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
