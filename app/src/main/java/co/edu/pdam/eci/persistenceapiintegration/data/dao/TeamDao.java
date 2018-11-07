package co.edu.pdam.eci.persistenceapiintegration.data.dao;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;

import java.util.List;

import co.edu.pdam.eci.persistenceapiintegration.data.entity.Team;

/**
 * @author Santiago Carrillo
 */
@Dao
public interface TeamDao extends BaseDao<Team, Long>{

    @Query("SELECT * FROM team")
    List<Team> getAll();

    @Query("SELECT * FROM team WHERE id IN (:userIds)")
    List<Team> loadAllByIds(Long[] userIds);

    @Query("SELECT * FROM team WHERE first_name LIKE :first AND " +
            "last_name LIKE :last LIMIT 1")
    Team findByName(String first, String last);

    @Insert
    void insertAll(Team... users);

    @Delete
    void delete(Team user);


}
