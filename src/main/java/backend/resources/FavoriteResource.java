package backend.resources;

import backend.model.Favorite;
import backend.service.FavoriteService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/favorite")
public class FavoriteResource {

    private final FavoriteService favoriteService;


    public FavoriteResource(FavoriteService favoriteService) {
        this.favoriteService = favoriteService;
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/all")
    public ResponseEntity<List<Favorite>> getAllAuthor() {
        List<Favorite> favorites = favoriteService.findAllFavourite();
        return new ResponseEntity<List<Favorite>>(favorites, HttpStatus.OK);
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/find/{id}")
    public ResponseEntity<Favorite> getAuthorbyId(@PathVariable("id") Long id) {
        Favorite favorite = favoriteService.findFavouriteById(id);
        return new ResponseEntity<>(favorite, HttpStatus.OK);
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping("/add")
    public ResponseEntity<Favorite> addAuthor(@RequestBody Favorite favorite) {
        Favorite Newfavorite = favoriteService.addFavorite(favorite);
        return new ResponseEntity<>(favorite, HttpStatus.CREATED);
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @PutMapping("/update")
    public ResponseEntity<Favorite> updateFavorite(@RequestBody Favorite favorite) {
        Favorite updateFavorite = favoriteService.updateFavorite(favorite);
        return new ResponseEntity<>(favorite, HttpStatus.OK);
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Favorite> deleteFavorite(@PathVariable("id") Long id) {
        System.out.println("Delte Methoden wird ausgeführt!");
        favoriteService.deleteFavoriteById(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
