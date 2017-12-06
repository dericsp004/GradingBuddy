package com.programmingplum.thegradingbuddy;

/**
 * Created by deric on 10/20/17.
 */

public class RubricFactory {


    private String _rubricTitle;

    public RubricFactory(String rubricTitle) {
        this._rubricTitle = rubricTitle;
    }

    public String getRubricTitle() {
        return _rubricTitle;
    }

    public void setRubricTitle(String _rubricTitle) {
        this._rubricTitle = _rubricTitle;
    }

    @Override
    public String toString() {
        return _rubricTitle;
    }
}
