import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class ListOfUsersPOJO
{
    @JsonProperty("page")
    private long page;
    @JsonProperty("per_page")
    private long per_page;
    @JsonProperty("total")
    private long total;
    @JsonProperty("total_pages")
    private long total_pages;
    @JsonProperty("data")
    private List<Datum> data;

    @JsonProperty("support")
    public Support Support;

    public long getPage() {
        return page;
    }

    public void setPage(long page) {
        this.page = page;
    }

    public long getPer_page() {
        return per_page;
    }

    public void setPer_page(long per_page) {
        this.per_page = per_page;
    }

    public long getTotal() {
        return total;
    }

    public void setTotal(long total) {
        this.total = total;
    }

    public long getTotal_pages() {
        return total_pages;
    }

    public void setTotal_pages(long total_pages) {
        this.total_pages = total_pages;
    }

    public List<Datum> getData() {
        return data;
    }

    public void setData(List<Datum> data) {
        this.data = data;
    }

    public Support getSupport() {
        return Support;
    }

    public void setSupport(Support support) {
        Support = support;
    }

    @Override
    public String toString() {
        return "ListOfUsersPOJO{" +
                "page=" + page +
                ", per_page=" + per_page +
                ", total=" + total +
                ", total_pages=" + total_pages +
                ", data=" + data +
                ", Support=" + Support +
                '}';
    }
}