import java.util.Arrays;

public class Vetor {

    private String[] elementos; // Elementos do vetor
    private int tamanho; // Tamanho do vetos

    // Construtor para o usuario passa a capacidade do vetor
    public Vetor (int capacidade){
        elementos = new String[capacidade];
        tamanho = 0;
    }
    
    /*public void adicionar(String elemento) {
    	for(int i = 0; i < elementos.length; i++) { // Percorre o vetor
    		if(elementos[i] == null) { // Se estiver vazio adiciona
    			elementos[i] = elemento;
    			tamanho++;
    			break;
    		}
    	}
    }*/
    
    public void adicionar(String elemento) throws Exception {
    	if(tamanho <elementos.length) {
    		elementos[tamanho] = elemento;
    		tamanho++;
    	} else {
    		throw new Exception("Vetor está cheio");
    	}
    }
    
    /*public boolean adicionar(String elemento) throws Exception {
    	if(tamanho <elementos.length) {
    		elementos[tamanho] = elemento;
    		tamanho++;
    		return true;
    	} else {
    		return false;
    	}
    }*/
    
	@Override
	public String toString() {
		
		StringBuffer s = new StringBuffer();
		s.append("[");
		
		for(int i = 0; i < tamanho-1; i++) {
			s.append(elementos[i]);
			s.append(", ");
		}
		
		if(tamanho > 0) {
			s.append(elementos[tamanho-1]);
		}
		
		s.append("]");		
		return s.toString();
	}
    
}