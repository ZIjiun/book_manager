package com.Kent.domain;

import java.util.List;

/**
 * 分頁訊息封裝類
 * @param <T>
 */
public class PageBean<T> {
    // 總紀錄數
    private int totalCount;

    // 當前頁資料
    private List<T> rows;

    public int getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(int totalCount) {
        this.totalCount = totalCount;
    }

    public List<T> getRows() {
        return rows;
    }

    public void setRows(List<T> rows) {
        this.rows = rows;
    }
}
