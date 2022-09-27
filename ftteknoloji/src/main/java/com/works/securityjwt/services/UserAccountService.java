package com.works.securityjwt.services;

import com.works.securityjwt.repositories.AccountDetailRepository;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import com.works.securityjwt.entities.UserAccount;
import com.works.securityjwt.repositories.UserAccountRepository;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.LinkedHashMap;
import java.util.Map;

@Service
public class UserAccountService {

    final UserAccountRepository usAcRepo;
    final AccountDetailRepository acDetRepo;

    public UserAccountService(UserAccountRepository usAcRepo, AccountDetailRepository acDetRepo) {
        this.usAcRepo = usAcRepo;
        this.acDetRepo = acDetRepo;
    }

    public ResponseEntity save(UserAccount account) {
        Map<String, Object> hm = new LinkedHashMap<>();
        hm.put("status", true);
        hm.put("result",  usAcRepo.save(account));
        return new ResponseEntity(hm, HttpStatus.OK);
    }

    public ResponseEntity getacc(Long id) {
        Map<String, Object> hm = new LinkedHashMap<>();
        hm.put("status", true);
        Pageable pageable = PageRequest.of(0, 5, Sort.by("created").descending() );
        hm.put("result",  usAcRepo.findByUserıd(id,pageable));
        return new ResponseEntity(hm, HttpStatus.OK);
    }

    public ResponseEntity getDetail(String email) {
        Map<String, Object> hm = new LinkedHashMap<>();
        hm.put("status", true);
        hm.put("result",  acDetRepo.getAccount("%" + email + "%"));
        return new ResponseEntity(hm, HttpStatus.OK);
    }
}
