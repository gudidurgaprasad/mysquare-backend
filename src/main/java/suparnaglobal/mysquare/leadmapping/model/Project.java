/**
 * 
 */
package suparnaglobal.mysquare.leadmapping.model;

import java.time.LocalDate;

/**
 * @author dnvsr
 *
 */
public class Project {
	
	public int project_id;
	
	public String project_name;
	
	public String project_desc;
	
	public LocalDate created_date;
	
	public int getProject_id() {
		return project_id;
	}

	public void setProject_id(int project_id) {
		this.project_id = project_id;
	}

	public String getProject_name() {
		return project_name;
	}

	public void setProject_name(String project_name) {
		this.project_name = project_name;
	}

	public String getProject_desc() {
		return project_desc;
	}

	public void setProject_desc(String project_desc) {
		this.project_desc = project_desc;
	}

	public LocalDate getCreated_date() {
		return created_date;
	}

	public void setCreated_date(LocalDate created_date) {
		this.created_date = created_date;
	}

	

}
