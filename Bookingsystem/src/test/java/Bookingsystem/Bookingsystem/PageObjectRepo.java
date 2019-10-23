package Bookingsystem.Bookingsystem;

public class PageObjectRepo {
	
	public static String monthYearLink = "//ul[@id='ctl00_ctl00_MainContent_MainContent_CalendarMonthsList']/li[@class='booking-calendar__navigation__item']/a/span[text()='November']/../span[text()='2019']";
	public static String dateTimeLink= "//div[@class='booking-calendar__day__content']/a[@data-performance='Friday 01 November 2019 - 19:45']";
//	public static String seatLink= "//div[@class='ltd-seatplan__wrap']/span[2]";
//	public static String seatLink= "//div[@class='ltd-seatplan__wrap']/span[2]/span";
	public static String seatLink= "//div[@class='ltd-seatplan__wrap']/div/canvas";
	public static String addToBasket="//span[@class='ltd-cta__row']";
	

	

}

