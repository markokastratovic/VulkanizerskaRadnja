package gume.radnja;
/**
 * @author Marko Kastratovic
 * 
 */
import java.util.LinkedList;
import gume.AutoGuma;

public class VulkanizerskaRadnja {
	/**
	 * Lista guma
	 */
	private LinkedList<AutoGuma> gume = new LinkedList<AutoGuma>();
	/**
	 * Dodaje novu gumu u na pocetak liste guma
	 * @param a nova guma
	 * @throws NullPointerException ako je nova guma null
	 * @throws RuntimeException ako se nova guma vec nalazila u listi guma
	 */
	public void dodajGumu(AutoGuma a) {
		if (a == null)
			throw new NullPointerException("Guma ne sme biti null");
		if (gume.contains(a))
			throw new RuntimeException("Guma vec postoji");
		gume.addFirst(a);
	}
	/**
	 * Pronalazi gumu prema MarkiModelu u listi guma
	 * @param markaModel trazene gume
	 * @return null ako je trazena guma ima null vrednost
	 * @return novaLista guma(koja sadrzi sve gume koje imaju trazeni naziv MarkaModel)
	 */
	public LinkedList<AutoGuma> pronadjiGumu(String markaModel) {
		if (markaModel == null)
			return null;
		LinkedList<AutoGuma> novaLista = new LinkedList<AutoGuma>();
		for (int i = 0; i < gume.size(); i++)
			if (gume.get(i).equals(markaModel))
				novaLista.add(gume.get(i));
		return novaLista;
	}
}
