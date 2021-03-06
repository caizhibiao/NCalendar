package necer.ncalendardemo.activity;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.TextView;

import com.necer.ncalendar.calendar.MonthCalendar;
import com.necer.ncalendar.listener.OnMonthCalendarChangedListener;

import org.joda.time.DateTime;

import necer.ncalendardemo.R;

/**
 * Created by 闫彬彬 on 2017/9/27.
 * QQ:619008099
 */

public class MonthSelectActivity extends Activity {

    private MonthCalendar monthcalendar;
    private TextView dateText;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);

        dateText = (TextView) findViewById(R.id.tv_date);

        monthcalendar = (MonthCalendar) findViewById(R.id.monthcalendar);
        monthcalendar.setOnMonthCalendarChangedListener(new OnMonthCalendarChangedListener() {
            @Override
            public void onMonthCalendarChanged(DateTime dateTime) {
                dateText.setText(dateTime.toLocalDate().toString());
            }
        });

    }


    public void toLastMonth(View view) {
        monthcalendar.toLastPager();

    }

    public void toNextMonth(View view) {
        monthcalendar.toNextPager();
    }

    public void toToday(View view) {
        monthcalendar.toToday();
    }

    public void setDate(View view) {
        monthcalendar.setDate("2018-10-11");
    }
}
