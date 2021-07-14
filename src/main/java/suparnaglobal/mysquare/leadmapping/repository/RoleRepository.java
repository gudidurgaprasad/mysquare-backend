/**
 * 
 */
package suparnaglobal.mysquare.leadmapping.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import suparnaglobal.mysquare.leadmapping.entity.RoleEntity;


/**
 * @author dnvsr
 *
 */
public interface RoleRepository extends JpaRepository<RoleEntity, Integer>{
	@Override
    List<RoleEntity> findAll();

}
