package dao;
import java.util.List;

import com.booking.model.Show;

import exceptions.InvalidSeatNumberException;
import exceptions.SeatsNotAvailableException;
import exceptions.UnknownShowException;
public interface bookDao {
	List<Show> populateDataFromShow (List<Show> showList);
	void bookShow(List<Show> showList,String showName,String show_time,int noOfseats)throws UnknownShowException ,InvalidSeatNumberException, SeatsNotAvailableException;
}
