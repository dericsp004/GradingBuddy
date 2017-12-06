package com.programmingplum.thegradingbuddy.data;

import android.provider.BaseColumns;

/**
 * Created by deric on 10/26/17.
 */

public class GradingBuddyContract {

    public static final class ClassEntry implements BaseColumns {
        // Table name
        public static final String TABLE_NAME = "class";
        //column (field) names
        public static final String _ID = BaseColumns._ID;
        public static final String CLASS_NAME = "class_name";
        public static final String CLASS_NUMBER = "class_number";
        public static final String EXPIRED = "expired";
        public static final String CREATED_DATE = "created_date";
        public static final String LAST_UPDATE_DATE = "last_update_date";
    }

    public static final class RubricEntry implements BaseColumns {
        // Table name
        public static final String TABLE_NAME = "rubric";
        //column names
        public static final String _ID = BaseColumns._ID;
        public static final String RUBRIC_NAME = "rubric_name";
        public static final String MAX_CRITERIA_VALUE = "max_criteria_value";
        public static final String EXPIRED = "expired";
        public static final String CREATED_DATE = "created_date";
        public static final String LAST_UPDATE_DATE = "last_update_date";
    }

    public static final class CriteriaEntry implements BaseColumns {
        // Table name
        public static final String TABLE_NAME = "criteria";
        // Column name
        public static final String _ID = BaseColumns._ID;
        public static final String RUBRIC_ID = "rubric_id"; // FK
        public static final String CRITERIA_NAME = "criteria_name";
        public static final String CRITERIA_DESC = "criteria_desc";
        public static final String EXPIRED = "expired";
        public static final String CREATED_DATE = "created_date";
        public static final String LAST_UPDATE_DATE = "last_update_date";
    }

    public static final class StudentEntry implements BaseColumns {
        //Table name
        public static final String TABLE_NAME = "student";
        //Column name
        public static final String _ID = BaseColumns._ID;
        public static final String LAST_NAME = "last_name";
        public static final String FIRST_NAME = "first_name";
        public static final String MIDDLE_NAME = "middle_name";
        public static final String EXPIRED = "expired";
        public static final String CREATED_DATE = "created_date";
        public static final String LAST_UPDATE_DATE = "last_update_date";
    }

    public static final class ClassStudent implements BaseColumns {
        //Table name
        public static final String TABLE_NAME = "class_student";
        //Column name
        public static final String _ID = BaseColumns._ID;
        public static final String CLASS_ID = "class_id"; // FK
        public static final String STUDENT_ID = "student_id"; // FK
        public static final String EXPIRED = "expired";
        public static final String CREATED_DATE = "created_date";
        public static final String LAST_UPDATE_DATE = "last_update_date";
    }

    public static final class Assignment implements BaseColumns {
        //Table name
        public static final String TABLE_NAME = "assignment";
        //Column name
        public static final String _ID = BaseColumns._ID;
        public static final String CLASS_ID = "class_id"; // FK
        public static final String RUBRIC_ID = "rubric_id"; // FK
        public static final String ASSIGNMENT_NAME = "assignment_name";
        public static final String EXPIRED = "expired";
        public static final String CREATED_DATE = "created_date";
        public static final String LAST_UPDATE_DATE = "last_update_date";
    }

    public static final class StudentAssignment implements BaseColumns {
        //Table name
        public static final String TABLE_NAME = "student_assignment";
        //Column name
        public static final String _ID = BaseColumns._ID;
        public static final String STUDENT_ID = "student_id"; // FK
        public static final String ASSIGNMENT_ID = "assignment_id"; // FK
        public static final String EXPIRED = "expired";
        public static final String CREATED_DATE = "created_date";
        public static final String LAST_UPDATE_DATE = "last_update_date";
    }

    public static final class Score implements BaseColumns {
        //Table name
        public static final String TABLE_NAME = "score";
        //Column name
        public static final String _ID = BaseColumns._ID;
        public static final String STUDENT_ASSIGNMENT_ID = "student_assignment_id"; // FK
        public static final String CRITERIA_ID = "criteria_id"; // FK
        public static final String SCORE = "score";
        public static final String EXPIRED = "expired";
        public static final String CREATED_DATE = "created_date";
        public static final String LAST_UPDATE_DATE = "last_update_date";
    }

    
}
