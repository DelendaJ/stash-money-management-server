package com.example.moneymanagement.repositories;

import com.example.moneymanagement.entities.Profile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface ProfileRepository extends JpaRepository<Profile, UUID> {
    Profile findUserByemail(String email);
    Profile findByUsername(String username);


}
