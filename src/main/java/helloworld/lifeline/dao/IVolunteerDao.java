package helloworld.lifeline.dao;

import java.util.List;

import helloworld.lifeline.entity.DonationCampVolunteer;

public interface IVolunteerDao<V> extends IDao<V> {

	public List<V> getAllByCampID(int campID);

	public List<V> getAllByUserID(int userID);

	public List<DonationCampVolunteer> getAllByUserStatus(int id, String status);

	public List<DonationCampVolunteer> getVolunteerForCamp(int campID, String status);

}
