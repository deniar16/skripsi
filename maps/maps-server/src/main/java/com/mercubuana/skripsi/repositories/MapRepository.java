package com.mercubuana.skripsi.repositories;

import com.mercubuana.skripsi.entity.Map;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface MapRepository extends JpaRepository<Map, Integer> {

    @Query("SELECT m FROM Map m where m.latitude < :latitude and m.longitude >= :longitude")
    public Map findByLatitudeAndLongitude(@Param("latitude") Double latitude, @Param("longitude") Double longitude);

    @Query(value = "SELECT * FROM Map m where m.latitude < :latitude and m.longitude >= :longitude LIMIT 1", nativeQuery = true)
    public Map findByLatitudeAndLongitudeNative(@Param("latitude") Double latitude, @Param("longitude") Double longitude);
}
