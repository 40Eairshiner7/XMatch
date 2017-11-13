package com.example.coderqiang.xmatch_android.dao;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.internal.DaoConfig;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;

import com.example.coderqiang.xmatch_android.model.Course;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "COURSE".
*/
public class CourseDao extends AbstractDao<Course, Long> {

    public static final String TABLENAME = "COURSE";

    /**
     * Properties of entity Course.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property CourseId = new Property(0, Long.class, "courseId", true, "_id");
        public final static Property Name = new Property(1, String.class, "name", false, "NAME");
        public final static Property StartTime = new Property(2, int.class, "startTime", false, "START_TIME");
        public final static Property EndTime = new Property(3, int.class, "endTime", false, "END_TIME");
        public final static Property StartWeek = new Property(4, int.class, "startWeek", false, "START_WEEK");
        public final static Property EndWeek = new Property(5, int.class, "endWeek", false, "END_WEEK");
        public final static Property IsDouble = new Property(6, boolean.class, "isDouble", false, "IS_DOUBLE");
        public final static Property IsSingle = new Property(7, boolean.class, "isSingle", false, "IS_SINGLE");
        public final static Property Weekend = new Property(8, int.class, "weekend", false, "WEEKEND");
        public final static Property Year = new Property(9, int.class, "year", false, "YEAR");
        public final static Property Xuenian = new Property(10, int.class, "xuenian", false, "XUENIAN");
    }


    public CourseDao(DaoConfig config) {
        super(config);
    }
    
    public CourseDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"COURSE\" (" + //
                "\"_id\" INTEGER PRIMARY KEY ," + // 0: courseId
                "\"NAME\" TEXT," + // 1: name
                "\"START_TIME\" INTEGER NOT NULL ," + // 2: startTime
                "\"END_TIME\" INTEGER NOT NULL ," + // 3: endTime
                "\"START_WEEK\" INTEGER NOT NULL ," + // 4: startWeek
                "\"END_WEEK\" INTEGER NOT NULL ," + // 5: endWeek
                "\"IS_DOUBLE\" INTEGER NOT NULL ," + // 6: isDouble
                "\"IS_SINGLE\" INTEGER NOT NULL ," + // 7: isSingle
                "\"WEEKEND\" INTEGER NOT NULL ," + // 8: weekend
                "\"YEAR\" INTEGER NOT NULL ," + // 9: year
                "\"XUENIAN\" INTEGER NOT NULL );"); // 10: xuenian
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"COURSE\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, Course entity) {
        stmt.clearBindings();
 
        Long courseId = entity.getCourseId();
        if (courseId != null) {
            stmt.bindLong(1, courseId);
        }
 
        String name = entity.getName();
        if (name != null) {
            stmt.bindString(2, name);
        }
        stmt.bindLong(3, entity.getStartTime());
        stmt.bindLong(4, entity.getEndTime());
        stmt.bindLong(5, entity.getStartWeek());
        stmt.bindLong(6, entity.getEndWeek());
        stmt.bindLong(7, entity.getIsDouble() ? 1L: 0L);
        stmt.bindLong(8, entity.getIsSingle() ? 1L: 0L);
        stmt.bindLong(9, entity.getWeekend());
        stmt.bindLong(10, entity.getYear());
        stmt.bindLong(11, entity.getXuenian());
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, Course entity) {
        stmt.clearBindings();
 
        Long courseId = entity.getCourseId();
        if (courseId != null) {
            stmt.bindLong(1, courseId);
        }
 
        String name = entity.getName();
        if (name != null) {
            stmt.bindString(2, name);
        }
        stmt.bindLong(3, entity.getStartTime());
        stmt.bindLong(4, entity.getEndTime());
        stmt.bindLong(5, entity.getStartWeek());
        stmt.bindLong(6, entity.getEndWeek());
        stmt.bindLong(7, entity.getIsDouble() ? 1L: 0L);
        stmt.bindLong(8, entity.getIsSingle() ? 1L: 0L);
        stmt.bindLong(9, entity.getWeekend());
        stmt.bindLong(10, entity.getYear());
        stmt.bindLong(11, entity.getXuenian());
    }

    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    @Override
    public Course readEntity(Cursor cursor, int offset) {
        Course entity = new Course( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // courseId
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // name
            cursor.getInt(offset + 2), // startTime
            cursor.getInt(offset + 3), // endTime
            cursor.getInt(offset + 4), // startWeek
            cursor.getInt(offset + 5), // endWeek
            cursor.getShort(offset + 6) != 0, // isDouble
            cursor.getShort(offset + 7) != 0, // isSingle
            cursor.getInt(offset + 8), // weekend
            cursor.getInt(offset + 9), // year
            cursor.getInt(offset + 10) // xuenian
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, Course entity, int offset) {
        entity.setCourseId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setName(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setStartTime(cursor.getInt(offset + 2));
        entity.setEndTime(cursor.getInt(offset + 3));
        entity.setStartWeek(cursor.getInt(offset + 4));
        entity.setEndWeek(cursor.getInt(offset + 5));
        entity.setIsDouble(cursor.getShort(offset + 6) != 0);
        entity.setIsSingle(cursor.getShort(offset + 7) != 0);
        entity.setWeekend(cursor.getInt(offset + 8));
        entity.setYear(cursor.getInt(offset + 9));
        entity.setXuenian(cursor.getInt(offset + 10));
     }
    
    @Override
    protected final Long updateKeyAfterInsert(Course entity, long rowId) {
        entity.setCourseId(rowId);
        return rowId;
    }
    
    @Override
    public Long getKey(Course entity) {
        if(entity != null) {
            return entity.getCourseId();
        } else {
            return null;
        }
    }

    @Override
    public boolean hasKey(Course entity) {
        return entity.getCourseId() != null;
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }
    
}