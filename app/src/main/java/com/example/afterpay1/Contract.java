package com.example.afterpay1;

import android.provider.BaseColumns;

public final class Contract {
    Contract(){}
    class StudentTable implements BaseColumns  {
        static final String TABLE_NAME="STUDENTS";
        static final String COLLEGE_ID="COLLEGE_ID";
        static final String NAME="NAME";
        static final String MOBILE="MOBILE";
        static final String EMAIL="EMAIL";
        static final String ADDRESS="ADDRESS";
    }
}
