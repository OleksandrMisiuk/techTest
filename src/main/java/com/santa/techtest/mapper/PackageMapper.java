package com.santa.techtest.mapper;

import com.santa.techtest.model.Package;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;

@Component
public class PackageMapper implements RowMapper<Package> {
    @Override
    public Package mapRow(ResultSet resultSet, int i) throws SQLException {
        Package aPackage= new Package();
        aPackage.setPackageId(resultSet.getLong("package_id"));
        aPackage.setMealId(resultSet.getLong("meal_id"));
        aPackage.setRoomId(resultSet.getLong("room_id"));
        aPackage.setCountry(resultSet.getString("country_name"));
        aPackage.setCity(resultSet.getString("city_name"));
        aPackage.setHotel(resultSet.getString("hotel_name"));
        aPackage.setDateDepart(resultSet.getObject("date_depart", LocalDate.class));
        aPackage.setDuration(resultSet.getInt("duration"));
        aPackage.setDescription(resultSet.getString("desc"));
        aPackage.setNumberOfPeople(resultSet.getInt("seats"));
        aPackage.setSeaDistance(resultSet.getInt("sea_distance"));
        aPackage.setRoomType(resultSet.getString("room_type"));
        aPackage.setMeal(resultSet.getString("meal_type"));
        aPackage.setHotelRating(resultSet.getInt("rating"));
        aPackage.setTransfer(resultSet.getBoolean("transfer"));
        aPackage.setInsurance(resultSet.getBoolean("insurance"));
        aPackage.setVisa(resultSet.getBoolean("visa"));
        return aPackage;
    }
}
