package ListasDeExercicios.Lista01.Questao02;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FuncionarioTest {
    Funcionario funcionario;
    @BeforeEach
    public void setup() {
        funcionario = new Funcionario();
    }

    @Test
    void deveVerificarSalarioZerado() {
        try {
            funcionario.setSalarioBruto(0.0f);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Salário inválido!", e.getMessage());
        }
    }

    @Test
    void deveVerificarSalarioValido() {
        funcionario.setSalarioBruto(0.1f);
        assertEquals(0.1f, funcionario.getSalarioBruto(), 0.001f);
    }

    @Test
    void deveVerificarHoraExtraZerada() {
        try {
            funcionario.setValorHoraExtra(0.0f);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Valor de hora extra inválida!", e.getMessage());
        }
    }

    @Test
    void deveVerificarHoraExtraValida() {
        funcionario.setValorHoraExtra(0.1f);
        assertEquals(0.1f, funcionario.getValorHoraExtra(), 0.001f);
    }

    @Test
    void deveVerificarQuantidadeHoraExtraNegativa() {
        try {
            funcionario.setQuantidadeHorasExtras(-0.1f);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Quantidade hora extra inválida!", e.getMessage());
        }
    }

    @Test
    void deveVerificarQuantidadeHoraExtraValida() {
        funcionario.setQuantidadeHorasExtras(0.0f);
        assertEquals(0.0f, funcionario.getQuantidadeHorasExtras(), 0.001f);
    }

    @Test
    void deveCalcularPagamentoHoraExtra() {
        funcionario.setQuantidadeHorasExtras(12.0f);
        funcionario.setValorHoraExtra(2.00f);
        assertEquals(24.00f, funcionario.calcularPagamentoHorasExtras());
    }

    @Test
    void deveCalcularSalarioLiquido() {
        funcionario.setSalarioBruto(1200.00f);
        funcionario.setQuantidadeHorasExtras(12.00f);
        funcionario.setValorHoraExtra(2.00f);
        funcionario.calculcarSalarioLiquido();
        assertEquals(1126.08f, funcionario.calculcarSalarioLiquido(), 0.001f);
    }

}