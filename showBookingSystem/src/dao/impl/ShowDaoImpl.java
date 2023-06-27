package dao.impl;

import java.util.List;

import dao.IShowDao;
import data.DataManagerImpl;
import data.IDataManager;
import model.Show;
import service.IShowService;

/**
 * Implementation of Show DAO layer.
 */
public class ShowDaoImpl implements IShowDao{
	IDataManager dataManager = DataManagerImpl.getInstance();
	IShowService ishow;
	
	@Override
	public List<Show> populateDataFromShow(List<Show> showList) {
	return dataManager.getAllShows();
		//return ishow.populateDataFromShow(showList);
	}
	
	@Override
	public Show getShow(String showName, String showTime) {
		Show fetchedShow = null;
		for(Show show : dataManager.getAllShows()) {
			if(show.getShowName().equals(showName) && show.getShowTime().equals(showTime)) {
				fetchedShow = show;
			}
		}
		return fetchedShow;
	}

	@Override
	public List<Show> getAllShow() {
		return dataManager.getAllShows();
	}
	
}
