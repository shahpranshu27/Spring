package com.hotel.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.hotel.Guest;

public class GuestDaoImplement implements GuestDao{

	private JdbcTemplate jdbcTemplate;
	
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
    public void setDataSource(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }
	
	@Override
	public void addGuest(Guest guest) {
		String sql = "insert into guests(name, email) values(?,?)";
		jdbcTemplate.update(sql, guest.getName(), guest.getEmail());
	}

	@Override
	public void updateGuest(Guest guest, int guestId) {
		String sql = "update guests set name=?, email=? where id=?";
		jdbcTemplate.update(sql, guest.getName(), guest.getEmail(), guestId);
	}

	@Override
	public void deleteGuest(int guestId) {
		String sql = "delete from guests where id=?";
		jdbcTemplate.update(sql, guestId);
	}

	@Override
	public Guest getGuestById(int guestId) {
		String sql = "select * from guests where id=?";
		return jdbcTemplate.queryForObject(sql, new RowMapper<Guest>() {

			@Override
			public Guest mapRow(ResultSet rs, int rowNum) throws SQLException {
				Guest guest = new Guest();
				guest.setId(rs.getInt("id"));
				guest.setName(rs.getString("name"));
				guest.setEmail(rs.getString("email"));
				return guest;
			}}, guestId);
	}

	@Override
	public List<Guest> getAllGuests() {
		String sql = "select * from guests";
		return jdbcTemplate.query(sql, new RowMapper<Guest>() {

			@Override
			public Guest mapRow(ResultSet rs, int rowNum) throws SQLException {
				Guest guest = new Guest();
				guest.setId(rs.getInt("id"));
				guest.setName(rs.getString("name"));
				guest.setEmail(rs.getString("email"));
				return guest;
			}});
	}

}
