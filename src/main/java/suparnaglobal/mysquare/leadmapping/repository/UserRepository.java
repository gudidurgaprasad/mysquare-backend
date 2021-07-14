package suparnaglobal.mysquare.leadmapping.repository;

/**
 * dnvsr
 */

import java.util.List;

import org.apache.commons.math3.stat.descriptive.summary.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import suparnaglobal.mysquare.leadmapping.entity.UserEntity;
import suparnaglobal.mysquare.leadmapping.model.User;


/**
 * @author dnvsr
 *
 */
public interface UserRepository extends JpaRepository<UserEntity, Integer>{
	
	@Override
    List<UserEntity> findAll();
	
	/*
	@Query("SELECT u FROM User u WHERE u.username = :username")
    public UserEntity getUserByUsername(@Param("username") String username);
	*/
	
	User findByUsername(String username);
/*	
	@Query("SELECT u FROM UserEntity u WHERE u.role_id = 3")
	public List<UserEntity> getLeads();
*/
}
