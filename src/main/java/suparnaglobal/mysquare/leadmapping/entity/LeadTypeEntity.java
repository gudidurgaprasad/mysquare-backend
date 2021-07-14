/**
 * 
 */
package suparnaglobal.mysquare.leadmapping.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * @author dnvsr
 *
 */
@Entity
@Table(name = "lead_type")
public class LeadTypeEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	public int lead_type_id;
	
	@Column(name = "lead_type_name", nullable=false)
	public String lead_type_name;
	
	@OneToMany(mappedBy = "leadTypeEntity", fetch = FetchType.LAZY,
            cascade = CascadeType.ALL)
	private Set<UserEntity> userEntity = new HashSet<>();
	
	@Column(name = "lead_score")
	public int lead_score;

	public int getLead_score() {
		return lead_score;
	}

	public void setLead_score(int lead_score) {
		this.lead_score = lead_score;
	}

	public String getLead_type_name() {
		return lead_type_name;
	}

	public void setLead_type_name(String lead_type_name) {
		this.lead_type_name = lead_type_name;
	}

	public Set<UserEntity> getUserEntity() {
		return userEntity;
	}

	public void setUserEntity(Set<UserEntity> userEntity) {
		this.userEntity = userEntity;
	}

	public int getLead_type_id() {
		return lead_type_id;
	}

	public void setLead_type_id(int lead_type_id) {
		this.lead_type_id = lead_type_id;
	}
	
	
}
