package rest_assured_complex_serialization;

public class Data {
	private String captial;
	private int mintemp;
	private int maxtemp;
	private String curreny;
	public Data(String captial,int mintemp,int maxtemp,String curreny){
		this.captial=captial;
		this.mintemp=mintemp;
		this.maxtemp=maxtemp;
		this.curreny=curreny;
		
	}
	public String getCaptial() {
		return captial;
	}
	public void setCaptial(String captial) {
		this.captial = captial;
	}
	public int getMintemp() {
		return mintemp;
	}
	public void setMintemp(int mintemp) {
		this.mintemp = mintemp;
	}
	public int getMaxtemp() {
		return maxtemp;
	}
	public void setMaxtemp(int maxtemp) {
		this.maxtemp = maxtemp;
	}
	public String getCurreny() {
		return curreny;
	}
	public void setCurreny(String curreny) {
		this.curreny = curreny;
	}
}
