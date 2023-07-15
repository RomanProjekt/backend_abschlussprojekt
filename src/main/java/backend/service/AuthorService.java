package backend.service;

import backend.model.Author;
import backend.model.Favorite;
import backend.repo.AuthorRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthorService {

    private final AuthorRepo authorRepo;

    @Autowired
    public AuthorService(AuthorRepo authorRepo) {
        this.authorRepo = authorRepo;
    }

    public Author addAuthor(Author favorite) {
        return authorRepo.save(favorite);
    }

    public List<Author> findAllAuthor() {
        return authorRepo.findAll();
    }

    public Author updateAuthor(Author author) {
        return authorRepo.save(author);
    }

    public Author findAuthorById(Long id) {
        return authorRepo.findAuthorById(id).orElseThrow(() -> new NotFoundException("Author by id " + id + " was nof found"));
    }

    public void deleteAuthorById(Long id) {
        authorRepo.deleteById(id);
    }

}
