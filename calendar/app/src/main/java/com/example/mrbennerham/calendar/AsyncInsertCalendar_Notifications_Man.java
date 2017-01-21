package com.example.mrbennerham.calendar;

import android.util.Log;

import com.google.api.client.util.DateTime;
import com.google.api.services.calendar.model.Event;
import com.google.api.services.calendar.model.EventDateTime;
import com.google.api.services.calendar.model.EventReminder;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;

/**
 * Created by MR.BENNERHAM on 10/30/2016.
 */
public class AsyncInsertCalendar_Notifications_Man extends CalendarAsyncTask_Notifications_Man {


    private static final String TAG = "Noti";
    //    private final Calendar entry;
    _Model name;


    public AsyncInsertCalendar_Notifications_Man(Main_Notifications_Man calendarSample, _Model name) {
        super(calendarSample);
//        this.entry = entry;
        this.name = name;
    }


    @Override
    protected void doInBackground() throws IOException {

        Drugs_morning();
        Drugs_noon();
        Drugs_evening();
        Drugs_before();
    }


    String drugsmorning = "ทานยาตอนเช้า";

    public void Drugs_morning() throws IOException {


        Event Add_Drung = new Event()
                .setSummary(drugsmorning)
                .setDescription("ทานยาตอนเช้า");

        String date = name.getdate();
        String timer;

        try {
            timer = name.gettimer();
            String t = "T";
//        String a = date+t+timer;
            String drugsmorning = date+t+timer;
            DateTime startDateTime = new DateTime(drugsmorning+":00+07:00");
            EventDateTime start = new EventDateTime()
                    .setDateTime(startDateTime)
                    .setTimeZone("Asia/Bangkok");
            Add_Drung.setStart(start);

            DateTime endDateTime = new DateTime(drugsmorning+":00+07:00");
            EventDateTime end = new EventDateTime()
                    .setDateTime(endDateTime)
                    .setTimeZone("Asia/Bangkok");
            Add_Drung.setEnd(end);


            String datetimeend = name.getdateend();
//            String drugsmorningtimeend = datetimeend+t+timer;
            String b = new String(String.valueOf(datetimeend));

            String a = new String(String.valueOf(b));//ตัดสตริงคอมม่า

            String[] arrB = a.split("-");
            System.out.println("DATETIMEEND" + arrB[0]);//ตัดสตริงคอมม่า
            System.out.println("DATETIMEEND1" + arrB[1]);//ตัดสตริงคอมม่า
            System.out.println("DATETIMEEND2" + arrB[2]);//ตัดสตริงคอมม่า
            String drugsmorningtimeend = arrB[0]+arrB[1]+arrB[2];
            System.out.println("DATETIME111111" + drugsmorningtimeend);//ตัดสตริงคอมม่า

//            Add_Drung.setRecurrence(Arrays.asList("RRULE:FREQ=WEEKLY;UNTIL=20110701T170000Z"));
            Add_Drung.setRecurrence(Arrays.asList("RRULE:FREQ=DAILY;UNTIL="+drugsmorningtimeend+"T170000Z"));

            Event createdEvent = client.events().insert("primary", Add_Drung).execute();
            System.out.println("Created event id: " + createdEvent.getId());
        } catch (NullPointerException e) {
            Log.d(TAG, "Drugs_morning");
        }
    }

    String drugsnoon = "ทานยาตอนเที่ยง";

    public void Drugs_noon() throws IOException {
        Event Add_Drung = new Event()
                .setSummary(drugsnoon)
                .setDescription("ทานยาตอนเที่ยง");

        String date = name.getdate();
        String timer;

        try {
            timer = name.gettimernoon();
            String t = "T";
//        String a = date+t+timer;
            String drugsnoon = date+t+timer;
            DateTime startDateTime = new DateTime(drugsnoon+":00+07:00");
            EventDateTime start = new EventDateTime()
                    .setDateTime(startDateTime)
                    .setTimeZone("Asia/Bangkok");
            Add_Drung.setStart(start);

            DateTime endDateTime = new DateTime(drugsnoon+":00+07:00");
            EventDateTime end = new EventDateTime()
                    .setDateTime(endDateTime)
                    .setTimeZone("Asia/Bangkok");
            Add_Drung.setEnd(end);

            String datetimeend = name.getdateend();
//            String drugsmorningtimeend = datetimeend+t+timer;
            String b = new String(String.valueOf(datetimeend));

            String a = new String(String.valueOf(b));//ตัดสตริงคอมม่า

            String[] arrB = a.split("-");
            System.out.println("DATETIMEEND" + arrB[0]);//ตัดสตริงคอมม่า
            System.out.println("DATETIMEEND1" + arrB[1]);//ตัดสตริงคอมม่า
            System.out.println("DATETIMEEND2" + arrB[2]);//ตัดสตริงคอมม่า
            String drugsmorningtimeend = arrB[0]+arrB[1]+arrB[2];
            System.out.println("DATETIME111111" + drugsmorningtimeend);//ตัดสตริงคอมม่า

//            Add_Drung.setRecurrence(Arrays.asList("RRULE:FREQ=WEEKLY;UNTIL=20110701T170000Z"));
            Add_Drung.setRecurrence(Arrays.asList("RRULE:FREQ=DAILY;UNTIL="+drugsmorningtimeend+"T170000Z"));

            Event createdEvent = client.events().insert("primary", Add_Drung).execute();
            System.out.println("Created event id: " + createdEvent.getId());
        } catch (NullPointerException e) {
            Log.d(TAG, "Drugs_noon");
        }
    }

    String drugseveng = "ทานยาตอนเย็น";

    public void Drugs_evening() throws IOException {
        Event Add_Drung = new Event()
                .setSummary(drugseveng)
                .setDescription("ทานยาตอนเย็น");

        String date = name.getdate();
        String timer;

        try {
            timer = name.gettimerevening();
            String t = "T";
//        String a = date+t+timer;
            String drugseveng = date+t+timer;
            DateTime startDateTime = new DateTime(drugseveng+":00+07:00");
            EventDateTime start = new EventDateTime()
                    .setDateTime(startDateTime)
                    .setTimeZone("Asia/Bangkok");
            Add_Drung.setStart(start);

            DateTime endDateTime = new DateTime(drugseveng+":00+07:00");
            EventDateTime end = new EventDateTime()
                    .setDateTime(endDateTime)
                    .setTimeZone("Asia/Bangkok");
            Add_Drung.setEnd(end);

            String datetimeend = name.getdateend();
//            String drugsmorningtimeend = datetimeend+t+timer;
            String b = new String(String.valueOf(datetimeend));

            String a = new String(String.valueOf(b));//ตัดสตริงคอมม่า

            String[] arrB = a.split("-");
            System.out.println("DATETIMEEND" + arrB[0]);//ตัดสตริงคอมม่า
            System.out.println("DATETIMEEND1" + arrB[1]);//ตัดสตริงคอมม่า
            System.out.println("DATETIMEEND2" + arrB[2]);//ตัดสตริงคอมม่า
            String drugsmorningtimeend = arrB[0]+arrB[1]+arrB[2];
            System.out.println("DATETIME111111" + drugsmorningtimeend);//ตัดสตริงคอมม่า

//            Add_Drung.setRecurrence(Arrays.asList("RRULE:FREQ=WEEKLY;UNTIL=20110701T170000Z"));
            Add_Drung.setRecurrence(Arrays.asList("RRULE:FREQ=DAILY;UNTIL="+drugsmorningtimeend+"T170000Z"));

            Event createdEvent = client.events().insert("primary", Add_Drung).execute();
            System.out.println("Created event id: " + createdEvent.getId());
        } catch (NullPointerException e) {
            Log.d(TAG, "Drugs_evening");
        }

    }

    String drugsbefore = "ทานยาก่อนนอน";

    public void Drugs_before() throws IOException {
        Event Add_Drung = new Event()
                .setSummary(drugsbefore)
                .setDescription("ทานยาก่อนนอน");

        String date = name.getdate();
        String timer;

        try {
            timer = name.gettimerbefore();
            String t = "T";
//        String a = date+t+timer;
            String drugsbefore = date+t+timer;
            DateTime startDateTime = new DateTime(drugsbefore+":00+07:00");
            EventDateTime start = new EventDateTime()
                    .setDateTime(startDateTime)
                    .setTimeZone("Asia/Bangkok");
            Add_Drung.setStart(start);

            DateTime endDateTime = new DateTime(drugsbefore+":00+07:00");
            EventDateTime end = new EventDateTime()
                    .setDateTime(endDateTime)
                    .setTimeZone("Asia/Bangkok");
            Add_Drung.setEnd(end);

            String datetimeend = name.getdateend();
//            String drugsmorningtimeend = datetimeend+t+timer;
            String b = new String(String.valueOf(datetimeend));

            String a = new String(String.valueOf(b));//ตัดสตริงคอมม่า

            String[] arrB = a.split("-");
            System.out.println("DATETIMEEND" + arrB[0]);//ตัดสตริงคอมม่า
            System.out.println("DATETIMEEND1" + arrB[1]);//ตัดสตริงคอมม่า
            System.out.println("DATETIMEEND2" + arrB[2]);//ตัดสตริงคอมม่า
            String drugsmorningtimeend = arrB[0]+arrB[1]+arrB[2];
            System.out.println("DATETIME111111" + drugsmorningtimeend);//ตัดสตริงคอมม่า

//            Add_Drung.setRecurrence(Arrays.asList("RRULE:FREQ=WEEKLY;UNTIL=20110701T170000Z"));
            Add_Drung.setRecurrence(Arrays.asList("RRULE:FREQ=DAILY;UNTIL="+drugsmorningtimeend+"T170000Z"));

            Event createdEvent = client.events().insert("primary", Add_Drung).execute();
            System.out.println("Created event id: " + createdEvent.getId());
        } catch (NullPointerException e) {
            Log.d(TAG, "Drugs_before");
        }
    }

}



