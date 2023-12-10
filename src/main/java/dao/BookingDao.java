package dao;

import java.util.List;

import dao.model.BookingRoom;
import dao.model.Room;

public interface BookingDao {
	int addBookingRoom(BookingRoom bookingRoom);
	int cancelBookingRoomById(Integer bookingId);
	List<BookingRoom> findAllBookingRooms();
	//List<BookingRoom> findAllBookingRoomsBetweenDate(String startDate, String endDate);
	//List<BookingRoom> findAllBookingRoomsByIdAndName(Integer bookingId, String name);
	BookingRoom getBookingRoomById(Integer bookingId);
	List<Room> findAllRooms();
	Room getRoomById(Integer roomId);
}
