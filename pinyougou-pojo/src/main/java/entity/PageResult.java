package entity;

import java.io.Serializable;
import java.util.List;

/**
 * 分页结果封装实体
 */
public class PageResult implements Serializable {

    //总记录数
    private long total;

    //当前页结果
    private List rows;

    public void setTotal(long total) {
        this.total = total;
    }

    public void setRows(List rows) {
        this.rows = rows;
    }

    public long getTotal() {
        return total;
    }

    public List getRows() {
        return rows;
    }

    public PageResult(long total, List rows) {
        this.total = total;
        this.rows = rows;
    }

    @Override
    public String toString() {
        return "PageResult{" +
                "total=" + total +
                ", rows=" + rows +
                '}';
    }
}
