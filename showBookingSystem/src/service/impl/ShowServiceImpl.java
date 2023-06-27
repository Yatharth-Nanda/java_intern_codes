
package service.impl;

import java.util.List;

import constant.StringConstant;
import dao.IShowDao;
import dao.impl.ShowDaoImpl;
import exception.InvalidSeatNumberException;
import exception.SeatsNotAvailableException;
import exception.UnknownShowException;
import model.Show;
import service.IShowService;

public class ShowServiceImpl implements IShowService{
	IShowDao showDao = new ShowDaoImpl();
	
	@Override
	public List<Show> populateDataFromShow(List<Show> showList) {
		return showDao.populateDataFromShow(showList);
	}

	@Override
	public void bookShow(List<Show> showList, String showName, String showTime, int noOfSeats)
			throws SeatsNotAvailableException, UnknownShowException, InvalidSeatNumberException {
		Show show = showDao.getShow(showName,showTime);
		if(show == null)
			throw new UnknownShowException(StringConstant.UNKNOWN_SHOW_ERROR_MESSAGE);
		if(noOfSeats <= 0)
			throw new InvalidSeatNumberException(StringConstant.INVALID_SEAT_NO_ERROR_MESSAGE);
		if(noOfSeats > show.getAvailableSeats())
			throw new SeatsNotAvailableException(StringConstant.SEATS_NOT_AVAILABLE_ERROR_MESSAGE);
		show.setAvailableSeats(show.getAvailableSeats() - noOfSeats);
	}

	@Override
	public List<Show> getAllShow() {
		return showDao.getAllShow();
	}

}
