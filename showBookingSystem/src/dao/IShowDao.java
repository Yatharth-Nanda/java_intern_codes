

package dao;

import java.util.List;

import model.Show;

/**
 * DAO layer to handle CRUD operation related to Show.
 */
public interface IShowDao {
	
	
	List<Show> populateDataFromShow (List<Show> showList);
	
	
	Show getShow(String showName, String showTime);
	
	/**
	 * @return All the existing show details.
	 */
	List<Show> getAllShow();
	
	// Other CRUD operation is not needed for this UseCase.
	
}
