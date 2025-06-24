package ListasDeExercicios.Lista01.Questao03;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContaEnergiaTest {
    ContaEnergia contaEnergia;

    @BeforeEach
    public void setUp() {
        contaEnergia =  new ContaEnergia();
    }

    @Test
    @DisplayName("Deve calcular o valor da conta de energia")
    void calcularConsumoEnergia() {
        contaEnergia.setQuilowattsConsumidos(350);
        assertEquals(42, contaEnergia.calcularConsumoEnergia());
    }

    @Test
    @DisplayName("Deve calcular o valor da conta de energia com os tributos")
    void calcularConsumoEnergiaTributos() {
        contaEnergia.setQuilowattsConsumidos(350);
        assertEquals(49.56, contaEnergia.calcularConsumoEnergiaTributos(), 0.001f);
    }

    @Test
    @DisplayName("Deve lançar exceção ao informar quilowatt negativo")
    void testarQuilowattNegativo() {
        try {
            contaEnergia.setQuilowattsConsumidos(-0.01f);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Consumo de quilowatts inválido!", e.getMessage());
        }
    }

}