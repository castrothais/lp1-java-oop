package ListasDeExercicios.Lista01.Questao01;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FuncionarioTest {
    Funcionario funcionario;

    @BeforeEach
    public void setup() {
        funcionario = new Funcionario();
    }

    @Test
    @DisplayName("Deve lançar exceção quando nome for nulo")
    void deveSerObrigatorioNome() {
        try {
            funcionario.setNome(null);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Nome é obrigatório!", e.getMessage());
        }
    }

    @Test
    @DisplayName("Deve lançar exceção quando nome for vazio")
    void deveLancarExcecaoQuandoNomeForVazio() {
        try {
            funcionario.setNome("");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Nome é obrigatório!", e.getMessage());
        }
    }

    @Test
    @DisplayName("Deve lançar exceção quando nome conter apenas espaço vazio")
    void deveFalharNomeComEspaco() {
        try {
            funcionario.setNome(" ");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Nome é obrigatório!", e.getMessage());
        }
    }


    @Test
    @DisplayName("Deve calcular aumento do salário")
    void deveCalcularAumento() {
        funcionario.setPercentualAumento(20.0f);
        funcionario.setSalario(1000.00f);
        assertEquals(200.0f, funcionario.calcularAumento());
    }

    @Test
    @DisplayName("Deve calcular o novo salário")
    void deveCalcularNovoSalario() {
        funcionario.setSalario(1000.0f);
        funcionario.setPercentualAumento(20.0f);
        assertEquals(1200.00f, funcionario.calculcarNovoSalario());
    }

    @Test
    @DisplayName("Deve lançar exceção se o salário for zero")
    void deveVerificarSalarioZerado() {
        try {
            funcionario.setSalario(0);
            fail();
        }
        catch (IllegalArgumentException e) {
            assertEquals("Salário inválido", e.getMessage());
        }
    }

    @Test
    @DisplayName("Deve lançar exceção quando o percentual de aumento for negativo")
    void deveVerificarPercentualAumentoNegativo() {
        try {
            funcionario.setPercentualAumento(-0.01f);
            fail();
        }
        catch (IllegalArgumentException e) {
            assertEquals("Percentual aumento inválido", e.getMessage());
        }
    }
}