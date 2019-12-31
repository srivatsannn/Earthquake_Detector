package com.example.android.quakereport;
import java.text.SimpleDateFormat;
import java.util.Date;

public class simpledate {
    long timeInMilliseconds = 1454124312220L;
    Date dateObject = new Date(timeInMilliseconds);
    SimpleDateFormat dateFormatter = new SimpleDateFormat("MMM DD, yyyy");
    String dateToDisplay = dateFormatter.format(dateObject);
}
