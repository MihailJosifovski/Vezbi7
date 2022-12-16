package zadacha3;

public class SportskiKlub implements Comparable<SportskiKlub> {
	private String ime;
	private String sport;
	private int brChlenovi;
	public SportskiKlub (String ime, String sport, int brChlenovi) {
		this.ime = ime;
		this.sport = sport;
		this.brChlenovi = brChlenovi;
	}
	
	public String getIme() {
		return ime;
	}
	public void setIme(String ime) {
		this.ime = ime;
	}
	public String getSport() {
		return sport;
	}
	public void setSport(String sport) {
		this.sport = sport;
	}
	public int getBrChlenovi() {
		return brChlenovi;
	}
	public void setBrChlenovi(int brChlenovi) {
		this.brChlenovi = brChlenovi;
	}
	public int compareTo(SportskiKlub obj) {
		SportskiKlub a = (SportskiKlub) obj;
		if(this.ime == a.ime) {
			return 0;
		}
		else {
			return this.ime.compareTo(a.ime);
		}
	}
}
