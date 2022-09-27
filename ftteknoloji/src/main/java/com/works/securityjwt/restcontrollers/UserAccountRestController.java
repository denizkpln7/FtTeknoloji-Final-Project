package com.works.securityjwt.restcontrollers;

import com.works.securityjwt.entities.UserAccount;
import com.works.securityjwt.services.UserAccountService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/usaccount")
public class UserAccountRestController {

    final UserAccountService usAcService;

    public UserAccountRestController(UserAccountService usAcService) {
        this.usAcService = usAcService;
    }

    @PostMapping("/save")
    public ResponseEntity save(@RequestBody UserAccount account){
        return  usAcService.save(account);
    }

     @GetMapping("/getacc")
    public ResponseEntity getacc(@RequestParam Long id) {
        return usAcService.getacc(id);
     }

     @GetMapping("/getdetail")
    public ResponseEntity getDetail(@RequestParam String email){
        return  usAcService.getDetail(email);
     }
}
