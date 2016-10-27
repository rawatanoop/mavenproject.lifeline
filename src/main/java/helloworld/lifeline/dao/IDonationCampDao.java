package helloworld.lifeline.dao;

import java.util.List;

public interface IDonationCampDao<DC> extends IDao<DC> {

	public List<DC> getByAddress(String address);
}
