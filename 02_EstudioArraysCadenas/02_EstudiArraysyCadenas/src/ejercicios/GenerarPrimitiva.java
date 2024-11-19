package ejercicios;

public class GenerarPrimitiva {
    public GenerarPrimitiva(){
        System.out.println("---PRIMITIVA---");
        int max = 6, min = 1, cant = 6;
        int[] primi = generaPrimitiva(max, min, cant);
        for (int i = 0; i < primi.length; i++) {
            System.out.printf("%d-", primi[i]);
        }

    }

    private int[] generaPrimitiva(int max, int min, int cant) {

        int[] primi = new int[cant];
        boolean repetido;

        for (int i = 0; i < cant; i++) {
            int ale;
            do {
                ale = (int) Math.floor(Math.random() * (max - min + 1) + min);
                repetido = false;

                // Duplicados
                for (int j = 0; j < i; j++) {
                    if (ale == primi[j]) {
                        repetido = true;
                        break;
                    }
                }
            } while (repetido);

            primi[i] = ale;
        }

        return primi;
    }
    }


