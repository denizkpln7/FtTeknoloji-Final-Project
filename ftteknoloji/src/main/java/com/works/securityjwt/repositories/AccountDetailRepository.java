package com.works.securityjwt.repositories;

import com.works.securityjwt.entities.AccountDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface AccountDetailRepository extends JpaRepository<AccountDetail,Long> {
    @Query(value = "Select ua.id as id, u.email as email, u.first_name as  name ,u.last_name as lastname, ua.dolar as dolar, ua.tl as tl, ua.euro as euro ,  ua.gold as gold  From  users  u inner join user_account  ua on u.id=ua.userıd where u.email LIKE ?1", nativeQuery = true)
    List<AccountDetail>  getAccount(String email);
}
