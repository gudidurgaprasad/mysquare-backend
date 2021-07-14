package suparnaglobal.mysquare.leadmapping.model;

import java.time.LocalDate;
import java.time.LocalTime;

public class LeadMapping {
	
	public int project_id;
	
	public int sales_user_id;

	public int lead_id;
	
	public LocalDate date;
	
	public LocalTime time;
	
	public String location;
	
	public String profile;
	
	public String requirements;
	
	public String budget;
	
	public String user_payment_response;
	
	public String lead_profile;
	
	public String lead_score;
	
	public String site_visit;
	
	public String feedback1;
	
	public String feedback2;
	
	public String feedback3;
	
	public String followed_by;
	
	public LocalDate follow_up_date;
	
	public String booking;
	
	public String assigned_to;

	public int getProject_id() {
		return project_id;
	}

	public void setProject_id(int project_id) {
		this.project_id = project_id;
	}

	public int getSales_user_id() {
		return sales_user_id;
	}

	public void setSales_user_id(int sales_user_id) {
		this.sales_user_id = sales_user_id;
	}

	public int getLead_id() {
		return lead_id;
	}

	public void setLead_id(int lead_id) {
		this.lead_id = lead_id;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public LocalTime getTime() {
		return time;
	}

	public void setTime(LocalTime time) {
		this.time = time;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getProfile() {
		return profile;
	}

	public void setProfile(String profile) {
		this.profile = profile;
	}

	public String getRequirements() {
		return requirements;
	}

	public void setRequirements(String requirements) {
		this.requirements = requirements;
	}

	public String getBudget() {
		return budget;
	}

	public void setBudget(String budget) {
		this.budget = budget;
	}

	public String getUser_payment_response() {
		return user_payment_response;
	}

	public void setUser_payment_response(String user_payment_response) {
		this.user_payment_response = user_payment_response;
	}

	public String getLead_profile() {
		return lead_profile;
	}

	public void setLead_profile(String lead_profile) {
		this.lead_profile = lead_profile;
	}

	public String getLead_score() {
		return lead_score;
	}

	public void setLead_score(String lead_score) {
		this.lead_score = lead_score;
	}

	public String getSite_visit() {
		return site_visit;
	}

	public void setSite_visit(String site_visit) {
		this.site_visit = site_visit;
	}

	public String getFeedback1() {
		return feedback1;
	}

	public void setFeedback1(String feedback1) {
		this.feedback1 = feedback1;
	}

	public String getFeedback2() {
		return feedback2;
	}

	public void setFeedback2(String feedback2) {
		this.feedback2 = feedback2;
	}

	public String getFeedback3() {
		return feedback3;
	}

	public void setFeedback3(String feedback3) {
		this.feedback3 = feedback3;
	}

	public String getFollowed_by() {
		return followed_by;
	}

	public void setFollowed_by(String followed_by) {
		this.followed_by = followed_by;
	}

	public LocalDate getFollow_up_date() {
		return follow_up_date;
	}

	public void setFollow_up_date(LocalDate follow_up_date) {
		this.follow_up_date = follow_up_date;
	}

	public String getBooking() {
		return booking;
	}

	public void setBooking(String booking) {
		this.booking = booking;
	}

	public String getAssigned_to() {
		return assigned_to;
	}

	public void setAssigned_to(String assigned_to) {
		this.assigned_to = assigned_to;
	}

}