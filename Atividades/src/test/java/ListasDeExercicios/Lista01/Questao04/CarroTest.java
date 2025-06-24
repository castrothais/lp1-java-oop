package ListasDeExercicios.Lista01.Questao04;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarroTest {
    Carro carro;

    @BeforeEach
    public void setUp() {
        carro = new Carro();
    }

    @Test
    @DisplayName("Deve calcular corretamente com os limites válidos baixos")
    void calcularMediaLimitesValidosBaixos() {
        carro.setCombustivelConsumido(0.1f);
        carro.setQuantidadeQuilometragem(0.1f);
        assertEquals(1.0, carro.calcularMediaCombustivel());
    }

    @Test
    @DisplayName("Deve calcular a média de combustível gasto pelo usuário")
    void calcularMediaCombustivel() {
        carro.setCombustivelConsumido(50);
        carro.setQuantidadeQuilometragem(1250);
        assertEquals(25, carro.calcularMediaCombustivel());
    }

    @Test
    @DisplayName("Deve lancar exceção ao informar o consumo de combustível negativo")
    void testarConsumoNegativo() {
        try{
            carro.setCombustivelConsumido(-0.01f);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Combustível consumido inválido!", e.getMessage());
        }
    }

    @Test
    @DisplayName("Deve lancar exceção ao informar quilometragem negativa")
    void testarQuiloetragemNegativa() {
        try{
            carro.setQuantidadeQuilometragem(-0.01f);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Quilometragem inválida!", e.getMessage());
        }
    }
}