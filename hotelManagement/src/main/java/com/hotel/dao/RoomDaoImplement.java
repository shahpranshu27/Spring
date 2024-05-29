package com.hotel.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.hotel.Room;

public class RoomDaoImplement implements RoomDao{

	private JdbcTemplate jdbcTemplate;
	
	public void setDataSource(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }
	
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	@Override
	public void addRoom(Room room) {
		String sql = "insert into rooms(type, price) values(?,?)";
		jdbcTemplate.update(sql, room.getType(), room.getPrice());
	}

	@Override
	public void updateRoom(Room room, int roomId) {
		String sql = "update rooms set type=?, price=? where id=?";
		jdbcTemplate.update(sql, room.getType(), room.getPrice(), roomId);
	}

	@Override
	public void deleteRoom(int roomId) {
		String sql = "delete from rooms where id=?";
		jdbcTemplate.update(sql, roomId);
	}

	@Override
	public Room getRoomById(int roomId) {
		String sql = "select * from rooms where id=?";
		return jdbcTemplate.queryForObject(sql, new RowMapper<Room>() {

			@Override
			public Room mapRow(ResultSet rs, int rowNum) throws SQLException {
				Room room = new Room();
				room.setId(rs.getInt("id"));
				room.setType(rs.getString("type"));
				room.setPrice(rs.getDouble("price"));
				return room;
			}}, roomId);
	}

	@Override
	public List<Room> getAllRooms() {
		String sql = "select * from rooms";
		return jdbcTemplate.query(sql, new RowMapper<Room>() {

			@Override
			public Room mapRow(ResultSet rs, int rowNum) throws SQLException {
				Room room = new Room();
				room.setId(rs.getInt("id"));
				room.setType(rs.getString("type"));
				room.setPrice(rs.getDouble("price"));
				return room;
			}});
	}

}
