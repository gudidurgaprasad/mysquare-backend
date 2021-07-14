/**
 * 
 */
package suparnaglobal.mysquare.leadmapping.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import suparnaglobal.mysquare.leadmapping.entity.LeadTypeEntity;


/**
 * @author dnvsr
 *
 */
public interface LeadTypeRepository extends JpaRepository<LeadTypeEntity, Integer>{
	@Override
    List<LeadTypeEntity> findAll();

}
