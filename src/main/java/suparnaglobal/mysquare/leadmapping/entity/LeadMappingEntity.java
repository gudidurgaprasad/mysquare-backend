/**
 * 
 */
package suparnaglobal.mysquare.leadmapping.entity;

import java.sql.Timestamp;
import java.time.LocalDate;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * @author dnvsr
 *
 */
@Entity
@Table(name="lead_mapping")
@EntityListeners(AuditingEntityListener.class)
@JsonIgnoreProperties(
        value = {"datee"},
        allowGetters = true
)
public class LeadMappingEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int lead_mapping_id;
	
	@GeneratedValue(strategy = GenerationType.AUTO)
	public int project_id;
	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int sales_user_id;

	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int lead_id;
	
	@Column(name = "mapped_date", nullable = false)
	@CreatedDate
	@Basic(optional = true)
	@GeneratedValue(strategy = GenerationType.AUTO)
	public Timestamp datee;
	
	
	@Column(name = "location")
	public String location;
	
	@Column(name = "prof")
	public String profile;
	
	@Column(name = "requirements")
	public String requirements;
	
	@Column(name = "budget")
	public String budget;
	
	@Column(name = "user_payment_response")
	public String user_payment_response;
	
	@Column(name = "lead_profile")
	public String lead_profile;
	
	@Column(name = "lead_score")
	public String lead_score;
	
	@Column(name = "site_visit")
	public String site_visit;
	
	@Column(name = "feedback1")
	public String feedback1;
	
	@Column(name = "feedback2")
	public String feedback2;
	
	@Column(name = "feedback3")
	public String feedback3;
	
	@Column(name = "followed_by")
	public String followed_by;
	
	@Column(name = "follow_up_date")
	public LocalDate follow_up_date;
	
	@Column(name = "booking")
	public String booking;
	
	@Column(name = "assigned_to")
	public String assigned_to;
	
}
