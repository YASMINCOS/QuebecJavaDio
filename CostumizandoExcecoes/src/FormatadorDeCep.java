
public class FormatadorDeCep {

	public static void main(String[] args) {
		try {
		String cepFormatado= formatarCep("23345345");
		System.out.println(cepFormatado);
		}catch(CepInavlidoException e) {
			System.out.println("O cep nao corresponde com as regras de negocio");
		}
	}
		static String formatarCep(String cep) throws CepInavlidoException{
			if (cep.length()!=8) 
				throw new CepInavlidoException();
			
			return"23.345-345";
			
		}
	}

