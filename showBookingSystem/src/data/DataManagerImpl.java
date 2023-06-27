package data;

import java.util.ArrayList;
import java.util.List;

import model.Show;

/**
 * Singleton class to handle show data.
 *
 */
public class DataManagerImpl implements IDataManager{

	private List<Show> shows = new ArrayList<>();
	
	private static DataManagerImpl dummyData = null;
	
	private DataManagerImpl() {
	}
	
	public static IDataManager getInstance() {
		if(dummyData == null)
			return new DataManagerImpl();
		return dummyData;
	}

	@Override
	public List<Show> getAllShows() {
		return shows;
	}
	
	@Override
	public void setShows(List<Show> shows) {
		this.shows = shows;
	}

}
