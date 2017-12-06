package com.programmingplum.thegradingbuddy;

/**
 * Created by deric on 10/20/17.
 */

public class Class {
    private String _title;
    private String _number;

    public Class(String title, String number) {
        this._title = title;
        this._number = number;
    }

    /**
     * getTitle
     *
     * @return
     */
    public String getTitle() {
        return _title;
    }

    /**
     * getNumber
     *
     * @return
     */
    public String getNumber() {
        return _number;
    }

    /**
     * setTitle
     * @param _title
     */
    public void setTitle(String _title) {
        this._title = _title;
    }

    /**
     * setNumber
     * @param _number
     */
    public void setNumber(String _number) {
        this._number = _number;
    }

    @Override
    public String toString() {
        return String.format("%s, %s", _title, _number);
    }
}
