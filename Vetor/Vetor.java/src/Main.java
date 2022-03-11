public class Main {
    public static void main(String[] args) {
    	
        int capacidade = 5;
        Vetor vetor = new Vetor(capacidade);
        
        try {
        	vetor.adicionar("Elemento 1");
            vetor.adicionar("Elemento 2 ");
            vetor.adicionar("Elemento 2 ");
            vetor.adicionar("Elemento 2 ");
           
            
            System.out.println(vetor.toString());
        } catch(Exception e){
        	e.printStackTrace();
        }
        
        
        
        
        
    }
	
}
