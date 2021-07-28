package cifrasyletras;

public class Ejemplo3 {
    public static void main (String[] args) {

       // ejemploCharAt();
       ejemploCompareTo();
       ejemploCompareToIgnoreCase();
      /*
      IMPLEMENTA PARA PROBAR LOS DISTINTOS MÉTODOS
      ejemploCOntaind();
       ejemploStartsWith();
       ejemploEndsWith();
       ejemploEqualsIgnoreCase();
       ejemploIndexOf();
       ejemploEmpty();
       ejemploLastIndexOf();
       ejemploLength();
       ejemploMatches();
       ejemploReplace();
       ejemploReplaceAll();
       ejemploReplaceFirst();
       ejemploSplit();
       ejemploStartsWith();
       ejemploSubstring();
       ejemploMayusculasMinusculas();
       ejemploTrim();
       ejemploValueOf();


       */





    }

    /*
    Indica cuántas veces aparece una letra en un texto
     */
    private static void ejemploCharAt() {
        String texto="texto de prueba";
        char letra='e';
        int cont=0;
        for (int i=0; i<texto.length();i++){
            if (texto.charAt(i)==letra){ //como es un char (tipo primitivo), podemos comparar con ==
                cont++;
            }
        }
        System.out.println ("La letra "+ letra + " aparece " + cont + " veces");
    }
    /*
    Ordena alfabéticamente
     */
    private static void ejemploCompareTo() {
        String cad1 = "DAM";
        String cad2 = "DaM";
        if (cad1.compareTo(cad2) < 0) {
            System.out.println ("Orden alfabético: "+ cad1 + ", "+cad2);
        } else if (cad1.compareTo(cad2) > 0) {
            System.out.println ("Orden alfabético: "+ cad2 + ", "+cad1);
        } else {
            System.out.println ("Son iguales");
        }
    }
    /*
    Ordena alfabéticamente sin tener en cuenta las mayúsculas o minúsculas
     */
    private static void ejemploCompareToIgnoreCase() {
        String cad1 = "DAM";
        String cad2 = "DaM";
        if (cad1.compareToIgnoreCase(cad2) < 0) {
            System.out.println ("Orden alfabético sin tener en cuenta las minúsculas o mayúsculas: "+ cad1 + ", "+cad2);
        } else if (cad1.compareToIgnoreCase(cad2) > 0) {
            System.out.println ("Orden alfabético sin tener en cuenta las minúsculas o mayúsculas: "+ cad2 + ", "+cad1);
        } else {
            System.out.println ("Son iguales");
        }
    }


}
