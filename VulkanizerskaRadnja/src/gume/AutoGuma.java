package gume;

/**
 * Klasa koja predstavlja automobilsku gumu
 * 
 * @version 1.0
 * @author Marko Kastratovic
 * 
 */
public class AutoGuma {
	/**
	 * Marka gume
	 */
	private String markaModel = null;
	/**
	 * Precnik gume
	 */
	private int precnik = 0;
	/**
	 * Sirina gume
	 */
	private int sirina = 0;
	/**
	 * Visina gume
	 */
	private int visina = 0;

	/**
	 * Vraca vrednost atributa markaModel
	 * 
	 * @return markaModel
	 */
	public String getMarkaModel() {
		return markaModel;
	}

	/**
	 * Postavlja novu vrednost za atribut markaModel
	 * 
	 * @param markaModel nova vrednost za marku gume
	 * @throws java.lang.RuntimeException ako je
	 * unet null String ili je unet String kraci od 3 karaktera
	 */
	public void setMarkaModel(String markaModel) {
		if (markaModel == null || markaModel.length() < 3)
			throw new RuntimeException("Morate uneti marku i model");
		this.markaModel = markaModel;
	}

	/**
	 * Vraca vrednost atributa precnik gume
	 * 
	 * @return precnik gume
	 */
	public int getPrecnik() {
		return precnik;
	}

	/**
	 * Postavlja novu vrednost atributa precnik gume
	 * 
	 * @param precnik gume
	 * @throws java.lang.RuntimeException 
	 * ako je unet precnik manji od 13 ili veci od 22
	 */
	public void setPrecnik(int precnik) {
		if (precnik < 13 || precnik > 22)
			throw new RuntimeException("Precnik van opsega");
		this.precnik = precnik;
	}

	/**
	 * Vraca vrednost atributa sirina
	 * @return sirina gume
	 */
	public int getSirina() {
		return sirina;
	}
	/**
	 * Postavlja novu vrednost atributa sirina gume
	 * @param sirina gume
	 * @throws java.lang.RuntimeException 
	 * ako je uneta sirina manja od 135 ili
	 * veca od 355
	 */
	public void setSirina(int sirina) {
		if (sirina < 135 || sirina > 355)
			throw new RuntimeException("Sirina van opsega");
		this.sirina = sirina;
	}
	/**
	 * Vraca vrednost atributa visina gume
	 * @return visina gume
	 */
	public int getVisina() {
		return visina;
	}
	/**
	 * Postavlja novu vrednost atributa visina gume
	 * @param visina gume
	 * @throws java.lang.RuntimeException ako je uneta:
	 * <ul> 
	 * 
	 * <li>visina manja od 25</li>
	 * 
	 * <li>visina veca od 95</li>
	 * 
	 * </ul>
	 */
	public void setVisina(int visina) {
		if (visina < 25 || visina > 95)
			throw new RuntimeException("Visina van opsega");
		this.visina = visina;
	}
	/**
	 * Vraca String sa podacima o gumi
	 */
	@Override
	public String toString() {
		return "AutoGuma [markaModel=" + markaModel + ", precnik=" + precnik + ", sirina=" + sirina + ", visina="
				+ visina + "]";
	}
	/**
	 * Uporedjuje 2 objekta klase auto guma po
	 * atributima markaModel,precnik,sirina,visina
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AutoGuma other = (AutoGuma) obj;
		if (markaModel == null) {
			if (other.markaModel != null)
				return false;
		} else if (!markaModel.equals(other.markaModel))
			return false;
		if (precnik != other.precnik)
			return false;
		if (sirina != other.sirina)
			return false;
		if (visina != other.visina)
			return false;
		return true;
	}
}
