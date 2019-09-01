package com.doitgeek.ojp.seekerprofileservice.constant;

public class MessageConstant {
    public final static String USER_DOES_NOT_EXIST = "The user does not exist";

    // Required validators
    public static final String DEGREE_NAME_REQUIRED = "Degree name is required";
    public static final String FIELD_OF_STUDY_REQUIRED = "Field of study is required";
    public static final String INSTITUTE_NAME_REQUIRED = "Institute name is required";
    public static final String DEGREE_START_YEAR_REQUIRED = "Degree start year is required";
    public static final String JOB_START_DATE_REQUIRED = "Job start date is required";
    public static final String JOB_TITLE_REQUIRED = "Job title is required";
    public static final String COMPANY_NAME_REQUIRED = "Company name is required";
    public static final String JOB_LOCATION_REQUIRED = "Job location is required";

    // Valid validators
    public static final String DEGREE_NAME_VALID = "Degree name must be less than 50 characters";
    public static final String FIELD_OF_STUDY_VALID = "Field of study must be less than 50 characters";
    public static final String INSTITUTE_NAME_VALID = "Institute name must be less than 50 characters";
    public static final String START_YEAR_VALID = "Start year must be valid";
    public static final String END_YEAR_VALID = "End year must be valid";
    public static final String GRADE_SYSTEM_VALID = "Grade system must be less than 20 characters";
    public static final String JOB_TITLE_VALID = "Job title must be less than 50 characters";
    public static final String COMPANY_NAME_VALID = "Company name must be less than 100 characters";
    public static final String JOB_LOCATION_VALID = "Job location must be less than 100 characters";
    public static final String JOB_DESCRIPTION_VALID = "Job description must be less than 2000 characters";
}
