package com.santa.techtest.query;

public class Query {
    public static String QUERY_FOR_ORDER = "SELECT \n" +
            "  package.id as package_id,\n" +
            "  room.id as room_id,\n" +
            "  meal.id as meal_id, \n" +
            "  country.name as country_name, \n" +
            "  city.name as city_name, \n" +
            "  hotel.name as hotel_name, \n" +
            "  package.date_depart, \n" +
            "  package.duration, \n" +
            "  package.description as desc, \n" +
            "  room.seats, \n" +
            "  hotel.rating, \n" +
            "  room.type as room_type, \n" +
            "  hotel.sea_distance, \n" +
            "  meal.type as meal_type, \n" +
            "  package.insurance, \n" +
            "  package.visa, \n" +
            "  package.transfer\n" +
            "FROM \n" +
            "  public.\"City\" as city, \n" +
            "  public.\"Country\" as country, \n" +
            "  public.\"Hotel\" as hotel, \n" +
            "  public.\"Meal\" as meal, \n" +
            "  public.\"Package\" as package, \n" +
            "  public.\"Room\" as room\n" +
            "WHERE \n" +
            "  city.country_id = country.id AND\n" +
            "  hotel.city_id = city.id AND\n" +
            "  meal.hotel_id = hotel.id AND\n" +
            "  package.hotel_id = hotel.id AND\n" +
            "  room.hotel_id = hotel.id ";
}
