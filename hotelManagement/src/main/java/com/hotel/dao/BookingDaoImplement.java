package com.hotel.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.hotel.Booking;

public class BookingDaoImplement implements BookingDao{

	private JdbcTemplate jdbcTemplate;
	
	public void setDataSource(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }
	
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	@Override
	public void addBooking(Booking booking) {
		String sql = "insert into bookings(guestId, roomNumber, checkInDate, checkOutDate) values(?,?,?,?)";
		jdbcTemplate.update(sql, booking.getGuestId(), booking.getRoomNumber(), booking.getCheckInDate(), booking.getCheckOutDate());
	}

	@Override
	public void updateBooking(Booking booking, int bookingId) {
		String sql = "update bookings set guestId=?, roomNumber=?, checkInDate=?, checkOutDate=? where id=?";
		jdbcTemplate.update(sql, booking.getGuestId(), booking.getRoomNumber(), booking.getCheckInDate(), booking.getCheckOutDate(), bookingId);
	}

	@Override
	public void deleteBooking(int bookingId) {
		String sql = "delete from bookings where id=?";
		jdbcTemplate.update(sql, bookingId);
	}

	@Override
	public Booking getBookingById(int bookingId) {
		String sql = "select * from bookings where id=?";
		return jdbcTemplate.queryForObject(sql, new RowMapper<Booking>() {

			@Override
			public Booking mapRow(ResultSet rs, int rowNum) throws SQLException {
				Booking booking = new Booking();
				booking.setId(rs.getInt("id"));
				booking.setGuestId(rs.getInt("guestId"));
				booking.setRoomNumber(rs.getInt("roomNumber"));
				booking.setCheckInDate(rs.getString("checkInDate"));
				booking.setCheckOutDate(rs.getString("checkOutDate"));
				return booking;
			}}, bookingId);
	}

	@Override
	public List<Booking> getAllBookings() {
		String sql = "select * from bookings";
		return jdbcTemplate.query(sql, new RowMapper<Booking>() {

			@Override
			public Booking mapRow(ResultSet rs, int rowNum) throws SQLException {
				Booking booking = new Booking();
				booking.setId(rs.getInt("id"));
				booking.setGuestId(rs.getInt("guestId"));
				booking.setRoomNumber(rs.getInt("roomNumber"));
				booking.setCheckInDate(rs.getString("checkInDate"));
				booking.setCheckOutDate(rs.getString("checkOutDate"));
				return booking;
			}});
	}

}
