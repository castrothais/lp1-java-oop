package ListasDeExercicios.Lista01.Questao05;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PessoaTest {

    Pessoa pessoa;

    @BeforeEach
    public void setUp() {
        pessoa = new Pessoa();
    }

    @Test
    public void deveLancarExcecaoSexoInformadoErrado(){
        try {
            pessoa.setSexo("Feminina");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Sexo é obrigatório!", e.getMessage());
        }
    }

    @Test
    public void deveLancarExcecaoSexoNulo() {
        try {
            pessoa.setSexo(null);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Sexo é obrigatório!", e.getMessage());
        }
    }

    @Test
    public void deveAceitarSexoInformadoCorretamenteFeminino() {
        pessoa.setSexo("feminino");
        assertEquals("feminino", pessoa.getSexo());
    }

    @Test
    public void deveAceitarSexoInformadoCorretamenteMasculino() {
        pessoa.setSexo("masculino");
        assertEquals("masculino", pessoa.getSexo());
    }

    @Test
    public void deveLancarExcecaoPesoInvalidoMenorOuIgualZero() {
        try {
            pessoa.setPeso(0f);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Peso inválido!", e.getMessage());
        }
    }

    @Test
    public void deveLancarExcecaoPesoNegativo() {
        try {
            pessoa.setPeso(-1f);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Peso inválido!", e.getMessage());
        }
    }

    @Test
    public void deveAceitarPesoValido() {
        pessoa.setPeso(50f);
        assertEquals(50f, pessoa.getPeso());
    }

    @Test
    public void deveLancarExcecaoAlturaIgualZero() {
        try {
            pessoa.setAltura(0f);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Altura inválida!", e.getMessage());
        }
    }

    @Test
    public void deveLancarExcecaoAlturaNegativa() {
        try {
            pessoa.setAltura(-1f);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Altura inválida!", e.getMessage());
        }
    }

    @Test
    public void deveAceitarAlturaValida() {
        pessoa.setAltura(1.75f);
        assertEquals(1.75f, pessoa.getAltura(), 0.001f);
    }

    @Test
    public void deveCalcularIMCCorretamente() {
        pessoa.setPeso(70f);
        pessoa.setAltura(1.75f);
        float imcCalculado = pessoa.calcularIndiceMassaCorporal();
        assertEquals(22.86, imcCalculado, 0.01);
    }

}