package com.app.cbonelo.mobile.Driver.Stock_allocate;

public class ListViewItemDTO {

    private boolean checked = false;

    private String itemText = "";

    public ListViewItemDTO() {
    }

    public boolean isChecked() {
        return checked;
    }

    public void setChecked(boolean checked) {
        this.checked = checked;
    }

    public String getItemText() {
        return itemText;
    }

    public void setItemText(String itemText) {
        this.itemText = itemText;
    }
}