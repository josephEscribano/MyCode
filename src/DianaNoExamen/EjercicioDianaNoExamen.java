package DianaNoExamen;

public class EjercicioDianaNoExamen {
    public static int diana(double x, double y){
        int resultado = 0;
        double radio = Math.sqrt(Math.pow(x,2) + Math.pow(y,2));

        if (/*1*/radio <= 10){
            /*2*/resultado = 5;
        }else if (/*3*/radio <= 20){
            if (/*4*/x * y > 0){
                /*6*/resultado = 3;
            }else{
                /*7*/resultado = 2;
            }
        }else if (/*5*/radio <= 30){
            /*8*/resultado = 1;
        }else{
            /*9*/resultado = 0;
        }

        return /*10*/resultado;

    }
}
