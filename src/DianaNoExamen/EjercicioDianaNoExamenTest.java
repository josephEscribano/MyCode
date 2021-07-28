package DianaNoExamen;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EjercicioDianaNoExamenTest {

    @Test
    void diana() {
        // camino 1
        int resultadoEsperado = 5;
        int resultadoObtenido = EjercicioDianaNoExamen.diana(1,1);
        assertEquals(resultadoEsperado,resultadoObtenido);
        //camino 2

        resultadoEsperado = 3;
        resultadoObtenido = EjercicioDianaNoExamen.diana(10,10);
        assertEquals(resultadoEsperado,resultadoObtenido);

        //camino 3

        resultadoEsperado = 2;
        resultadoObtenido = EjercicioDianaNoExamen.diana(-10,10);
        assertEquals(resultadoEsperado,resultadoObtenido);

        //camino 4

        resultadoEsperado = 1;
        resultadoObtenido = EjercicioDianaNoExamen.diana(20,20);
        assertEquals(resultadoEsperado,resultadoObtenido);

        // camino 5

        resultadoEsperado = 0;
        resultadoObtenido = EjercicioDianaNoExamen.diana(40,40);
        assertEquals(resultadoEsperado,resultadoObtenido);
    }
}