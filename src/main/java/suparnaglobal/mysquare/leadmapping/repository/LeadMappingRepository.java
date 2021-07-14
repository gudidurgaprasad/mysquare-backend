/**
 * 
 */
package suparnaglobal.mysquare.leadmapping.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import suparnaglobal.mysquare.leadmapping.entity.LeadMappingEntity;

/**
 * @author dnvsr
 *
 */
public interface LeadMappingRepository extends JpaRepository<LeadMappingEntity, Integer>{
	@Override
    List<LeadMappingEntity> findAll();
}
