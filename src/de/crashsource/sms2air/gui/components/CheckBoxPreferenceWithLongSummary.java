package de.crashsource.sms2air.gui.components;

import android.content.Context;
import android.preference.CheckBoxPreference;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;

/**
 * 
 * @author Fabian Mueller, .crashsource, 2010
 * 
 */
public class CheckBoxPreferenceWithLongSummary extends CheckBoxPreference {
	public CheckBoxPreferenceWithLongSummary(Context context) {
        super(context);
    }

    public CheckBoxPreferenceWithLongSummary(Context context, AttributeSet attrs) {
        super(context, attrs);
    }
    public CheckBoxPreferenceWithLongSummary(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    @Override
    protected void onBindView(View view) {
        super.onBindView(view);
        TextView summaryView = (TextView) view.findViewById(android.R.id.summary);
        summaryView.setMaxLines(10);
    }
}
