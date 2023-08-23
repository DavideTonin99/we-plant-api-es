package cloud.nino.nino.repository.custom;

import cloud.nino.nino.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

import java.math.BigInteger;

/**
 * Spring Data  repository for the Visit entity.
 */
@SuppressWarnings("unused")
@Repository
public interface UserCustomRepository extends JpaRepository<User, Long> {
    @Query(value = "SELECT * FROM jhi_user where id =  ?1", nativeQuery = true)
    Optional<User> findUserById(BigInteger id);
}
