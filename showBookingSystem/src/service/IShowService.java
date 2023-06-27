

package service;

import java.util.List;

import exception.InvalidSeatNumberException;
import exception.SeatsNotAvailableException;
import exception.UnknownShowException;
import model.Show;

/**
 * Service layer to provide methods to interact with DAO layer.
 */
public interface IShowService {
	
	List<Show> populateDataFromShow (List<Show> showList);

	
	void bookShow(List<Show> showList, String showName, String  showTime, int noOfSeats)
		 throws 
		 SeatsNotAvailableException,
		 UnknownShowException,
		 InvalidSeatNumberException;
	
	
	List<Show> getAllShow();
}
