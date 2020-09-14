package rest_assured_deserialization_pojo;

import java.util.List;

public class ResponsePage {
String page;
String per_page;
String total_pages;
String total;
List<Data> data;
Ad ad;



public ResponsePage() {
	
}
@Override
public String toString() {
	return "ResponsePage [page=" + page + ", per_page=" + per_page + ", total_pages=" + total_pages + ", data=" + data
			+ ", ad=" + ad + "]";
}
public String getPage() {
	return page;
}
public void setPage(String page) {
	this.page = page;
}
public String getTotal() {
	return total;
}
public void setTotal(String total) {
	this.total = total;
}

public String getPer_page() {
	return per_page;
}
public void setPer_page(String per_page) {
	this.per_page = per_page;
}
public String getTotal_pages() {
	return total_pages;
}
public void setTotal_pages(String total_pages) {
	this.total_pages = total_pages;
}
public List<Data> getData() {
	return data;
}
public void setData(List<Data> data) {
	this.data = data;
}
public Ad getAd() {
	return ad;
}
public void setAd(Ad ad) {
	this.ad = ad;
}




}
