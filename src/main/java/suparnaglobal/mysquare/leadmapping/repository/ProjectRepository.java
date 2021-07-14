/**
 * 
 */
package suparnaglobal.mysquare.leadmapping.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import suparnaglobal.mysquare.leadmapping.entity.ProjectEntity;


/**
 * @author dnvsr
 *
 */
public interface ProjectRepository extends JpaRepository<ProjectEntity, Integer>{
	@Override
    List<ProjectEntity> findAll();
}
