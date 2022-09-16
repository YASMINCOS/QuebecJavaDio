package jUnitaplicacao;

import java.time.LocalDate;
import java.time.LocalDateTime;

import org.junit.Test;

public class PessoaTest {

	@Test
	void deveCalcularIdadeCorretamente() {
		Pessoa jessica=new Pessoa("jessica", LocalDateTime.of(2000,12, 2, 5, 6, 1, 1));
		Assertions.assertEquals(22,jessica.getIdade());
	}
}
