

package data;

import java.util.List;

import model.Show;


public interface IDataManager {
	
	
	List<Show> getAllShows();
	
	
	void setShows(List<Show> shows);
}
