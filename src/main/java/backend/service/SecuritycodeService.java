package backend.service;

import backend.model.Keyword;
import backend.model.School;
import backend.model.Securitycode;
import backend.repo.SecuritycodeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SecuritycodeService {
    private final SecuritycodeRepo securitycodeRepo;

    @Autowired
    public SecuritycodeService(SecuritycodeRepo securitycodeRepo) {
        this.securitycodeRepo = securitycodeRepo;
    }

    public Securitycode addSecuritycode(Securitycode securitycode) {
        return securitycodeRepo.save(securitycode);
    }

    public List<Securitycode> findAllSecuritycode() {
        return securitycodeRepo.findAll();
    }

    public Securitycode updateSecuritycode(Securitycode securitycode) {
        return securitycodeRepo.save(securitycode);
    }

    public Securitycode findSecuritycodeById(Long id) {
        return securitycodeRepo.findSecuritycodeById(id).orElseThrow(() -> new NotFoundException("Securitycode by id " + id + " was nof found"));
    }

    public void deletSecuritycodeById(Long id) {
        securitycodeRepo.deleteById(id);
    }


}
