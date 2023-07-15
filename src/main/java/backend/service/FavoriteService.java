package backend.service;

import backend.model.Favorite;
import backend.repo.FavoriteRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FavoriteService {

    private final FavoriteRepo favoriteRepo;

    @Autowired
    public FavoriteService(FavoriteRepo favoriteRepo) {
        this.favoriteRepo = favoriteRepo;
    }

    //
    public Favorite addFavorite(Favorite favorite) {
        return favoriteRepo.save(favorite);
    }

    public List<Favorite> findAllFavourite() {
        return favoriteRepo.findAll();
    }

    public Favorite updateFavorite(Favorite favorite) {
        return favoriteRepo.save(favorite);
    }

    public Favorite findFavouriteById(Long id) {
        return favoriteRepo.findFavoriteById(id).orElseThrow(() -> new NotFoundException("Favorite by id " + id + " was nof found"));
    }

    public void deleteFavoriteById(Long id) {
        favoriteRepo.deleteById(id);
    }




}
