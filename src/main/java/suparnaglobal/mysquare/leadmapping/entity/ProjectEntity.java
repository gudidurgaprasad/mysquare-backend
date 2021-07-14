/**
 * 
 */
package suparnaglobal.mysquare.leadmapping.entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author dnvsr
 *
 */
@Entity
@Table(name = "project")
public class ProjectEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int project_id;
	
	public String project_name;
	
	public String project_desc;
	
	public LocalDate created_date;
}
