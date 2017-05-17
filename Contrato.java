

import java.util.ArrayList;

public class Contrato {
	
	private float valorDoImovel;
	private ArrayList<Sinistro> listSinistro = new ArrayList<Sinistro>();
	
	
	public float getValorDoImovel() {
		return valorDoImovel;
	}
	public void setValorDoImovel(float valorDoImovel) {
		this.valorDoImovel = valorDoImovel;
	}
	public ArrayList<Sinistro> getListSinistro() {
		return listSinistro;
	}
	public void setListSinistro(ArrayList<Sinistro> listSinistro) {
		this.listSinistro = listSinistro;
	}
	
}
