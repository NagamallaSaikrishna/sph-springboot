package com.sg.sph.repositories;

import com.sg.sph.entity.UserInfo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<UserInfo, Long> {
     UserInfo findByEmail(String email);

}
