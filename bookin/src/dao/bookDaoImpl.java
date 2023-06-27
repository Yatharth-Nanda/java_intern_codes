package dao;

import java.util.List;
import java.util.ArrayList;
import com.booking.model.Show;
import exceptions.InvalidSeatNumberException;
import exceptions.UnknownShowException;
import exceptions.SeatsNotAvailableException;

public class bookDaoImpl implements bookDao {
	List<Show> showslist=new ArrayList<Show>();
	@Override
	public List<Show> populateDataFromShow(List<Show> showList) {
		// TODO Auto-generated method stub
		
		return null;
	}

	@Override
	public void bookShow(List<Show> showList, String showName, String show_time, int noOfseats)throws UnknownShowException ,InvalidSeatNumberException, SeatsNotAvailableException {
		// TODO Auto-generated method stub
		int flag=0;
		if( noOfseats<=0)
			throw new InvalidSeatNumberException();
		Show found=new Show("NA","NA",0);//to store a found show 
		for(Show s :showList)
		{
			if(s.getS_name()==showName)
			{
				flag=1;
				found=s;
				break;
			}				
	}
		if(flag==0)
			throw new UnknownShowException();
		else 
		{
			if(found.getSeats()<=noOfseats)
				throw new SeatsNotAvailableException();
		}


	}

}
