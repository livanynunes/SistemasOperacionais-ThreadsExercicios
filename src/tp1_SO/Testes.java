package tp1_SO;

public class Testes {

	public static void main(String[] args) {
		
/////EXERCICIO A-1 RACE CONDITIONAL/////////////////////////////
//		Race_Conditional_Simple testeA1 = new Race_Conditional_Simple();	// duas threads implementam o mesmo contador, SEM tratamento de colis�o
//		testeA1.resultado();
		
/////EXERCICIO A-2 RACE CONDITIONAL RESOLVIDO/////////////////
		RaceConditional_Peterson testeA2 = new RaceConditional_Peterson();	// duas threads implementam o mesmo contador, COM tratamento de colis�o

/////EXERCICIO B LIMITED BUFFER/////////////////
       // Q q = new Q(); 		// cria pilha (buffer) 
       // new Consumer(q);	// inicia thread consumidor 
        //new Producer(q);	// inicia thread produtor 
	}
}
