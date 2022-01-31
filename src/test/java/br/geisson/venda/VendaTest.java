package br.geisson.venda;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Teste de vendas")
public class VendaTest {

    @AfterEach
    public void afterEach() {
        // executado depois que cada método de teste é executado
        System.out.println("After each");
    }

    @AfterAll
    public static void afterAll() {
        // executado após todos os métodos desta classe estarem testado
        System.out.println("After all");
    }

    @Test
    @DisplayName("Teste de valor de venda")
    public void T001_venda() {
        Venda venda = new Venda(0.45, 0.1);
        venda.addItem("Coca cola", 10.0);
        assertEquals(venda.getValorBruto(), 4.5);
        assertEquals(venda.getLucro(), 1.0);
        assertEquals(venda.getTaxa(), 4.5);
    }

    @Test
    @DisplayName("Teste de taxa de venda")
    public void T002_venda() {
        Venda venda = new Venda(0.2, 0.1);
        venda.addItem("Coca cola", 10.0);
        assertEquals(venda.getTaxa(), 2.0);
    }
}
