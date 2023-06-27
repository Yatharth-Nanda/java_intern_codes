package presentation;

import java.util.ArrayList;
import java.util.List;

import exception.InvalidSeatNumberException;
import exception.SeatsNotAvailableException;
import exception.UnknownShowException;
import model.Show;
import service.IShowService;
import service.impl.ShowServiceImpl;

public class ShowBookingMain {
	
	/**
	 *  Helper method to generate dummy shows.
	 */
	private static List<Show> generateDummyShows() {
		List<Show> shows = new ArrayList<>();
		Show avenger = new Show(1, "Avenger", "2pm", 100);
		Show thor = new Show(1, "Thor", "11am", 110);
		Show rrr = new Show(3, "RRR", "6pm", 120);
		
		shows.add(avenger);
		shows.add(thor);
		shows.add(rrr);
		return shows;
	}
	
	public static void main(String[] args) {
		
		//Object to provide services related to show.
		IShowService showService = new ShowServiceImpl();
		List<Show> shows = showService.populateDataFromShow(generateDummyShows());
		System.out.println("=============== SHOW LIST BEFORE BOOKING =============");
		System.out.println(showService.getAllShow());
		try {
			showService.bookShow(shows, "Avenger", "2pm", 40);
			showService.bookShow(shows, "Thor", "11am", 0);
			showService.bookShow(shows, "RRR", "6pm", 30);
		} catch (SeatsNotAvailableException e) {
			e.printStackTrace();
			System.out.println("Exception : " + e.getMessage());
		} catch (UnknownShowException e) {
			System.out.println("Exception : " + e.getMessage());
			e.printStackTrace();
		} catch (InvalidSeatNumberException e) {
			System.out.println("Exception : " + e.getMessage());
			e.printStackTrace();
		} catch(Exception e) {
			System.out.println("Exception : " + e.getMessage());
			e.printStackTrace();
		}
		
		System.out.println("=============== SHOW LIST AFTER BOOKING =============");
		System.out.println(showService.getAllShow());
	}
}
