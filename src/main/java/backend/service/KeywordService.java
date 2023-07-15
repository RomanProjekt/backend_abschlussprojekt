package backend.service;

import backend.model.Favorite;
import backend.model.Keyword;
import backend.repo.KeywordRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class KeywordService {

    private final KeywordRepo keywordRepo;

    @Autowired
    public KeywordService(KeywordRepo keywordRepo) {
        this.keywordRepo = keywordRepo;
    }

    public Keyword addKeyword(Keyword keyword) {
        return keywordRepo.save(keyword);
    }

    public List<Keyword> findAllKeyword() {
        return keywordRepo.findAll();
    }

    public Keyword updateKeyword(Keyword keyword) {
        return keywordRepo.save(keyword);
    }

    public Keyword findKeywordById(Long id) {
        return keywordRepo.findKeywordById(id).orElseThrow(() -> new NotFoundException("Keyword by id " + id + " was nof found"));
    }

    public void deletKeywordById(Long id) {
        keywordRepo.deleteById(id);
    }
}
