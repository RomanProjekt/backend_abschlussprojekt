package backend.repo;


import backend.model.Favorite;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;


public interface FavoriteRepo  extends JpaRepository<Favorite, Long>  {

    void deleteById(Long id);
    Optional<Favorite> findFavoriteById(Long id);
}
